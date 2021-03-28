package restAssuredLib;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;

public class FirstCode {
	public static void main(String[] args) {
		FirstCode fc = new FirstCode();
		fc.addBookByPost();
		fc.getBookByGet();
	}
	public void addBookByPost() {
		System.out.println("First Test");
        given()
        .contentType(ContentType.JSON)
        .body(TestData.getAddBookPayload())
        .log().all()
        .when()
        .post("http://216.10.245.166/Library/Addbook.php")
        .then()
        .log().all();

	}
	
	public void getBookByGet() {
		given().log().all().when().get("http://216.10.245.166/Library/GetBook.php?AuthorName=Suchita")
		.then().log().all();

	}

}
