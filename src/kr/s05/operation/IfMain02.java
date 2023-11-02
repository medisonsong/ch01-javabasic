package kr.s05.operation;

public class IfMain02 {
	public static void main(String[] args) {
		System.out.println("===단일if문===");
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
				
		System.out.print("정수 하나 입력:");
		int a = input.nextInt(); // 변수 a를 먼저 선언해도 되고 대입하면서 선언해도 됨.
		
		if(a < 0) { // 코드를 줄이고 싶을때 수행문이 하나기 때문에 {} 줄이면 됨.
			a = -a;
		}
		
		System.out.println("절대값은 " + a + "이다");		
		
		input.close();
	}
}
