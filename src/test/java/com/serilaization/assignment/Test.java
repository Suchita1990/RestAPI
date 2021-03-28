package com.serilaization.assignment;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import io.restassured.http.ContentType;

public class Test {

	public static void main(String[] args) {
		StatePricing price = new StatePricing();
		 price.setState("maharashtra");
		 price.setPrice("10,000");
		 
		 StatePricing value = new StatePricing();
		 value.setState("MadhyaPradesh");
		 value.setPrice("11,000");

		 ArrayList <StatePricing> list = new ArrayList<StatePricing>();
	                  list.add(price);
	                  list.add(value);
	        
	      Specification specification = new Specification();
	        specification.setColour("Black");
	        specification.setAvailable("Amazon");
	        
	        Wardrobe wb = new Wardrobe();
	        wb.setBrand("Godrej");
	        wb.setType("Hinged");
	        wb.setPricing(list);
	        wb.setSpecification(specification);
	        
	        
	    	given().log().everything()
	        .contentType(ContentType.JSON)
	        .body(wb)
	        .when()
	        .post("http://216.10.245.166/Library/Addbook.php")
	        .then().log().all();
			
	       
	}

}
