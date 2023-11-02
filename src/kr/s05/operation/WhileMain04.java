package kr.s05.operation;

public class WhileMain04 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 
		 * 입력받은 정수값부터 0까지 출력하는 프로그램을 작성하시오.
		 * (0보다 큰 수를 입력하는데 만약 0을 입력하면 "0보다 큰 수를 입력하세요" 라고 출력)
		 * 
		 * [입력 예시]
		 * 정수 입력:3
		 * 
		 * [출력 예시]
		 * 3
		 * 2
		 * 1
		 * 0
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("정수 입력:");
		int a = input.nextInt();
		
		/* 선생님이 짠거는 if 안에 while 넣어서 짜심
		 * 
		 * if(a>0) {
		 * 		while(a>=){
		 * 			System.out.println(a--); // 증감식
		 * 		}
		 * }else {
		 * 		System.out.println("0보다 큰 수를 입력하세요")
		 * }
		 * 
		 * 이게 더 효율적인듯....
		 */
		
		
		if(a==0) {
			System.out.println("0보다 큰 수를 입력하세요");
			System.exit(0);
		}
			
		while(a>=0) {
			System.out.println(a);
			a--;
		}
		
		input.close();
	}
}

//내가 한거는 음수 입력하면 오류날 것 같음 그래서 선생님 방법으로 하는 게 맞는 것 같다!
