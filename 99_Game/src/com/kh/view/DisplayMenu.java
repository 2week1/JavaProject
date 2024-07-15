package com.kh.view;

import java.util.Scanner;

import com.kh.controller.PlayController;
import com.kh.model.vo.User.User;

public class DisplayMenu {
	
	Scanner sc = new Scanner(System.in);
	PlayController pc = new PlayController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("======Console Game======");
			System.out.println("1. Up & Down ");
			System.out.println("2. 가위 바위 보 ");
			System.out.println("3. 숫자 야구 ");
			System.out.println("9. 점수 조회 ");
			System.out.println("0. 게임 종료 ");
			System.out.println("========================");
			
			int menu = sc.nextInt();
			
			switch(menu) {
				case 1:
					pc.game01();
					break;
				
				case 2:
					pc.game02();
					break;
					
				case 3:
					pc.game03();
					break;
					
				case 9:
					pc.getUserInfo();
					break;
				
				case 0: 	
					System.out.println("프로그램을 종료합니다");
					return;	
					
				default :
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
}
