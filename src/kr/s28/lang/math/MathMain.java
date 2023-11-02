package kr.s28.lang.math;

public class MathMain {
	public static void main(String[] args) {
		int a = Math.abs(-10);
		System.out.println("절대값 : " + a);
		
		double b = Math.ceil(3.3);
		System.out.println("올림 : " + b);
		
		double c = Math.floor(3.7);
		System.out.println("절삭 : " + c);
		
		int d = Math.round(3.7f); //round가 float 형으로 받아서 뒤에 3.7f 라고 적어야 에러가 안남
		System.out.println("반올림 : " + d);
		//round는 위 ceil, floor와 달리 정수형태로 출력하기 때문에 앞 자료형을 int로 함
		
		int e = Math.max(3, 5);
		System.out.println("최대값 : " + e);
		
		int f = Math.min(4,  7);
		System.out.println("최소값 : " + f);
	}
}
