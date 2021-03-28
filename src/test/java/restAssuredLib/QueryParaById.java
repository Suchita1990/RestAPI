package restAssuredLib;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class QueryParaById {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://216.10.245.166"; 
		getQuryParameterById();

	}
	
	 public static void getQuryParameterById() {
		 final String GET_ID_BY_ENDPIONT = "/Library/GetBook.php";
		 given().log().all()
			.queryParam("ID", "HPB12111129090009010")
			.contentType(ContentType.JSON)
			.when()
			.get(GET_ID_BY_ENDPIONT)
			.then()
			.log().all();
				
   
	}

	}


