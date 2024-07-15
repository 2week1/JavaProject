package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		// 1. 길이가 10인 배열 선언 (1부터 10까지의 값을 저장 => int)
		int[] arr = new int[10];
		
		// 2. 반복문을 사용하여 배열 인덱스에 그 값을 저장
		/*
		for(int i=1; i<=10; i++) {
			// 인덱스 시작번호 : 0
			arr[i-1] = i;		// arr 배열의 i-1 위치에 i 값을 저장
		}
		*/
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		for(int i=0; i<10; i++) {
			arr[i] = i+1;
			/*
			 * i:0)
			 * arr[0] = 0+1;
			 * i:1)
			 * arr[1] = 1+1;
			 * ..
			 * i:9)
			 * arr[9] = 9+1; 
			 */
		}
		
		// 3. 반복문을 사용하여 각 인덱스의 값을 출력
		for(int i=0; i<10; i++) {
			System.out.print(arr[i]);
			
			if (i != 9) {
				System.out.print(" ");
			}
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		// 값을 저장
		/*
		 * arr[9] = 10 (x) arr[0] = 10
		 * System.out.print(arr[9])
		 */
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr.length - i;
			//System.out.printf("i=%d) arr[i]=%d\n", i, arr[i]);
		}
		
		// 출력
		// 배열명.length : 배열의 길이
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length-1) {
				System.out.print(" ");
			}
		}	
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			// 입력받은 정수값의 길이만큼 배열을 생성
			//  * 자료형[] 변수명 = new 자료형[배열길이];
			int[] arr = new int[num];
			
			for(int i=0; i<num; i++) {
				arr[i] = i+1;
			}
			
			for(int i=0; i<num; i++) {
				System.out.print(arr[i]);
				
				if (i != num-1) {
					System.out.print(" ");
				}
			}
		}
	}
	
	public void practice4() {
		// 문자열 배열 선언
		/*
		String[] strArr = new String[5];
		strArr[0] = "사과";
		strArr[1] = "귤";
		strArr[2] = "포도";
		strArr[3] = "복숭아";
		strArr[4] = "참외";
		*/
		// String[] strArr = new String[] {"사과", "귤", "포도", "복숭아", "참외"};
		String[] strArr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		// "귤" 출력
		// System.out.println(strArr[1]);
		for(int i=0; i<strArr.length; i++) {
			if (strArr[i].equals("귤")) {
				System.out.print(strArr[i]);
			}
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		System.out.print("문자 : "); 
		String strCh = sc.next();
		char ch = strCh.charAt(0);
		
		// 문자열의 길이 : 문자열_변수/값.length()
		// 배열 길이 : 배열_변수/값.length
		char[] arrCh = new char[str.length()]; 
		
		// 입력받은 문자열을 배열에 문자 하나하나 저장 => 문자형 배열
		for(int i=0; i<arrCh.length; i++) {
			arrCh[i] = str.charAt(i);
			// str = "apple";
			// str.charAt(0) : a
			// str.charAt(1) : p
			// str.charAt(2) : p
		}
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, ch);
		int count = 0;
		for(int i=0; i<arrCh.length; i++) {
			if (arrCh[i] == ch) {	// 문자형 배열의 i번째 값과 사용자가 입력한 문자값이 같다면,
				count++;				// 개수를 증가시키고,
				System.out.print(i + " ");	// 해당 위치의 인덱스 값을 출력!
			}
		}
		System.out.println();
		System.out.println(ch + "의 개수 : " + count);
	} 
	
	public void practice6() {
		// 문자열 배열에 "월" ~ "일"까지 초기화
		String[] days = {"월", "화", "수", "목", "금", "토", "일"};
		
		// 0부터 6까지 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이의 숫자 입력 : ");
		int num = sc.nextInt();
		
		// 0부터 6까지의 범위의 숫자가 아닌 경우 "잘못 입력하셨습니다"를 출력
		if (num < 0 || num > 6) { // num=> -1, -2, ... 또는 7, 8, 9, ...
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println(days[num] + "요일");
		}
		
		// 0부터 6까지의 범위의 숫자인 경우만 요일을 출력
		if (num >= 0 && num < days.length) {
			System.out.println(days[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int n = sc.nextInt();
		
		// 정수형 배열 선언 및 생성 (배열길이: 입력받은 정수 값)
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			// i: 0, 1, 2, n-1
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();  // arr 배열의 i번째 위치에 입력된 값을 대입
		}
		
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			total += arr[i];	// total = total + arr[i];
		}
		
		System.out.println("\n총 합 : " + total);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();

			// 3이상인 홀수 자연수
			if (num >= 3 && num % 2 != 0) {
				// 입력받은 정수 길이만큼의 정수형 배열 선언 및 할당
				int[] arr = new int[num];

				int value = 1; // 배열에 저장할 값
				for (int i = 0; i < num; i++) {

					if (i < num / 2) { // 중간 위치 계산 : num / 2
						arr[i] = value++; // 중간 위치까지는 증가
					} else {
						arr[i] = value--; // 중간 위치부터는 감소
					}
				}
				/*
				 * ex) num 값이 5인 경우
					      num / 2 => 2
					
					i = 0)  value = 1
						arr[0] = value++;
						arr[0] = 1; // value++ => 2
					
					i = 1)
						arr[1] = value++;
						arr[1] = 2; // value++ => 3
					
					i = 2)
						arr[2] = value--;
						arr[2] = 3;  // value-- => 2
					
					i = 3)
						arr[3] = value--;
						arr[3] = 2; // value-- => 1
					i = 4)
						arr[4] = value--;
						arr[4] = 1; // value-- => 0
					
					i= 5) 반복문 종료
				 */

				// 배열의 데이터 출력
				for (int i = 0; i < arr.length; i++) {
					if (i < arr.length - 1) { // 배열의 마지막위치-1 까지는 , 포함하여 출력
						System.out.print(arr[i] + ", ");
					} else {
						System.out.print(arr[i]);
					}
				}
				
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	public void practice9() {
		String[] menu = {"양념", "불닭", "치즈", "간장", "뿌링클", "후라이드"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.next();
		
		// int count=0;
		boolean isExist = false;
		for(int i=0; i<menu.length; i++) {
			if(menu[i].equals(name)) {
				// count++;
				isExist = true;
				break;
			}
		}
		
		// if (count > 0) {
		if (isExist) {
			System.out.println(name + "치킨 배달 가능");
		} else {
			System.out.println(name + "치킨은 없는 메뉴입니다.");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String ssn = sc.next();
		
		// 문자열의 문자 하나하나를 문자형 배열로 생성 후 값을 저장
		// - 문자형 배열 선언 및 할당 (문자열 길이만큼)
		char[] origin = new char[ssn.length()];
		// - 반복문을 사용하여 문자열 처음 위치부터 마지막 위치까지의 문자를 배열에 저장
		for(int i=0; i<origin.length; i++) {
			origin[i] = ssn.charAt(i);
		}
		
		// 원본 배열 값의 변경 없이 복사본 배열의 값을 변경 => 깊은 복사
		char[] copy = new char[origin.length];
		for(int i=0; i<copy.length; i++) {
			if (i <= 7) {
				copy[i] = origin[i];		// 인덱스 7번 위치까지
			} else {
				copy[i] = '*';
			}
		}
		
		// 복사본 배열의 값을 출력
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]);
		}
		
		// [참고] Arrays.toString(배열명) : 배열의 데이터를 출력 ([값0, 값1, 값2, ...] 형식)
		// System.out.println(Arrays.toString(copy));
		
	}
	
	public void practice11() {
		int[] numbers = new int[10];
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 10 + 1);
		}
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
	
	public void practice12() {
		// 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당(생성)
		int[] numbers = new int[10];
		
		// 1 ~ 10 사이의 난수(랜덤 값)를 발생시켜 배열에 초기화
		for(int i=0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 10 + 1);
		}

		// 배열 데이터 중 최대값과 최소값을 출력
		
		// (1) 하나하나 비교하며 찾기
		System.out.println(Arrays.toString(numbers));
		int max = 0;
		int min = 10;
		// 최대값, 최소값을 구하기
		for(int i=0; i < numbers.length; i++) {
			// 최대값
			if (max < numbers[i]) {
				max = numbers[i];
			}
			// 최소값
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		System.out.println("==================================");
		
		// (2) 배열을 오름차순으로 정렬하여 찾기
		//  배열 오름차순 정렬 : Arrays.sort([참조변수명]);
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		// 배열의 마지막 위치(인덱스): 배열길이-1
		System.out.println("최대값 : " + numbers[numbers.length-1]);
		System.out.println("최소값 : " + numbers[0]);
	}
	
	public void practice13() {
		// 길이가 10인 정수형 배열을 선언 및 할당
		int[] numbers = new int[10];
		
		for(int i=0; i<numbers.length; i++) {
			// 1 ~ 10까지 랜덤값을 저장
			numbers[i] = (int)(Math.random() * 10 + 1);
			
			// i-1 위치(현재 위치의 직전 위치)까지 중복값이 있는 지 확인
			for(int j=0; j<i; j++) {
				// i번째 위치의 값과 j번째 위치의 값을 비교
				//  같으면 다시 랜덤값을 저장 --> 현재 위치의 값을 다시 저장할 수 있도록..
				if(numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
		}
		
		// 배열의 데이터 출력
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
	
	public void practice14() {
		// 길이가 6인 정수형 배열을 선언 및 할당
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			// 1 ~ 10까지 랜덤값을 저장
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(lotto);
		
		// 배열의 데이터 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] chArr = new char[str.length()];
		
		int index = 0;	// index: 문자형 배열(chArr)에서 사용할 인덱스 값
		for(int i=0; i<str.length(); i++) {	// i: 문자열(str)에서 사용할 인덱스 값
			boolean isDup = false;
			// 중복된 문자가 있는 지 확인
			for(int j=0; j<index; j++) {
				if(chArr[j] == str.charAt(i)) {
					isDup = true;
					break;
				}
			}
			if (!isDup) {
				chArr[index++] = str.charAt(i);
			}
		}
		
		int count = 0;
		System.out.print("문자열에 있는 문자 : ");
		for(int i=0; i<index; i++) {
			count++;
			if (i < index-1) {
				System.out.print(chArr[i] + ", ");				
			} else {
				System.out.print(chArr[i]);
			}
		}
		
		System.out.println("\n문자 개수 : " + count);
	}
	
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int length = sc.nextInt();
		
		sc.nextLine();		// 버퍼 비우기!
		
		String[] strArr = new String[length];
		
		
		while(true) {

			for(int i=0; i<length; i++) {
				if (strArr[i] == null) {	// null 값 체크는 비교연산자 가능!
					System.out.print((i+1)+"번째 문자열 : ");
					String str = sc.nextLine();
					
					strArr[i] = str;
				}
			}
			
			System.out.print("더 값을 입력하시겠습니까? (Y/N) : ");
			String yn = sc.nextLine();
			
			// 문자열.toUpperCase() : 문자열의 값을 모두 대문자로 변경
			if (yn.toUpperCase().equals("Y")) {
				System.out.print("더 입력하고 싶은 개수 : ");
				int addCount = sc.nextInt();
				
				sc.nextLine(); 	// 버퍼 비우기!
				
				// 새로운 배열 선언 및 할당
				length += addCount;
				String[] newArr = new String[length];
				System.arraycopy(strArr, 0, newArr, 0, strArr.length);
				
				strArr = newArr;		// 새로운 배열 주소를 원래 배열에 복사
			} else if (yn.toUpperCase().equals("N")) {
				System.out.println(Arrays.toString(strArr));
				break;
			}
		}
	}
}



