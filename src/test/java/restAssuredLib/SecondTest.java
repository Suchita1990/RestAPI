package restAssuredLib;

import static io.restassured.RestAssured.given;

import java.net.URI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class SecondTest {

	
	public static void main(String[] args) {
		addDetailsByPost();
		getDetailsByGet();
		
	}
		public static void addDetailsByPost() {
			
			System.out.println("Second Test");
	         given()
	        .header("Authorization", "Bearer 67b47d31d0db5376b5d8f5317e5e0ab335422d552c55d4a98d94db1bc498ddd5")
	        .contentType(ContentType.JSON)
	        .body(TestDataDemo.getDetailPayload())
	        .log().all()
	        .when()
	        .post("https://gorest.co.in/public-api/users")
	        .then()
	        .log().all();

		}
		
		public static void getDetailsByGet() {
			given().header("Authorization" , "Bearer 67b47d31d0db5376b5d8f5317e5e0ab335422d552c55d4a98d94db1bc498ddd5")
			.log().all()
			.when()
			.get("https://gorest.co.in/public-api/users")
			.then().log().all();

		}
		
	}


