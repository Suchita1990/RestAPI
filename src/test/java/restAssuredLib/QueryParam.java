package restAssuredLib;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class QueryParam {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://216.10.245.166";
		getQuryParameter();

	}
	
	 public static void getQuryParameter() {
		 final String GET_BOOK_BY_NAME_ENDPIONT = "/Library/GetBook.php";
		 String response=given().log().all()
			.queryParam("AuthorName", "Chinu")
			.contentType(ContentType.JSON)
			.when()
			.get(GET_BOOK_BY_NAME_ENDPIONT)
			.then()
			.log().all()
			.extract().asString();
		 System.out.println("Response of QueryParameter is :" +response);
		// Assert.assertEquals("Successful Added", "failed to add");
		 
		 Assert.assertTrue(response.contains("java"));
		 
				
   
	}

}
