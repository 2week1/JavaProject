package com.kh.practice.point.model.vo;

public class Point {
	private int x;
	private int y;
	
	//기본생성자
	public Point() {}
	
	//매개변수가 2개인 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override		//Object 클래스로부터 오바리이딩 된 메소드를 의미함!
	public String toString() {
		//return "{x변수에 담긴 값}, {y변수에 담긴 값}";
		return x + ", "+ y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
