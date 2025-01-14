package com.kh.practice.set.model.compare;

import com.kh.practice.set.model.vo.Lottery;
import java.util.Comparator;


//정렬 기준을 정의하기 위한 객체
//Comparator 인터페이스 구현
public class SortedLottery implements Comparator<Lottery> {

	@Override
	public int compare(Lottery o1, Lottery o2) {
		//이름으로 오름차순 정렬하되, 이름이 같으면 번호로 오름차순 하는 정렬
		int num = o1.getName().compareTo(o2.getName());
		/*
		 * A.compareTo(B) : 오름차순
		 * 0 : A와 B가 같을 때
		 * 양수 : (0 < ) : A가 B보다 클 때. A B 
		 * 음수 : (0 > ) : A가 B보다 작을 때. B A
		 */
		
		if (num == 0) {
			//이름이 같을 경우 번호로 정렬 기준 확인
			return o1.getPhone().compareTo(o2.getPhone());
		}
		
		return num;
	}

}
