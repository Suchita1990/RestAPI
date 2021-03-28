package com.serilaization.dashboard;

public class Dashboard {
	private String name;
	private int purchase_Amount;
	private String website;
	private Courses courses;

	public Courses getCourses() {
		return courses;
	}

	public void setCourses(Courses courses) {
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPurchase_Amount() {
		return purchase_Amount;
	}

	public void setPurchase_Amount(int purchase_Amount) {
		this.purchase_Amount = purchase_Amount;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
}
