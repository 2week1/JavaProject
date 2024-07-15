package com.kh.practice.point.model.vo;

public class Circle extends Point {		//extends Point => Point 클래스로부터 상속받는다 !
	
	//상속을 받음으로써, x, y 변수를 멤버로 가지게 된다.
	//따라서, Circle 클래스는 총 3개의 변수를 가지게 된다.
	
	private int radius;
	
	public Circle() {}
	
	public Circle( int x, int y, int radius) {
		super(x,y);		//Point (부모클래스) 의 매개변수가 2개인 생성자 호출(사용)
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
	
	public void setRedius (int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	
	
	

}
