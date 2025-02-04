package com.kh.practice.set.view;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	public void mainMenu() {
		System.out.println("========== KH 추첨 프로그램 ==========");
		System.out.println("******* 메인 메뉴 *******");
		
		System.out.println("1. 추첨 대상 추가");
		System.out.println("2. 추첨 대상 삭제");
		System.out.println("3. 당첨 대상 확인");
		System.out.println("4. 정렬된 당첨 대상 확인 ");
		System.out.println("5. 당첨 대상 검색");
		System.out.println("9. 종료");
		System.out.println("메뉴 번호 선택 : ");
		
		int menu = sc.nextInt();
		sc.nextLine();
		
		while(true) {
			switch(menu) {
			case 1:
                insertObject();
                break;
            case 2:
                deleteObject();
                break;
            case 3:
                winObject();
                break;
            case 4:
                sortedWinObject();
                break;
            case 5:
                searchWinner();
                break;
            case 9:
                System.out.println("프로그램 종료");
                return;
            default:
                System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
                break;
        }
    }
}

	//추첨 대상 추가용 메소드
public void insertObject() {
		//추첨 대상 수 입력받아 입력한 수만큼 정보 저장
		System.out.print("추가할 추첨 대상 수 :  ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<=num; i++) {

		//이름, 핸드폰 번호를 입력받아 Lottery 객체를 추첨자 정보 저장(객체 생성)
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("핸드폰 번호('-' 빼고): ");
        String phone = sc.nextLine();

        Lottery l = new Lottery(name, phone);
        //컨트롤러의 insertObject로 전달(메소드 호출할 때 인자값으로 전달)
        boolean result = lc.insertObject(l);
        if (!result) {
            System.out.println("중복된 대상입니다. 다시 입력하세요.");
            i--;
        }
    }
    System.out.println("추가 완료되었습니다.");
}

public void deleteObject() {
	//삭제기준 : 이름, 연락처
	//이름, 핸드폰 번호를 입력받아 Lottery 객체 생성
    System.out.print("삭제할 대상의 이름: ");
    String name = sc.nextLine();
    System.out.print("핸드폰 번호('-'빼고): ");
    String phone = sc.nextLine();

    Lottery l = new Lottery(name, phone);
    boolean result = lc.deleteObject(l);
    if (result) {
        System.out.println("삭제 완료되었습니다.");
    } else {
        System.out.println("존재하지 않는 대상입니다.");
    }
}
//당첨 대상 확인용 메소드
public void winObject() {
	//컨트롤러부터 받아온 Set 객체를 println메소드를 통해 출력
	
   HashSet<Lottery> lset = lc.winObject();
    System.out.println(lset);
}

//정렬된 당첨 대상 확인
public void sortedWinObject() {
	//컨트롤러에서 받아온 set객체를 Iterator 를 통해 출력
	TreeSet<Lottery> lset = lc.sortedWinObject();
	
	
	// 1) Iterator 객체 생성 (by. Set 객체)
	
    Iterator<Lottery> it = lset.iterator();
    
    // 2) 데이터 유/무 확인(by. Iterator 객체)
    while (it.hasNext()) {
    // 3) 데이터 조회(by.Iterator 객체	
        System.out.println(it.next());
    }
}

//당첨 대상 검색용 메소드
public void searchWinner() {
	
	//검색 대상 이름, 핸드폰 번호를 입력받아
    System.out.print("검색할 대상의 이름: ");
    String name = sc.nextLine();
    System.out.print("핸드폰 번호('-'빼고): ");
    String phone = sc.nextLine();
    //매개변수 있는 생성자를
    Lottery l = new Lottery(name, phone);
    if (lc.searchWinner(l)) {
        System.out.println("축하합니다. 당첨 목록에 존재합니다.");
    } else {
        System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
    }
}
}
