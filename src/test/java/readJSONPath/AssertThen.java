package readJSONPath;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;

import io.restassured.http.ContentType;

public class AssertThen {

	public static void main(String[] args) {
		String nameNumber = "Suchita";
        String isbnNumber = "isbn123";
        String aisleNumber = "1040";
        String authourName = "Avinash";
        
        String updatedBody = String.format(PayLoadForTesting.getAddBookPayLoad(), nameNumber ,isbnNumber,aisleNumber,authourName);

	//	String body = PayLoadForTesting.getAddBookPayLoad();
        
		System.out.println(updatedBody);
		
		 given().log().all()
		.contentType(ContentType.JSON)
		.body(updatedBody)
		.when()
		.post("http://216.10.245.166/Library/Addbook.php")//domain name and resource path
		.then()
		.statusCode(200)
		.log().all()
		.assertThat()
		.body("Msg", Matchers.equalTo("successfully added"))
		.body("ID", Matchers.equalTo(isbnNumber + aisleNumber));

	}

}
