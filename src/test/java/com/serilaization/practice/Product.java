package com.serilaization.practice;

public class Product {
	
	private String id;
	private String type;
	private String name;
	private Images img;
	private Thumbnail thumb;
	
	
	public Thumbnail getThumb() {
		return thumb;
	}
	public void setThumb(Thumbnail thumb) {
		this.thumb = thumb;
	}
	public Images getImg() {
		return img;
	}
	public void setImg(Images img) {
		this.img = img;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
