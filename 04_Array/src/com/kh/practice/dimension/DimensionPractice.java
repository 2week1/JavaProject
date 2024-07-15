package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {
		// 1. 3행 3열짜리 문자열 배열 선언 및 할당
		String[][] arr = new String[3][3];
		
		// 2. 인덱스 0행 0열부터 2행 2열까지 차례대로 "(0,0)" 형식으로 값을 저장
		// arr.length => 2차원 배열의 길이. 즉, 행의 길이
		for(int i=0; i<arr.length; i++) { // i: 행의 인덱스로 사용
			
			// arr[i].length => 1차원 배열의 길이. 즉, 열의 길이
			// arr[i] 는 문자열 데이터를 담고있는 배열이다!
			
			for(int j=0; j<arr[i].length; j++) {	// j:열의 인덱스로 사용
				// arr[i][j] 는 문자열 데이터다!
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		}
		
		// 3. 저장된 값들을 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		// 4행 4열 정수형 배열 선언 및 할당
		int[][] numbers = new int[4][4];
		
		// 값을 저장
		int value = 1;
		for(int i=0; i<numbers.length; i++) {	// 행의 인덱스.
			for(int j=0; j<numbers[i].length; j++) {	// 열의 인덱스.
				numbers[i][j] = value++; // 4 * i + (j + 1)	
			}	
		}
		
		// 값을 출력
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.printf("%3d", numbers[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void practice4() {
		// 4행 4열 정수형 배열 선언 및 할당
		int[][] sumArr = new int[4][4];
		
		// 0행 0열 ~ 2행 2열까지 랜덤값 저장
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sumArr[i][j] = (int)(Math.random() * 10 + 1);
			}
		}
		
		// 마지막 행과 마지막 열에 값을 더하기
		/*
		 * sumArr[3][0] = sumArr[0][0] + sumArr[1][0] + sumArr[2][0];
		 * sumArr[3][1] = sumArr[0][1] + sumArr[1][1] + sumArr[2][1];
		 * sumArr[3][2] = sumArr[0][2] + sumArr[1][2] + sumArr[2][2];
		 */
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sumArr[3][i] += sumArr[j][i];  
			}
		}
		
		/*
		 * sumArr[0][3] = sumArr[0][0] + sumArr[0][1] + sumArr[0][2];
		 * sumArr[1][3] = sumArr[1][0] + sumArr[1][1] + sumArr[1][2];
		 * sumArr[2][3] = sumArr[2][0] + sumArr[2][1] + sumArr[2][2];
		 */
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sumArr[i][3] += sumArr[i][j];
			}
		}
		/*
		 * sumArr[3][3] = sumArr[3][0] + sumArr[3][1] + sumArr[3][2]
		 * 				+ sumArr[0][3] + sumArr[1][3] + sumArr[2][3]
		 */
		sumArr[3][3] = sumArr[3][0] + sumArr[3][1] + sumArr[3][2]
					+ sumArr[0][3] + sumArr[1][3] + sumArr[2][3];
		
		for(int i=0; i<sumArr.length; i++) {
			for(int j=0; j<sumArr[i].length; j++) {
				System.out.printf("%5d", sumArr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4_1() {
		// 4행 4열 정수형 배열 선언 및 할당
		int[][] sumArr = new int[4][4];
		
		// 0행 0열부터 2행 2열까지는 1 ~ 10까지 임의의 정수 값 저장
		// 3행에는 각 열의 합을, 3열에는 각 행의 합, 3행 3열에는 가로 세로 합
		
		for(int i=0; i<sumArr.length; i++) {
			for (int j=0; j<sumArr[i].length; j++) {
				
				int lastRow = sumArr.length - 1;		// 마지막 행의 인덱스
				int lastCol = sumArr[i].length - 1;		// 마지막 열의 인덱스
				
				// 랜덤값을 각 위치에 저장 (0,0 ~ 2,2)
				if (i != lastRow && j != lastCol) {
					sumArr[i][j] = (int)(Math.random() * 10 + 1);
				}
				
				System.out.printf("%d, %d, 랜덤값: %d\n", i, j, sumArr[i][j]);
				
				// 마지막 행의 위치에 현재 값을 더하기
				if (i < lastRow) {
					sumArr[lastRow][j] += sumArr[i][j];
					System.out.printf("마지막행: %d <-- %d\n", sumArr[lastRow][j], sumArr[i][j]);
				}
				
				// 마지막 열의 위치에 현재 값을 더하기
				if (j < lastCol) {
					sumArr[i][lastCol] += sumArr[i][j];
					System.out.printf("마지막열: %d <-- %d\n", sumArr[i][lastCol], sumArr[i][j]);
				}
				
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("행 크기 : ");
			int row = sc.nextInt();
			
			System.out.print("열 크기 : ");
			int col = sc.nextInt();
			
			if (row < 1 || row > 10 || col < 1 || col > 10) {
				System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			// 입력받은 행크기, 열크기로 2차원 배열 선언 및 할당
			int[][] chArr = new int[row][col];
			
			for(int i=0; i<row; i++) {
				for (int j=0; j<col; j++) {
					// 65(A) ~ 90(Z) 까지의 랜덤값 
					//               => Math.random() * (최댓값 - 최솟값 +1) + 최솟값
					chArr[i][j] = (int)(Math.random() * (90 - 65 + 1) + 65);
				}
			}
			
			// 출력
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					System.out.print((char)chArr[i][j] + " ");
				}
				System.out.println();
			}
			
			break;
		}
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {
												{"이", "까", "왔", "앞", "힘"}, 
												{"차", "지", "습", "으", "냅"}, 
												{"원", "열", "니", "로", "시"}, 
												{"배", "심", "다", "좀", "다"}, 
												{"열", "히", "! ", "더", "!! "}
											};
											
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length; j++) {
				System.out.print(strArr[j][i] + " ");	// i와 j의 위치를 반대로!
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		// 열의 크기가 다른 2차원 배열 선언 및 할당
		int[][] arr = new int[row][];
		
		char value = 'a';
		for(int i=0; i<row; i++) {
			System.out.print(i + "행의 열 크기 : ");
			int col = sc.nextInt();
			arr[i] = new int[col];
			
			// 각 행의 1차원 배열에 a부터 ~ 값을 대입?
			for(int j=0; j<col; j++) {
				arr[i][j] = value++;
			}
		}
		
		// 배열 데이터 값 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print((char)arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
							"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		final int ROW = 3;
		final int COL = 2;
		String[][] group1 = new String[ROW][COL];
		String[][] group2 = new String[ROW][COL];
		
		int idx=0;
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COL; j++) {
				group1[i][j] = students[idx];
				
				group2[i][j] = students[students.length / 2 + idx];
				
				idx++;
			}
		}
		
		System.out.println("== 1분단 ==");
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COL; j++) {
				System.out.print(group1[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COL; j++) {
				System.out.print(group2[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
							"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		final int ROW = 3;
		final int COL = 2;
		String[][] group1 = new String[ROW][COL];
		String[][] group2 = new String[ROW][COL];
		
		int idx=0;
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COL; j++) {
				group1[i][j] = students[idx];
				
				group2[i][j] = students[students.length / 2 + idx];
				
				idx++;
			}
		}
		
		System.out.println("== 1분단 ==");
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COL; j++) {
				System.out.print(group1[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COL; j++) {
				System.out.print(group2[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.next();
		
		boolean isExist = false;
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COL; j++) {
				if(group1[i][j].equals(name)) {
					isExist = true;
					
					System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 %s에 있습니다.",
										name, (i+1), j == 0 ? "왼쪽" : "오른쪽");
				}
			}
		}
		
		if (!isExist) {		// 1분단에 없었다면...
			for(int i=0; i<ROW; i++) {
				for(int j=0; j<COL; j++) {
					if(group2[i][j].equals(name)) {
						isExist = true;
						
						System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 %s에 있습니다.",
											name, (i+1), j == 0 ? "왼쪽" : "오른쪽");
					}
				}
			}
		}
	}	
}









