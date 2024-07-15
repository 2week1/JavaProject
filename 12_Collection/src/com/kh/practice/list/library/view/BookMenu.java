package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

//화면(view) 용 클래스  --> 사용자에게 데이터를 표시(출력)하거나 입력을 받는 역할

public class BookMenu {
	
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	public void Mainmenu() {
		//사용자가 직접 메인 메뉴를 선택할 수 있음.
		//종료 전까지 반복 실행. 각 메뉴 선택 시 해당 메소드 이동(호출)
		
		/*System.out.println("== Welcome KH Library ==");
		******* 메인 메뉴 *******
		1. 새 도서 추가 // insertBook () 실행
		2. 도서 전체 조회 // selectList ()
		3. 도서 검색 조회 // searchBook ()
		4. 도서 삭제 // deleteBook ()
		5. 도서 명 오름차순 정렬 // ascBook()
		9. 종료 // “프로그램을 종료합니다.” 출력 후 main()으로 리턴
		메뉴 번호 선택 : >> 입력 받음
		// 메뉴 화면 반복 실행 처리
		// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복*/
		
		System.out.println("== Welcome KH Library ==");
		System.out.println("******* 메인 메뉴 *******");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서 명 오름차순 정렬");
		System.out.println("9. 종료");
		System.out.println("메뉴 번호 선택 : ");
		
		int menu = sc.nextInt();
		sc.nextLine();		//nextLine 메소드 외에는 버퍼에 엔터키 (\n)값이 남아 있어 제거하기 위해 사용
		
		while(true) {
			switch(menu){
			
			case 1:
				insertBook ();
				break;
				
			case 2:
				selectList ();
				break;
				
			case 3:
				searchBook ();
				break;
				
			case 4:
				deleteBook ();
				break;
				
			case 5:
				ascBook ();
				break;
				
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;		//메소드 종료 --> 현재 메소드를 호출한 위치로 돌아감!
				
			default :
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				break;
				
			}
		}
		
	}

	public void insertBook() {
		System.out.println("책 정보를 입력해주세요.");
		System.out.println("도서 명: ");
		String title = sc.nextLine();
		
		System.out.println("저자 명: ");
		String author = sc.nextLine();
		
		System.out.println( "장르 (1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타 ): ");
		int category = sc.nextInt();
		
		System.out.println("가격: ");
		int price = sc.nextInt();
		
		
		//조건문(if~switch) 사용한 방식
		String strCtg = "";
		if (category == 1) {
			strCtg = "인문";
		} else if (category == 2) {
		strCtg = "과학";
		} else if (category == 3) {
		strCtg = "외국어";
		} else if (category == 4) {
		strCtg = "기타";
		}
		
		Book b = new Book(title, author, strCtg, price);
		bc.insertBook(b);
	/*	
		//배열을 사용한다면..?
		String[] categories = {"인문", "자연과학", "의료", "기타"};
		Book b2 = new Book(title , author, categories[category-1], price);
		
		//문자열 split() 사용한다면..?
		String categories = "인문, 자연과학, 의료, 기타";
		Book b3 = new Book(title,author, categories, split(",")[category - 1], price);
		
		*/
		}
	
	public void selectList() {
		/*
		  1. bc(BookController)의 selectList() 메소드를 호출 후
 			--> 결과 값을 임의의 리스트(ArrayList<Book> bookList)에 대입

		  */
	        ArrayList<Book> bookList = bc.selectList();
	        /*
	         * 2. 조건식 이용해서
 		  	   2_1. bookList가 "비어있는 경우" --> "존재하는 도서가 없습니다." 라는 알람 문구 출력
               2_2. bookList가 "비어있지 않은 경우" --> 반복문을 통해 bookList 안의 Book 객체들 출력
	         */
	        if (bookList.isEmpty()) {
	        	//리스트가 비어있는 경우 (bookList.isEmpty() --> true)
	            System.out.println("존재하는 도서가 없습니다.");
	        } else {
	        	//리스트가 비어있지 않는 경우 (bookList.isEmpty() --> false)
	            for (int i = 0; i < bookList.size(); i++) {		//size() : 리스트에 저장된 데이터 길이
	                System.out.println(bookList.get(i)/*.toString()*/);		//get (index) : 해당 index위치의 데이터 조회
	            }
	        }
	    

	}
	

		
	
	
	public void searchBook() {
		
		//1. 검색할 도서명 키워드로 입력 받기 (String keyword)
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Book> searchList = bc.searchBook(keyword);
		//2. bc(BookController)의 searchBook() 메소드로 위의 keyword 값 전달 후
 		//--> 결과 값을 임의의 리스트(ArrayList<Book> searchList)에 대입
		 //** 결과 값이 한 도서의 Book 객체가 아니라 리스트인 이유
 		//보통 프로그램에서 검색 할 때 풀 네임을 쳐서 검색하지 않고 키워드로 검색
 		//즉, 키워드를 포함한 결과가 하나가 아닌 여러 개일 수 있기 때문에 리스트로 받기
		//3. 조건식 이용해서
 		//3_1. searchList가 "비어있는 경우" --> "검색 결과가 없습니다."라는 알람 문구 출력
 		//3_2. searchList가 "비어있지 않은 경우" --> 반복문으로 searchList 안의 Book 객체들 출력
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
			
		} else {
			for ( Book b : searchList ) {
				System.out.println(b);
			}
		}

		
		
	}
	
	public void deleteBook() {
		/*
		 * 1. 삭제할 도서명 입력 받기 (String title)
		2. 삭제할 저자명 입력 받기 (String author)
		 ** 도서명과 저자명을 같이 입력 받는 이유
 		--> 같은 도서명이라고 해도 저자명이 다른 도서가 있을 수 있기 때문에
		3. bc(BookConroller)의 deleteBook() 메소드로 위의 title, autor 값 전달 후
		--> 결과 값을 임의의 Book(Book remove)에 대입

		 */
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		Book remove = bc.delectBook(title, author);
		/*4. 조건식 이용해서
 		4_1. remove가 존재하는 경우 --> "성공적으로 삭제되었습니다."라는 문구 출력
 		4_2. remove가 존재하지 않은 경우 --> "삭제할 도서를 찾지 못했습니다."라는 문구 출력*/
		
		if(remove != null) {
			//remove 변수의 값이 null이 아닌 경우 --> 값이 있는 경우(어딘가를 참조하고 있음!)
			System.out.println("성공적으로 삭제되었습니다.");
			
		}else {
			//remove 변수의 값이 null인 경우 --> 값이 없는 경우(참조하는 곳이 없음!)
			System.out.println("삭제할 도시를 찾지 못했습니다.");
		}
		
		
	}
	
	public void ascBook() {
		//컨트롤러의 ascBook() 메소드 결과에 따라
		//성공 시 "정렬에 성공했습니다" 출력
		//실패 시 "정렬에 실패햇습니다" 출력
		int result = bc.ascBook();
		if(result ==1) {
			System.out.println("정렬에 성공했습니다.");
		} else {
			System.out.println("정렬에 실패했습니다.");
		}
		
	}


}
