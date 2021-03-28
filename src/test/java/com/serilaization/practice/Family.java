package com.serilaization.practice;

public class Family {
	private String familyHead;
	private int familyIncome;
	private Address address;
	private FamilyMember familyMember;
	
	public FamilyMember getFamilymember() {
		return familyMember;
	}
	public void setFamilymember(FamilyMember familymember) {
		this.familyMember = familymember;
	}
	public String getFamilyHead() {
		return familyHead;
	}
	public void setFamilyHead(String familyHead) {
		this.familyHead = familyHead;
	}
	public int getFamilyIncome() {
		return familyIncome;
	}
	public void setFamilyIncome(int familyIncome) {
		this.familyIncome = familyIncome;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
