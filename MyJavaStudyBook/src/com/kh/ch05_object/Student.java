package com.kh.ch05_object;

public class Student /* extends Object */ {
	/*
	 * 접근제한자 : 접근할 수 있는 범위를 제한하는 것
	 * 
	 * 		public(+) > protected(#) > [default](~) > private(-)
	 */
	
	// 필드부 : [접근제한자] [예약어] 자료형 필드명;
	String name;		// 이름
	int age;			// 나이
	double height;		// 키
	String phone;		// 연락처
	String address;		// 주소
	
	
	// 생성자부 : 접근제한자 클래스명([매개변수]) {}
	public Student() {}
	public Student(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	// 메소드부 : [접근제한자] [예약어] 반환타입 메소드명([매개변수]) {}
//	public String toString() {
//		// 반환타입 "void"가 아닐때는 반드시 return 값; 부분이 있어야 함.
//		//          => void: 반환값이 없음을 의미
//		return "이름:" + name
//				+", 나이:" + age
//				+", 키:" + height
//				+", 연락처:" + phone
//				+", 주소:" + address;
//	}
}
