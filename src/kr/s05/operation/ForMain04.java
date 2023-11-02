package kr.s05.operation;

public class ForMain04 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//구구단 프로그램 만들기
		// 2*2=4 형식으로 출력 (2 * 2 = 부분은 문자열, 나머지 4 부분은 연산)
		
		System.out.print("단 입력:");
		int dan = input.nextInt();
		
		System.out.println(dan + "단");
		System.out.println("------------");
		
		for(int i=1; i<=9; i++) { //i: dan에 곱해지는 수 역할
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		
		input.close();

			
	}
}
