package readJSONPath;

public class PayLoadForTesting {
	
	 public static String getAddBookPayLoad() {
		return "{" +
                "    \"name\": \"%s\",\r\n" +
                "    \"isbn\": \"%s\",\r\n" +
                "    \"aisle\": \"%s\",\r\n" +
                "    \"author\": \"%s\"" +
                "}";
		 
	}
}
