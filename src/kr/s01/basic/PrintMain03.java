package kr.s01.basic;

public class PrintMain03 {
	public static void main(String[] args) {
		//문자 : 한 문자
		System.out.println('A');
		System.out.println('가');
		
		//문자열 : 문자+문자, 한 문자 이상의 문자들
		System.out.println("Z");
		System.out.println("Bus");
		System.out.println("한강");
		
		//숫자(정수)
		System.out.println(23); // 숫자일 경우에는 따옴표 없이 입력, ""가 있으면 문자열로 인식 돼서 연산 등 계산 불가능
		
		//숫자(실수)
		System.out.println(25.67);		

		//논리값(boolean), 논리값도 "" 없음. 왜냐면 문자열로 인식되기 때문에
		System.out.println(true); //참값
		System.out.println(false); //거짓값 
		
	}
}