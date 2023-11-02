package kr.s24.object6.inter;

//인터페이스의 구성요소 -> 상수/ 추상메서드
interface A1{ // C:\javaWork\workspace\ch01-javabasic\bin\kr\s24\object6\inter에서 확인하면 A1.class라고 저장된 걸 볼 수 있음
	//상수 
	public static final int W = 10; // 원형 ( public static final 자료형 변수명 = 인자값; )
	int X = 20; // public static final이 생략되어 있는 상수임
	static int Y = 30; // public final이 생략되어 있는 상수임
	final int Z = 40; // public static이 생략되어 있는 상수임
}



public class InterMain01 {
	public static void main(String[] args) {
		// 인터페이스는 객체 생성 불가능
		// A1 ap = new A1();
		
		System.out.println("W = " + A1.W);
		System.out.println("X = " + A1.X);
		System.out.println("Y = " + A1.Y);
		System.out.println("Z = " + A1.Z);
		
		//상수는 변경 불가능
		//A1.X = 100;
	}
}

/*
 * interface 정리 =>
 * 구성 요소가 상수와 추상 메서드 뿐임/ 그렇기 때문에 A1 ap = new A1(); 이렇게 객체 생성하는 것도 불가능하고
 * int X=33; 이라 기재해도 다 상수라서 변경 못함. 호출도 객체 생성 안하고 인터페이스명.상수명; 으로 호출하면 됨
 * static 상수라 호출만 하면 메모리에 올라가서 저장이 됨
 */