package com.kh.chap01_beforeVSafter.after.model.vo;

public class SmartPhone extends Product {
	private String mobileAgency;
		
	public SmartPhone() {}


	@Override
	public String getBrand() {
		// TODO Auto-generated method stub
		return super.getBrand();
	}



	@Override
	public void setBrand(String brand) {
		// TODO Auto-generated method stub
		super.setBrand(brand);
	}



	@Override
	public String getCode() {
		// TODO Auto-generated method stub
		return super.getCode();
	}



	@Override
	public void setCode(String code) {
		// TODO Auto-generated method stub
		super.setCode(code);
	}



	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}



	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}



	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}



	@Override
	public void setPrice(int price) {
		// TODO Auto-generated method stub
		super.setPrice(price);
	}



	public String information() {
		return "mobileAgency =" + mobileAgency;
	}
	
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public void setmobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
}
