package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {
	
	private String brand;
	private String cord;
	private String name;
	private int price;
	private boolean allnOne;

	public Desktop() {}
	
	public String information() {
		return "Desktop [brand= " + brand + ", cord= " + cord + ", name= " + name + ", price= " + price + ", allnOne= "
				+ allnOne + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCord() {
		return cord;
	}

	public void setCord(String cord) {
		this.cord = cord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAllnOne() {
		return allnOne;
	}

	public void setAllnOne(boolean allnOne) {
		this.allnOne = allnOne;
	}
}
