package com.kh.pratice.token.view;

import java.util.Scanner;

import com.kh.pratice.token.comtroller.TokenController;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	
	public void mainMenu() {
		System.out.println("1. 지정 문자열");
		System.out.println("2. 입력 문자열");
		System.out.println("9. 프로그램 끝내기");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
			case 1:
				tokenMenu();
				break;
			case 2:
				inputMenu();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
		}
		
		
		
	}
	
	public void tokenMenu() {
		String str = " J a v a P r o g r a m ";
		//토큰 처리 전 글자, 토큰 처리 전 개수를 출력
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		
		// TokenController(tc)의 afterToken()의 반환 값을 가지고
		String after = tc.afterToken(str);
		// 토큰 처리 후 글자, 토큰 처리 후 개수, 모두 대문자로 변환 한 것을 출력
		System.out.println("토큰 처리 후 글자 : " + after );
		System.out.println("토큰 처리 후 개수 : " + after.length());
		System.out.println("모두 대문자로 변환 : " + after.toUpperCase());
		
	}
	
	public void inputMenu() {
		/*
		 * 문자열을 입력하세요 :
		// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력
			찾을 문자를 하나 입력하세요 :
		// tc에 findChar()로 위에 입력 받은 문자열과 방금 받은 문자를 인자로 넘겨
		// 반환 값 출력
		 */
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();
		String result = tc.firstCap(str);
		System.out.println("첫 글자 대문자 : " + result);
		
		System.out.print("찾을 문자를 하나 입력하세요 :");
		char findCh =sc.next().charAt(0);
		int count = tc.findChar(result, findCh);
		
		System.out.println(findCh + "문자가 들어간 개수 :" + count);
	}
}