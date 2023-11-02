package kr.s32.util.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerMain01 {
	public static void main(String[] args) {
		String source = "100,200,300";
		
		//생성자를 통해서 전달 -> 문자열 분리
										//	  대상 문자열 , 구분자
		StringTokenizer st = new StringTokenizer(source, ",");
		 
		//메서드를 통해서 반환
		while(st.hasMoreElements()) {// hasMoreElements -> 구분자로 잘려진 문자열이 존재하면 true
			System.out.println(st.nextToken());
			//nextToken(): 구분자를 이용해서 잘려진 문자열을 반환시킴
		}
	}
}
