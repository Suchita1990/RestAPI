package com.jira.assignment;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class CreateSession {

	
	
	public static void main(String[] args) {
		createSession();
		
	}

	 public static void createSession() {
		String response =
		 given().log().all()
		.contentType(ContentType.JSON)
		.body(Payload.getUser())
		.when()
		.post("http://localhost:8080/rest/auth/1/session")
		.then()
		.statusCode(200)
		.log().all()
		.extract().asString();
		
		JsonPath js = new JsonPath(response);
		String value = js.getString("B7D408C529986C23AAABA450EA7ABBC5");
		 // System.out.println(value);

	}
}
