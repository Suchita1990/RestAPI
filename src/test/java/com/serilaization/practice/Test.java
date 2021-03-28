package com.serilaization.practice;

import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;



public class Test {

	public static void main(String[] args) {
		Engine engine = new Engine();
		engine.setPower("140 BPH");
		engine.setCc("80");
		
		FourWheeler fw = new FourWheeler();
		fw.setName("XUV500");
		fw.setMake("Mahindra");
     	fw.setEngine(engine);
     	
     	given().log().everything()
        .contentType(ContentType.JSON)
        .body(fw)
        .when()
        .post("http://216.10.245.166/Library/Addbook.php")
        .then().log().all();
		
		

	}

}
