package com.kh.chap01_beforeVSafter.after.model.vo;

public class Tv extends Product{
	private int inch;
	
	public Tv() {}


	public String information() {
		// TODO Auto-generated method stub
		return super.information() + ", inch = " +inch;
	}

	public void setInch (int inch) {
		this.inch = inch;
	}
	
}
