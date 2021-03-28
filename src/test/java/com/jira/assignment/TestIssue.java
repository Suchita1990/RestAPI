package com.jira.assignment;

import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.filter.session.SessionFilter;
import io.restassured.http.ContentType;

public class TestIssue {

	public static void main(String[] args) {
		String attachment="rest/api/2/issue/{key}/attachments";
		
		Credential data = new Credential();
		data.setUsername("suchitadorage");
		data.setPassword("Jira@123");
		
		
		SessionFilter sessionfilter = new SessionFilter();
		
		 given().log().all()
			.contentType(ContentType.JSON)
			.filter(sessionfilter)
			.body(data)
			.when()
			.post("http://localhost:8080/rest/auth/1/session")
			.then()
			.statusCode(200)
			.log().all();
			
		 
		Issuetype issue = new Issuetype();
		issue.setName("Story");
		
					
		Project project = new Project();
		project.setKey("SUC");
    	
		Fields fields = new Fields();
		fields.setProject(project);
		fields.setSummary("Summary for Issue");
		fields.setIssuetype(issue);
		fields.setDescription("Simple bug");
		
		Field field = new Field();
		field.setFields(fields);
		
		Jiraresponse response = new Jiraresponse();
			
		response=given().log().everything()
		.contentType(ContentType.JSON)
		.filter(sessionfilter)
        .body(field)
        .when()
        .post("http://localhost:8080/rest/api/2/issue")
        .then().log().all().extract().as(Jiraresponse.class);
		
		
		System.out.println(response.getId());
		System.out.println(response.getKey());
		System.out.println(response.getSelf());
		
		File fileObject=new File("C:\\Users\\Shree\\Documents\\Sheet1.xlsx");
		
		//Create Attachment >> Jira Api
		given().log().all()
		.pathParam("key", response.getKey())
		.header("Content-Type","multipart/form-data") 
		.header("X-Atlassian-Token","nocheck")
		.multiPart("file",fileObject)
		.filter(sessionfilter)
		.when().post(attachment)
		.then().log().all()
		.assertThat().statusCode(200)
		.extract().body().asString();
		System.out.println("Attachment is Uploaded");
		
	}

}
