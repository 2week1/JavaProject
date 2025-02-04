package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		// 입력된 값이 1보다 작을 때 "1 이상의 숫자를 입력해주세요." 출력
		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {	// 입력된 값이 1보다 크거나 같을 때
			// 1부터 입력된 값까지 출력
			// ex) 4가 입력되었을 때 : 1 2 3 4
			for(int i=1; i<=num; i++) {
				System.out.print(i);
				if (i != num) {
					System.out.print(" ");
				}
			}
		}
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		/* 무한루프 버전
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
				for (int i=1; i<=num; i++) {
					System.out.print(i);
					if (i != num) {
						System.out.print(" ");
					}
				}
				
				break;
			}
		}
		*/
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		// 반복 조건 : 입력받은 값이 1보다 작을 때		
		do {
			if (num >= 1) {
				for(int i=1; i<=num; i++) {
					System.out.print(i);
					if (i != num) {
						System.out.print(" ");
					}
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				
				System.out.print("1이상의 숫자를 입력하세요 : ");
				num = sc.nextInt();
			}
		} while(true);
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
		for (int i=num; i > 0; i--) {
			System.out.print(i);
			if(i != 1) {
				System.out.print(" ");
			}
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
		
			for (int i=num; i > 0; i--) {
				System.out.print(i);
				if(i != 1) {
					System.out.print(" ");
				}
			}
			break;
		}
	}	
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int total=0;
		for(int i=1; i <= num; i++) {
			// 총합을 계산
			total += i;	// total = total + i;
			
			// 화면에 출력
			System.out.print(i);
			if(i != num) {
				System.out.print(" + ");
			}
		}
		
		System.out.println(" = " + total);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		// 입력된 숫자 중 1 미만의 숫자가 있는 경우
		if (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {	// 입력된 숫자가 모두 1 이상인 경우
			// 두 숫자 중 작은 값부터 큰 값까지 출력
			// 삼항연산자 => 조건식 ? 조건식이 참인경우 사용할 값  
			//							: 조건식이 거짓인 경우 사용할 값
			int min = num1 < num2 ? num1 : num2;
			int max = num1 < num2 ? num2 : num1;
			
			for (int i=min; i<=max; i++) {
				System.out.print(i);
				if(i != max) {
					System.out.print(" ");
				}
			}
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			// 입력된 숫자 중 1 미만의 숫자가 있는 경우
			if (num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			} else {	// 입력된 숫자가 모두 1 이상인 경우
				// 두 숫자 중 작은 값부터 큰 값까지 출력
				// 삼항연산자 => 조건식 ? 조건식이 참인경우 사용할 값  
				//							: 조건식이 거짓인 경우 사용할 값
				int min = num1 < num2 ? num1 : num2;
				int max = num1 < num2 ? num2 : num1;
				
				for (int i=min; i<=max; i++) {
					System.out.print(i);
					if(i != max) {
						System.out.print(" ");
					}
				}
				break;
			}
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("====== " + num + "단 ======");
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if (num > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		} else {
			
			for (int i=num; i<=9; i++) {	// "X단"
				System.out.println("===== " + i + "단 =====");
				
				for(int j=1; j<10; j++) {
					
					System.out.printf("%d * %d = %d\n", i, j, i*j);
					
				}
				
			}
			
			
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();

			if (num > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				continue;
			} else {

				for (int i = num; i <= 9; i++) { // "X단"
					System.out.println("===== " + i + "단 =====");

					for (int j = 1; j < 10; j++) {

						System.out.printf("%d * %d = %d\n", i, j, i * j);

					}

				}

				break;

			}
		}
	}	
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		
		System.out.print("공차 : ");
		int d = sc.nextInt();
		
		for(int i=0; i<10; i++) {
			System.out.print(start + (d * i));
			if (i < 10) {
				System.out.print(" ");
			}
		}
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.next();
			
			// 연산자 입력 값이 "exit"인 경우 반복문 종료
			if (op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수1 : ");
			int n1 = sc.nextInt();
			System.out.print("정수2 : ");
			int n2 = sc.nextInt();
			
			switch(op) {
			case "+":
				System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 + n2);
				break;
			case "-":
				System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 - n2);
				break;
			case "*":
				System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 * n2);
				break;
			case "/":
				if(n2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				} else {
					System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 / n2);
				}
				break;
			case "%":
				if(n2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				} else {
					System.out.printf("%d %s %d = %d\n", n1, op, n2, n1 % n2);
				}
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=num; i>=0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// -------------------- 종합문제 -------------
	
	public void practice01() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("양수가 아닙니다.");
		} else {
		
			for(int i=1; i<=num; i++) {
				if(i % 2 == 0) {
					System.out.print("수");
				} else {
					System.out.print("박");
				}
			}
			
		}
		
	}
}








