import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;


public class Library_API {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://216.10.245.166";
	//	getBookfromLibrary();
	//	getBookbyAuthor();
	//	getBookbyId();
		deleteBook();
	}
/*####################################  Methods Start #############################################################################*/	
	 public static void getBookfromLibrary()
	 {
		String response = given()
		 .contentType(ContentType.JSON)
		 .body("{\r\n" + 
		 		"\r\n" + 
		 		"\"name\":\"The Help\",\r\n" + 
		 		"\"isbn\":\"bcikp\",\r\n" + 
		 		"\"aisle\":\"22701\",\r\n" + 
		 		"\"author\":\"Kathryn Stockett\"\r\n" + 
		 		"}\r\n" + 
		 		"")
		 .log().all()
		 .when()
		 .post("Library/Addbook.php")
		 .then().log().all()
		 .extract()
		 .asString();
		 System.out.println(response);
		JsonPath js = new JsonPath(response);
		String response_msg = js.getString("Msg");
		String response_id = js.getString("ID");
	   
	}
	/*****************************************************************************************************************/ 
	   public static void getBookbyAuthor() {
		   System.out.println("**********************Get Books by Author Name : *************************");
		   given()
		   .log().all()
		   .when()
		   .get("/Library/GetBook.php?AuthorName=Kathryn Stockett")
		   .then()
		   .statusCode(200)
		   .log().all();
		   
		

	}
	/****************************************************************************************************************/  
	   
	   public static void getBookbyId() {
		   System.out.println("************************************Get Book by Id :  ***********************");
		   given()
		   .log().all()
		   .when()
		   .get("Library/GetBook.php?ID=bcik2297")
		   .then()
		   .log().all();

	}
	/******************************************************************************************************************/   
	   public static void deleteBook() {
		   System.out.println("***************************************Delete Book : *******************************");
		   given()
		   .log().all()
		   .contentType(ContentType.JSON)
		   .body(Library_Data.deleteBookbyId())
		   .when()
		   .post("Library/DeleteBook.php")
		   .then()
		   .statusCode(200)
		   .log().all()
		   .assertThat()
		   .body("msg", Matchers.equalTo(":book is successfully deleted"));
		   
	}
	 
	 

}
