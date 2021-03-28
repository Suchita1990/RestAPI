package com.serilaization.assignment;

import java.util.List;

public class Wardrobe {
	private String brand ;
	private String type;
	private List<StatePricing> pricing;
	private Specification specification;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<StatePricing> getPricing() {
		return pricing;
	}
	public void setPricing(List<StatePricing> pricing) {
		this.pricing = pricing;
	}
	public Specification getSpecification() {
		return specification;
	}
	public void setSpecification(Specification specification) {
		this.specification = specification;
	}
	

}
