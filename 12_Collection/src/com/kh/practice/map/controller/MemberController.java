package com.kh.practice.map.controller;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	
	private HashMap<String, Member> map = new HashMap<>();
	
	
	public boolean joinMembership(String id, Member m) {
		if(!map.containsKey(id)) {
			map.put(id, m);
			return true;
		}
		
		return false;
		}
	
	public String logIn(String id, String password){

		Member member = map.get(id);		//Map에서 id(key)에 해당하는 데이터를 조회
		
		if(member != null) {				//데이터가 있다면..
			if(member.getPassword().equals(password)) {		//저장된 비밀번호와 전달된 비밀번호를 비교
				return member.getName();					//같다면, 해당 객체의 이름 데이터 반환
			}
		}
		return null;		//그 외의 모든 경우는 null 반환
	}
	
	public boolean changePassword(String id, String oldPw, String newPw){
		Member member = map.get(id);		//id에 해당하는 객체를 Map에서 조회
		
		if(member != null) {				//데이터가 있다면,
			if(member.getPassword().equals(oldPw)) {	//저장된 비밀번호와 입력된 기존 비밀번호가 같다면
				//새로운 비밀번호로 변경
				member.setPassword(newPw);			//map 저장된 객체의 주소를 member 참조변수가 가리키고 있으므로 setter로 처리 가능!
				return true;
				}
			}
		return false;
		}

	
	public void changeName(String id, String newName) {
		if(map.containsKey(id)) {			//Map에 해당 id의 데이터가 존재한다면(포함되어있다면)
			Member member = map.get(id);	//데이터를 조회해와서 객체의 name 필드의 값을 변경
			member.setName(newName);
		}
	}
	
	public TreeMap sameName(String name) {
		
		TreeMap tMap = new TreeMap(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
		//(HashMap) map의 키 목록 조회 : keySet()
		for (String k : map.keySet()) {
			Member member = map.get(k);
			if(member.getName().equals(name)) {
				tMap.put(k, name);		//k: 아이디
				
			}
		}
		return tMap;
	}
}
