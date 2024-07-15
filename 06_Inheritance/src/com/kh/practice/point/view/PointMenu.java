package com.kh.practice.point.view;

import java.util.Scanner;
import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	
	//기본생성자는 자동으로 생성될 것 !
	
	public void mainMenu() {

        System.out.println("===== 메뉴 =====");
        System.out.println("1. 원");
        System.out.println("2. 사각형");
        System.out.println("9. 끝내기");
        System.out.print("메뉴 번호: ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                circleMenu();
                break;
            case 2:
                rectangleMenu();
                break;
            case 9:
                System.out.println("프로그램을 종료합니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
        }
    } 
	
	

	public void circleMenu() {
            System.out.println("===== 원 메뉴 =====");
            System.out.println("1. 원 둘레");
            System.out.println("2. 원 넓이");
            System.out.println("9. 메인으로");
            System.out.print("메뉴 번호 : ");
            
            int menu = sc.nextInt();

           if(menu == 1) {
        	   //1. 원 둘레 -> calcCircum() 호출
        	   calcCircum();
            } else if (menu ==2) {
            	//2. 원 넓이 -> calcCircleArea() 호출
            	calcCircleArea();
            }else if (menu == 9) {
            	System.out.println ("메인으로 돌아갑니다.");
//            	return;  현재 메소드에서는 반복문이 실행되지 않으므로 굳이 사용하지 않아도 된다.
            } else {
            	System.out.println("잘못 입력했습니다. 메인으로 돌아갑니다.");
//            	return;
            }
       
    }

	

	public void rectangleMenu() {
            System.out.println("===== 사각형 메뉴 =====");
            System.out.println("1. 사각형 둘레");
            System.out.println("2. 사각형 넓이");
            System.out.println("9. 메인으로");
            System.out.print("메뉴 번호 : ");
            
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    calcPerimeter();
                    break;
                case 2:
                    calcRectArea();
                    break;
                case 9:
                	System.out.println("메인으로 돌아갑니다.");
                	return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
    }
	
	
	
	
	public void calcCircum() {
		/*
		 *x 좌표 :
		  y 좌표 :
          반지름 :
       // 데이터를 CircleController(cc)의 calcCircum()의 매개변수로 보내 반환 값 출력 */
		
        System.out.print("원의 x 좌표를 입력하세요: ");
        int x = sc.nextInt();
        
        System.out.print("원의 y 좌표를 입력하세요: ");
        int y = sc.nextInt();
        
        System.out.print("원의 반지름을 입력하세요: ");
        int r = (int) sc.nextInt();
        
       System.out.println(cc.calcCircum(x, y, r));
    }

	
	

    public void calcCircleArea() {
    	System.out.print("원의 x 좌표를 입력하세요: ");
        int x = sc.nextInt();
        
        System.out.print("원의 y 좌표를 입력하세요: ");
        int y = sc.nextInt();
        
        System.out.print("원의 반지름을 입력하세요: ");
        int r = (int) sc.nextInt();
        
        System.out.println(cc.calcArea(x, y, r));
    }
    
    
    
	public void calcCircle() {
		 System.out.print("원의 x 좌표를 입력하세요: ");
	        int x = sc.nextInt();
	        
	        System.out.print("원의 y 좌표를 입력하세요: ");
	        int y = sc.nextInt();
	        
	        System.out.print("원의 반지름을 입력하세요: ");
	        int r = (int) sc.nextInt();
	        
	       System.out.println(cc.calcCircum(x, y, r));
	}
	
	
	
	public void calcPerimeter() {
        System.out.print("사각형의 x 좌표를 입력하세요: ");
        int x = sc.nextInt();
        
        System.out.print("사각형의 y 좌표를 입력하세요: ");
        int y = sc.nextInt();
        
        System.out.print("사각형의 높이를 입력하세요: ");
        int h = sc.nextInt();
        
        System.out.print("사각형의 너비를 입력하세요: ");
        int w = sc.nextInt();

        rc.calcPerimeter(x, y, w, h);
	}
	
	
	public void calcRectArea() {
        System.out.print("사각형의 x 좌표를 입력하세요: ");
        int x = sc.nextInt();
        
        System.out.print("사각형의 y 좌표를 입력하세요: ");
        int y = sc.nextInt();
        
        System.out.print("사각형의 높이를 입력하세요: ");
        int h = (int) sc.nextInt();
        
        System.out.print("사각형의 너비를 입력하세요: ");
        int w = (int) sc.nextInt();

        
        System.out.println(rc.calcArea(x, y, w, h));
    }
	
}
