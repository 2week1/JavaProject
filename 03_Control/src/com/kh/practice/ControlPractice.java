package com.kh.practice;

import java.util.Scanner;

public class ControlPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Q1. 주민번호를 입력받아 남자인지, 여자인지 출력하기 (입력 형식: 000000-0000000)
		// 단, 입력받은 값의 길이가 14가 아닌 경우 "잘못 입력되었습니다." 출력
		// ( hint ) 문자열의 길이를 확인하는 메소드 : length()
		/*
		System.out.print("주민번호를 입력하세요 (-포함) : ");
		String idNum = sc.nextLine();
		
		if(idNum.length() != 14) {	// 입력받은 값의 길이가 14가 아닌 경우
			System.out.println("잘못 입력되었습니다.");
		} else {		// 입력받은 값의 길이가 14인 경우
			
			char genNum = idNum.charAt(7);
			if (genNum == '1' || genNum == '3') {
				System.out.println("남자 입니다.");
			} else if (genNum == '2' || genNum == '4') {
				System.out.println("여자 입니다.");
			} 
			
		}
		*/


		// Q2. 월을 입력받아 입력받은 월의 마지막 날을 출력하기
		// 1, 3, 5, 7, 8, 10, 12 => 31일
		// 4, 6, 9, 11            => 30일
		// 2                       => 28일 또는 29일 (둘 중 하나의 값을 출력!)
		System.out.print("월을 입력해주세요 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("마지막 날은 31일입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("마지막 날은 30일입니다.");
			break;
		case 2:
			System.out.println("마지막 날은 29일입니다.");
			break;
		default:
			System.out.println("잘못 입력했습니다.");			
		}
		
	}
}






