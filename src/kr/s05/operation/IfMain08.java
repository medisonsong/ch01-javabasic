package kr.s05.operation;

public class IfMain08 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 
		 * 정수 두 개를 입력 받아서 변수에 저장하고 두 값 중 최대값과
		 * 최소값을 구하여 최대값과 최소값을 출력하시오.
		 * 
		 * (입력 예시)
		 * 첫번째 정수 입력:2
		 * 두번째 정수 입력:3
		 * 
		 * (출력 예시)
		 * 최대값 : 3
		 * 최소값 : 2
		 * --------------------
		 * 만약 같은 값을 입력받았다면 
		 * 두 수는 같다 << 라고 출력
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int a;
		int b;
		
		System.out.print("첫번째 정수 입력:");
		a = input.nextInt();
		
		System.out.print("두번째 정수 입력:");
		b = input.nextInt();
		
		if(a>b) {
			System.out.println("최대값 : " + a);
			System.out.println("최소값 : " + b);
		}else if(a<b) {
			System.out.println("최대값 : " + b);
			System.out.println("최소값 : " + a);
		}else {
			System.out.println("두 수는 같다");
		}
			
		input.close();
		
		// min이랑 max를 따로 설정해서 할 수 있는 방법은 없을라낭... 
	}

}
