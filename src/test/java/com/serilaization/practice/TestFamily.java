package com.serilaization.practice;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;


public class TestFamily {

	public static void main(String[] args) {
		Address ad = new Address();
		ad.setCity("Pune");
		ad.setState("Maharashtra");
		
		FamilyMember fm = new FamilyMember();
		fm.setFather_age(55);
		fm.setMother_age(49);
		fm.setSibling_age(23);

		Family family = new Family();
		family.setFamilyHead("Mr.Ls Thakur");
		family.setFamilyIncome(12000);
		family.setAddress(ad);
		family.setFamilymember(fm);
		
		
		given().log().everything()
        .contentType(ContentType.JSON)
        .body(family)
        .when()
        .post("http://216.10.245.166/Library/Addbook.php")
        .then().log().all();
	}

}
