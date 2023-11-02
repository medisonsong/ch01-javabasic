package kr.s10.object.method;

import java.util.Scanner;

public class MethodMain02 {
	/*
	 * [실습]
	 * 
	 * 입력한 int형 정수값이 음수이면 -1을, 0이면 0을, 양수이면 1을 반환하는
	 * signOf 메서드를 작성하자
	 * 
	 * [입력 예시]
	 * 정수 x:50
	 * 
	 * [출력 예시]
	 * signOf(x)는 1입니다.
	 */
	
	public int signOf(int n) {
		int sign = 0;
		
		if(n>0) {
			sign = 1;
		}else if(n<0) {
			sign = -1;
		} // sign초기화를 이미 0으로 해놨기 때문에 else ==0할 필요가 없음
		return sign;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //그동안 import문을 몰라서 java.util 패키지를 입력해서 썼음.!
		
		System.out.print("정수 x:");
		int x = input.nextInt();
		
		MethodMain02 me = new MethodMain02();
		int s = me.signOf(x);
		
		System.out.println("signOf(x)는 " + s + "입니다.");
		
		
		input.close();
	}
}	
	
/* 
 * 밑엔 내가 푼건데 계속 오류남.. ㅠㅠ 	
	public int signOf(int a) {
		if(a==0) {		//결과값 저장하는 함수 미지정해서 if 돌려서 오류난거임
			return a = -1;
		}else (a==0) {
			return a = 0;
		}else (a>0) {
			return a = 1;
		}
	}
	
	public static void main(String[] args) {

		MethodMain02 method = new MethodMain02();
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("정수 x:");
		int a = input.nextInt();
		
		int result = method.sign(a);
		System.out.println("signOf(x)는 " + result + "입니다.");
		
		input.close();
	}
}
*/
	