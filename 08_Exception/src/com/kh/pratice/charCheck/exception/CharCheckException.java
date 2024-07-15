package com.kh.pratice.charCheck.exception;


//예외 클래스: 특정 조건에서 예외(오류)를 발생시킬 때 사용할 목적
public class CharCheckException extends Exception {
	public CharCheckException() {}
	
	public CharCheckException(String msg) {
	//문자열 (msg) : 예외 처리 시 어떤 예외인지를 확인시켜주는 목적
	super(msg);
		
	}
	
}
