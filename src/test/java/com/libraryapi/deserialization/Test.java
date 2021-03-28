package com.libraryapi.deserialization;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class Test {

	public static void main(String[] args) {
		AddBook book = new AddBook();
		book.setName("Harry Potter and the Chamber of Secretes");
		book.setIsbn("HPB12111127");
		book.setAisle("090009010");
		book.setAuthor("Suchita");
		
	/*	AddbookResponse response = new AddbookResponse();
		System.out.println("Before deserialization message : " + response.getMsg());
		
		 response =
	    	given().log().everything()
           .contentType(ContentType.JSON)
           .body(book)
           .when()
           .post("http://216.10.245.166/Library/Addbook.php")
           .then().log().all().extract().as(AddbookResponse.class);
	 System.out.println("After deserialization message : " + response.getMsg());
	}
*/
		given().log().everything()
        .contentType(ContentType.JSON)
        .body(book)
        .when()
        .post("http://216.10.245.166/Library/Addbook.php")
        .then().log().all();
        } 
	}