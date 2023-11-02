package kr.s02.variable;

public class VariableTypeMain02 {
	public static void main(String[] args) {
		//확장 특수 출력 문자(escape sequence)
		
		char single = '\'';
		System.out.println(single);
		
		String str = "오늘은 \"수요일\" 입니다.";
		System.out.println(str);
		
		//문자열에 '를 표시하면 자동으로 일반문자로 변환돼서 \를 치지 않아도 됨.
		String str2 = "내일은 '목요일' 입니다.";
		System.out.println(str2);
		
		String str3 = "C:\\javawork"; // \는 특수 문자기 때문에 출력하기 위해선 문자열 내에서도 \를 붙여야함
		System.out.println(str3);
		
		String str4 = "여기는 서울이고\n저기는 부산입니다."; // %n은 printf 전용 줄바꿈이고 \n은 모든 출력문 다 가능함.
		System.out.println(str4);
		
		String str5 = "이름\t나이\t취미\t";
		System.out.println(str5);		
	}
}
