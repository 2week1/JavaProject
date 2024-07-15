package com.kh.practice.list;

import java.util.ArrayList;

public class MyStack {
	
	private ArrayList<String> arrStack = new ArrayList<>();	
	
	public void push(String data) {
		arrStack.add(data);

		}
	
	public String pop() {
		if(arrStack.isEmpty()) {
			return "리스트가 비었습니다.";		//리스트가 비어있다면, 리스트가 비었습니다 반환
		}
		//그렇지 않은경우, 리스트의 마지막 인덱스 (위치)의 데이터 반환
		//remove(index) : 해당 index 위치와 데이터를 제거하면서 해당 데이터 반환
		
		return arrStack.remove(arrStack.size()-1);
	}
		
		
	/*MyStack
		 * ===================
		 * arrStack : ArrayList<String> = new ArrayList<>();
		 * ===================
		 *  + push(data:String): void		//데이터를 추가할 때 사용 push
		 *  + pop() : String				//데이터를 제거할 때 사용 pop
		 *  								//isEmpty() -> 데이터가 없을 경우 "리스트가 비었습니다." 반환
		 *  								//remove() -> arrStack(리스트)에서 데이터 제거 후 해당 데이터를 반환
		 *  ===================
		 *  
		 */
		
}


