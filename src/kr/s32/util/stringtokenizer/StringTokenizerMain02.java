package kr.s32.util.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerMain02 {
	public static void main(String[] args) {
		String source = "2023-09-13 14:25:20"; 
		//구분자3개 (-, 공백, :)
												//대상문자열, "구분자"(한꺼번에 다 넣음)
		StringTokenizer st = new StringTokenizer(source, "- :");
		//string 안의 split은 복수의 구분자를 설정할 수 없음. 하나하나씩 n번 작업해야함 
		//복수 구분자 설정은 StringTokenizer만 한번에 가능
		
		//StringTokenizer는 복수의 구분자 사용 가능!!!
		
		//메서드를 통해 반환
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}
}
