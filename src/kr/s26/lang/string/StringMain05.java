package kr.s26.lang.string;

public class StringMain05 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * str 변수에 저장된 값을 대문자 -> 소문자로, 소문자 -> 대문자로 변환
		 * 
		 * 출력예시
		 * ABCmdYE-4w?ewZZ
		 * 
		 * char at 이용해서 한문자씩 추출하고 문자가 아닌 것들은 
		 * 대소문자 알아내는건 아스키코드 이용 (A: 65~ 90/ a: 97~122까지)
		 */
		
		String str = "abcMDye-4W?EWzz";
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 65 && c <= 90) {
				result += String.valueOf(c).toLowerCase();
				
			}else if(c >= 97 && c <= 122) {
				result += String.valueOf(c).toUpperCase();
				
			}else {
				result += c; // 변환작업이 없는 애들 누적시키는 방법
			}
		}
		System.out.println(result);
	}
}
