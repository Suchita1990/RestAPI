package readJSONPath;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class readJsonPath {

	public static void main(String[] args) {
		  System.out.println("Read JSONPath in RestAssured : ");
		  String response = given()
		  .contentType(ContentType.JSON)
		  .body("{\r\n"  
	        		+ "    \"name\": \"Harry Potter and the Chamber of Secrets\",\r\n"  
	        		+ "    \"isbn\": \"HPB3120\",\r\n"  
	        		+ "    \"aisle\": \"0935770\",\r\n"  
	        		+ "    \"author\": \"Suchita\"\r\n"  
	        		+ "}" ) 
	        		
		  .when()
		  .post("http://216.10.245.166/Library/Addbook.php")
		  .then()
		  .log()
		  .all()
		  .extract()
		  .asString();
		  // pura json ko traverse karane ke liye or json ki diff value nikalne ke liye 
		  JsonPath js = new JsonPath(response);
		  String msg = js.getString("Msg");
		  String id = js.getString("ID");
		  System.out.println(msg +"\n" +id);

		

	}

}
