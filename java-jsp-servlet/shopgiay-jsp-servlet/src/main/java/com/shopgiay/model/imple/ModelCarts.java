package com.shopgiay.model.imple;

public abstract class ModelCarts {
	protected String image_url;
	protected String shoe_name;
	protected double price;
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getShoe_name() {
		return shoe_name;
	}
	public void setShoe_name(String shoe_name) {
		this.shoe_name = shoe_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}