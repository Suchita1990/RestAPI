package com.serilaization.practice;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class Runnerclass {

	public static void main(String[] args) {
		
	   Thumbnail thumb = new Thumbnail();
		thumb.setUrl("images/thumbnails/0001.jpg");
		thumb.setWidth(32);
		thumb.setHeight(32);
		
		Images image = new Images();
		image.setUrl("images/thumbnails/0001.jpg");
		image.setWidth(200);
		image.setHeight(200);
	   
		
		Product product = new Product();
		 product.setId("0001");
		 product.setType("donut");
		 product.setName("Cake");
		 product.setImg(image);
		 product.setThumb(thumb);
		
		
		 
		 given().log().everything()
	        .contentType(ContentType.JSON)
	        .body(product)
	        .when()
	        .post("http://216.10.245.166/Library/Addbook.php")
	        .then().log().all();
	}

}
