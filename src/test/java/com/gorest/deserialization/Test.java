package com.gorest.deserialization;

import static io.restassured.RestAssured.given;


import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;

public class Test {

	public static void main(String[] args) {
		AddUser user = new AddUser();
		user.setName("Tenali as Ramakrishna");
		user.setGender("Male");
		user.setMail("tenali.sasas.ramakrishna@1ce.com");
		user.setStatus("Active");
		
		UserResponse response = new UserResponse();
		System.out.println("Response before Deserialization :" + response.getData());
		
		response =   given().log().everything()
			        .contentType(ContentType.JSON)
			        .header("Authorization","Bearer d3ff59156616d67b3e0f5123bdebd6608519592d88a3b5430a2bcb2a09a04032")
			        .body(user)
			        .when()
			        .post("https://gorest.co.in/public-api/users")
			        .then().log().all().extract().as(UserResponse.class);

	System.out.println("Response After Desrialization is  : " + response.getData());
		
		

   }
}