package kr.s04.operator;

public class OperatorMain14 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 은행 프로그램
		 * 잔고 변수 생성(balance)는 0이고, 원하는 금액을 입금해서 잔고를 증가시키고
		 * 출금을 해서 잔고를 감소하게 하는 프로그램 작성
		 * 
		 * (입력 예시)
		 * 예금액:5000
		 * 
		 * (출력 예시)
		 * 잔고:5,000원
		 * 
		 * (입력 예시)
		 * 출금액:2500
		 * 
		 * (출력 예시)
		 * 잔고:2,500원
		 */

		java.util.Scanner input = new java.util.Scanner(System.in);
/*		
		int balance = 0;
		int a;
		int b;
		
		
		System.out.print("예금액:");
		a = input.nextInt();
		
		if (a>0)
			balance += a;
		
		System.out.print("출금액:");
		b = input.nextInt();
		
		if (b>0) 
			balance -= b;
		
		System.out.printf("잔고:%,d원", balance);
		
		
		input.close();
*/ //if문 넣어서 내가 써본고 
		
		int balance = 0; // 잔고
		
		System.out.print("예금액:");
		balance += input.nextInt(); // balance에 바로 누적
		System.out.printf("잔고 : %,d원%n", balance);
		
		System.out.print("출금액:");
		balance -= input.nextInt();
		System.out.printf("잔고 : %,d원%n", balance);
		
		input.close();
		
	}

}
