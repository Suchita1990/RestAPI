package restAssuredLib;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class MultiQueryparam {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://216.10.245.166";
		getQuryParameter();
		

	}
	
	public static void getQuryParameter() {
		 final String GET_BOOK_BY_NAME_ENDPIONT = "/Library/GetBook.php";
		 
		 Map map = new HashMap<String, String>();
		   map.put("name", "Suchita");
		   map.put("course", "Java");
		   map.put("course1", "Restapi");  
				   
		 String response=given().log().all()
			.queryParams(map)
			.contentType(ContentType.JSON)
			.when()
			.get(GET_BOOK_BY_NAME_ENDPIONT)
			.then()
			.log().all()
			.extract().asString();
		 System.out.println(response);

}
}
 