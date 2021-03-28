package restAssuredLib;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
public class PathParam {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://dummy.restapiexample.com";
		getPathParam();
	}
  
	public static void getPathParam() {
		
		/*RestAssured.baseURI = "http://dummy.restapiexample.com";*/
		final String GET_EMP_BY_ID_ENDPIONT = "/api/v1/employee/{id}";
		
		/*given().log().all()
		.pathParam("id", "2")
		.contentType(ContentType.JSON)
		.when()
		.get("http://dummy.restapiexample.com/api/v1/employee/{id}")
		.then()
		.log().all();*/
		
		given().log().all()
		.pathParam("id", "2")
		.contentType(ContentType.JSON)
		.when()
		.get(GET_EMP_BY_ID_ENDPIONT)
		.then()
		.log().all();
		

	}
}
