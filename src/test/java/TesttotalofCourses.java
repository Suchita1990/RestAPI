


import org.testng.Assert;

import io.restassured.path.json.JsonPath;

public class TesttotalofCourses {

	public static void main(String[] args) {
		String json = "{\r\n" + 
				"  \"dashboard\": {\r\n" + 
				"    \"name\" : \"Raghvendra Singh\",\r\n" + 
				"    \"purchaseAmount\": 90000,\r\n" + 
				"    \"website\": \"www.testingshastra.com\"\r\n" + 
				"  },\r\n" + 
				"  \"courses\": {\r\n" + 
				"    \"webautomation\": [\r\n" + 
				"      {\r\n" + 
				"        \"title\": \"Selenium\",\r\n" + 
				"        \"price\": 5000\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"title\": \"Cypress\",\r\n" + 
				"        \"price\": 6000\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"title\": \"Protractor\",\r\n" + 
				"        \"price\": 7000\r\n" + 
				"      }\r\n" + 
				"    ],\r\n" + 
				"    \"api\": [\r\n" + 
				"      {\r\n" + 
				"        \"title\": \"Rest API\",\r\n" + 
				"        \"price\": 5000\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"title\": \"Soap UI\",\r\n" + 
				"        \"price\": 6000\r\n" + 
				"      }\r\n" + 
				"    ],\r\n" + 
				"    \"MobileAutomation\": [\r\n" + 
				"      {\r\n" + 
				"        \"title\": \"C-Test\",\r\n" + 
				"        \"price\": 5000\r\n" + 
				"      },\r\n" + 
				"      {\r\n" + 
				"        \"title\": \"Appium\",\r\n" + 
				"        \"price\": 6000\r\n" + 
				"      }\r\n" + 
				"    ]\r\n" + 
				"  }\r\n" + 
				"}";
		
		      JsonPath jsonPath = new JsonPath(json);
	          System.out.println("Total Courses :"  + jsonPath.getInt("courses.size()"));
	        
	          int total_course_fees = jsonPath.getInt("dashboard.purchaseAmount");
	          System.out.println("Total Fees for Course :" + total_course_fees);
	        
	          int lengthofArray = jsonPath.getInt("courses.size()");
	        
	       System.out.println("********************** Dashboard courses ************************");
	        
	           int total1 = 0,total2 = 0,total3 = 0,total_of_course =0;
	       
	           int webautomation = jsonPath.getInt("courses.webautomation.size()");
	           for(int i=0;i<webautomation;i++)
	            {
	    	       total1 = jsonPath.getInt("courses.webautomation[" + i + "].price");
	    	       System.out.println(total1);
	    	       total_of_course = total_of_course + total1;
	    	    }
	       
	           int api = jsonPath.getInt("courses.api.size()");
	           for(int i=0;i<api;i++)
	             {
	    	        total2 = jsonPath.getInt("courses.api[" + i + "].price");
	    	        System.out.println(total2);
	    	        total_of_course = total_of_course + total2;
	             }
	     
	          int mobileautomation = jsonPath.getInt("courses.MobileAutomation.size()");
	          for(int i=0;i<mobileautomation;i++)
	             {
	    	        total3 = jsonPath.getInt("courses.MobileAutomation[" + i + "].price");
	    	        System.out.println(total3);
	    	        total_of_course = total_of_course + total3;
	             }
	         
	         System.out.println("Total Price of courses : " + total_of_course);
	     
		     Assert.assertEquals(total_course_fees, total_of_course);
	}

}
