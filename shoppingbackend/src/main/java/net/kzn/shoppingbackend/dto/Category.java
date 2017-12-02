package net.kzn.shoppingbackend.dto;

public class Category {
	
	/*
	 * Private fields
	 * 
	 * */
	
	private int id;
	private String name;
	private String descirption;
	private String imageURL;
	private boolean active = true;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescirption() {
		return descirption;
	}
	public void setDescirption(String descirption) {
		this.descirption = descirption;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
}
