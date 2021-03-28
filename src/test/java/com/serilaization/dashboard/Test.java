package com.serilaization.dashboard;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import io.restassured.http.ContentType;

public class Test {
	
	public static void main(String[] args) {
		
		    WebAutomation web = new WebAutomation();
		    web.setTitle("Selenium");
	    	web.setPrice(5000);
	    	
	        WebAutomation web1 = new WebAutomation();
		    web1.setTitle("Cypress");
	    	web1.setPrice(6000);
	    	
	        WebAutomation web2 = new WebAutomation();
		    web2.setTitle("Protractor");
	        web2.setPrice(7000);
	    	
	        ArrayList<WebAutomation> list1 = new ArrayList<WebAutomation>();
	        list1.add(web);
	        list1.add(web1);
	        list1.add(web2);
	        
	   System.out.println("************************************************************");                
	                   
	        Api api = new Api();
	        api.setTitle("Rest API");
	        api.setPrice(5000);
	        
	        Api api1 = new Api();
	        api1.setTitle("Soap UI");
	        api1.setPrice(6000);
	        
	        ArrayList<Api> list2 = new ArrayList<Api>();
            list2.add(api);
            list2.add(api1); 
            
        System.out.println("************************************************************");     
            
            MobileAutomation mob = new MobileAutomation();
            mob.setTitle("C-Test");
            mob.setPrice(5000);
            
            MobileAutomation mob1 = new MobileAutomation();
            mob1.setTitle("Appium");
            mob1.setPrice(6000);
            
            ArrayList<MobileAutomation> list3 = new ArrayList<MobileAutomation>();
            list3.add(mob);
            list3.add(mob1);
         
         System.out.println("************************************************************");  
            
            Courses courses = new Courses();
            courses.setWebautomation(list1);
            courses.setApi(list2);
            courses.setMobileautomation(list3);
            
            Dashboard dashboard = new Dashboard();
            dashboard.setName("Raghvendra Singh");
            dashboard.setPurchase_Amount(90000);
            dashboard.setWebsite("www.testingshastra.com");
            dashboard.setCourses(courses);
            
            given().log().everything()
	        .contentType(ContentType.JSON)
	        .body(dashboard)
	        .when()
	        .post("http://216.10.245.166/Library/Addbook.php")
	        .then().log().all();
            
	                   
	   
	}
	 
	  

}
