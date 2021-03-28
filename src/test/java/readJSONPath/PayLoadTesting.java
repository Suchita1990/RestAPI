package readJSONPath;
import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
public class PayLoadTesting {

	public static void main(String[] args) {
		
		String nameNumber = "Suchita";
        String isbnNumber = "isbn123";
        String aisleNumber = "114";
        String authourName = "Avinash";
        
        String updatedBody = String.format(PayLoadForTesting.getAddBookPayLoad(), nameNumber ,isbnNumber,aisleNumber,authourName);

	//	String body = PayLoadForTesting.getAddBookPayLoad();
        
		System.out.println(updatedBody);
		
		String expectedId = isbnNumber+aisleNumber;
		System.out.println("ExpectedId is :"+expectedId);
		
		String response = given().log().all()
		.contentType(ContentType.JSON)
		.body(updatedBody)
		.when()
		.post("http://216.10.245.166/Library/Addbook.php")
		.then()
		.log().all()
		.extract().asString();
		
		JsonPath js = new JsonPath(response);
		String bookId = js.getString("ID");
	//	Assert.assertEquals(bookId, PayLoadForTesting.getAddBookPayLoad(),isbnNumber + aisleNumber);
		
		Assert.assertTrue(expectedId.equals(bookId) ,"Id and Aisle Number doesn't match");
		
		
		
		

	}

}
