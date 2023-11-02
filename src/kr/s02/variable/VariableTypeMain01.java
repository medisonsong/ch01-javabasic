package kr.s02.variable;

public class VariableTypeMain01 {
	public static void main(String[] args) {
		System.out.println("===논리형===");
		//논리형 (true, false)
		boolean b = true;
		System.out.println("b = " + b);
	
		
		
		System.out.println("===문자형===");
		//문자형, 크기: 2byte(유니코드 이용, 아스키코드는 1byte(영문+특문만 처리)), 표현 범위: 0 ~ 65,535
		//다국어 처리를 위한 유니코드(unicode) 방식 / 유니코드(16진수)= 아스키코드(10진수)+a
		char c1 = 'A'; //아스키 코드로 치환하면 65가 나옴.
		System.out.println("c1 = " + c1);
		
		char c2 = 65; //A에 해당하는 아스키 코드 값 65를 문자형으로 직접 대입
		System.out.println("c2 = " + c2); // 결과가 c2 = A로 나오는 것을 알 수 있음.
		
		char c3 = '\u0041'; //A를 유니코드로 표현한 것
		System.out.println("c3 = " + c3);
		
		char c4 = '자';
		System.out.println("c4 = " + c4);
		
		char c5 = '\uc790'; //자를 유니코드로 표현
		System.out.println("c5 = " + c5);
		
		
		
		System.out.println("===정수형===");
		//byte, 크기 : 1byte, 표현 범위: -128 ~ 127
		byte b1 = 127;
		System.out.println("b1 = " + b1); // 범위가 좁아서 연산 시에는 int 사용, 입출력 시에 byte 사용
		
		//short, 크기 : 2byte, 표현 범위 : -32,768 ~ 32,767
		short s1 = 32767;
		System.out.println("s1 = " + s1);
		
		//int, 크기 : 4byte, 표현범위 : -2,147,483,648 ~ 2,147,483,647
		//정수 표현의 기본.
		int in1 = 1234567;
		System.out.println("in1 = " + in1);
		
		//long, 크기 : 8byte
		long lo1 = 1234567; // int로 인식 후 long으로 변환
		long lo2 = 1234567L; // literal > L을 붙이면 int로 인식 x 바로 long으로 변환
		System.out.println("lo1 = " + lo1);
		System.out.println("lo2 = " + lo2); // 출력결과: lo2=1234567 > L은 자료형을 의미하기 때문에 없어짐 
		
		System.out.println("===실수===");
		//float, 크기 : 4byte 
		float f1 = 9.2f; // 얘도 double이 기본형이라 long처럼 f넣어주면 됨
		System.out.println("f1 = " + f1);
		
		//double, 크기 : 8byte / 실수 표기 기본형. float보다 정밀도가 조금 더 높음 (8byte라서)
		double d1 = 9.8;
		System.out.println("d1 = " + d1);
		
		System.out.println("===문자열 표시===");
		//문자열= 기본 자료형 X 참조 자료형에 포함됨.
		String str = "Hello World!"; // 다른 자료형들은 소문자로 시작, 근데 String은 대문자로 시작해야함
		System.out.println("s1 = "+ str);
	}

}
