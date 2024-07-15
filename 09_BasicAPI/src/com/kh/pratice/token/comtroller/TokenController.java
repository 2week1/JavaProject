package com.kh.pratice.token.comtroller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {}
	
	public String afterToken(String str) {
		
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuilder sb = new StringBuilder();
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			sb.append(token);
		}
		
		return sb.toString();
	}
	
	public String firstCap(String input) {
		// a매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		String subStr = input.substring(0, 1); 	// 2번째 글자부터 마지막까지
		return subStr.toUpperCase() + input.substring(1);

	}
	
	public int findChar(String input, char one) {
		//substring , indexOf 사용하여 해결해보기
		int count = 0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == one) {
				count++;
			}
		}
		return count;	
	}
}
