package com.kh.practice.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListPractice {
	
	public static void main(String[] args) {

//		arrayListTest();
//		linkedListTest();
//		stackTest();
		queueTest();
				
		
		/*
		 * List 특징
		 * 중복 저장이 가능하고 순서가 있는 콜렉션
		 * 
		 * ArrayList
		 * -배열 구조
		 * -데이터 조회가 빠름
		 * -데이터 추가/ 삭제가 복잡하여 오래 걸림
		 * 
		 * ArrayList<E> 참조변수명 = new ArrayList<E>();	//[E] E타입 생략 가능!
		 * List<E> 참조변수명 = new ArrayList<[E]>();
		 * 
		 * LinkedList
		 *  -리스트 구조
		 *  -데이터 추가/삭제가 빠르다
		 *  -데이터 조회가 느림
		 *  
		 *  LinkedList<E> 참조변수명 = new LinkedList<[E]>();
		 *  List<E> 참조변수명 = new LinkedList<[E]>();
		 *  
		 *  List 관련 메소드
		 * 	-저장된 데이터 크기: size()
		 *  -데이터 추가: add(데이터)
		 *  -데이터 삭제: remove()
		 *  -데이터 조회:get(인덱스)
		 */
	}
	
	public static void queueTest() {
		MyQueue mq = new MyQueue();
		
		mq.enQeue("민트 초코");
		mq.enQeue("엄마는 외계인");
		mq.enQeue("아몬드 봉봉");
		mq.enQeue("슈팅 스타");
		
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		
	}
	
	public static void stackTest() {
		/*
		 * 스택(Stack) : LIFO ( Last In First Out)
		 * 				제일 마지막에 저장된 데이터가 제일 처음으로 꺼내올 수 있는 구조
		 * - 데이터 추가: 순서대로 추가( 끝에 추가 )
		 * - 데이터 제거: 마지막 위치부터 제거
		 */
		
		
		MyStack stack = new MyStack();
		stack.push("레몬");
		stack.push("아보카도");
		stack.push("파인애플");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	
	
	public static void linkedListTest() {
		LinkedList<Integer> list = new LinkedList<>();
		
		//사용자에게 정수 값을 입력 받아
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값을 입력하세요 : ");
		int length = sc.nextInt();
		
		//그 길이만큼 랜덤 값을 저장 ( 랜덤값 범위 : 1 ~ length )
		for(int i=0; i<length; i++) {
			int random= (int)(Math.random() * length +1);
			list.add(random);		//오토박싱
		}
		
		//저장된 출력: printItem 메소드 사용
		printItem(list);
	}
	
	
	public static void arrayListTest() {
		// 문자열 데이터를 관리하는 ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<>();
		
		//데이터 추가 : add		// 배열에서 데이터를 추가했을 때는...
		list.add("아구찜");		// arr[0] = "아구찜";
		list.add("찜닭");			// arr[1] = "찜닭";...
		list.add("갈비찜");
		
		//데이터 조회 : get
		for(int i=0; i<list.size(); i++) {		//데이터 길이: size
			System.out.println(i+"번째 : " + list.get(i));
		}
		
		System.out.println("----------------------------------");
		for(String item : list) {
			System.out.println(item);
		}
			
			//아구찜과 찜닭 사이에 돈가스 추가
			list.add(1, "돈가스");		//add(추가할인덱스, 데이터)
			
			for(int i=0; i<list.size(); i++) {		//데이터 길이: size
				System.out.println(i+"번째 : " + list.get(i));
			}
		
		//돈가스 삭제 : remove
		list.remove(1);
		System.out.println("----------------------------------");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+"번째 : " + list.get(i));
		}
		
		//갈비찜을 돈가스로 변경 : set
		list.set(2, "돈가스");
		
		swapList(list, 1,2);
		
		System.out.println("----------------------------------");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+"번째 : " + list.get(i));
		}
		
		Collections.swap(list, 0, 2);
		System.out.println("----------------------------------");
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+"번째 : " + list.get(i));
			printItem(list);
			}
		}
	
	public static <E> void printItem(List<E> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+"번째 : " + list.get(i));
			}
	}

	
	public static <E> void swapList(List<E> list, int n1, int n2) {
		//리스트에서 n1위치의 값과 n2 위치의 값을 변경
		
		//1) n1 위치의 있는 데이터를 변수에 저장
		E temp = list.get(n1);
		
		//2) n2 위치의 데이터를 n1 위치에 저장(변경)
		list.set(n1,list.get(n2));
		
		//3) 따로 보관해두었던 n1 위치의 데이터를 n2 위치에 저장
		list.set(n2, temp);
	}


}
