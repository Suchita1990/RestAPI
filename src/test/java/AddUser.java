import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class AddUser {

	public static void main(String[] args) {
		RestAssured.baseURI = "https://gorest.co.in";
		getData();
		getById();
	}

	public static void getData() {
		 given()
	        .header("Authorization", "Bearer 67b47d31d0db5376b5d8f5317e5e0ab335422d552c55d4a98d94db1bc498ddd5")
	        .contentType(ContentType.JSON)
	        .body(Data.getData())
	        .log().all()
	        .when()
	        .post("/public-api/users")
	        .then()
	        .log().all()
		    .assertThat()
			.body("data.name", Matchers.containsString("Tenali as Ramakrishna"))
			.body("data.gender", Matchers.equalTo("Male"))
			.body("data.email", Matchers.containsString("@15ce.com"));

	 }
    public static void getById() {
    	given()
    	.header("Authorization" , "Bearer 67b47d31d0db5376b5d8f5317e5e0ab335422d552c55d4a98d94db1bc498ddd5")
		.log().all()
		.when()
		.get("/public-api/users/1488")
		.then().log().all();

}
}
