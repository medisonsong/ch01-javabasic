package kr.s04.operator;

public class OperatorMain12 {
	public static void main(String[] args) {
		System.out.println("===대입연산자===");
		int a = 5;
		int b = 7;
		
		a += b; //a = a + b
		System.out.println("a += b : " + a);
		
		a -= b; //a = a - b
		System.out.println("a -= b : " + a);
		
		a *= b; //a = a * b
		System.out.println("a *= b : " + a);
		
		a /= b; //a = a / b
		System.out.println("a /= b : " + a);
		
		a %= b; // a = a % b
		System.out.println("a %= b : " + a); //출력결과: 5 -> 나눠지지가 않아서 그냥 5 그대로 출력됨.		
	}
}
