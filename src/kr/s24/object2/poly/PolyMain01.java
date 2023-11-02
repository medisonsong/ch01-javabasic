package kr.s24.object2.poly;

//부모 클래스
class Parent{
	int a = 100;
}
//자식 클래스
class Child extends Parent{
	int b = 200;
}

public class PolyMain01 {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		Parent p = ch; // child 객체의 주소를 p에 복사
		//자식 클래스 타입 -> 부모 클래스 타입으로 형변환 됐다
		//업 캐스팅, 자동적으로 형변환.
		System.out.println(p.a); 
		//호출 범위를 벗어나서 호출이 불가능
		// System.out.println(p.b);
		
		Child ch2 = (Child) p; // 부모 클래스 타입 -> 자식 클래스 타입으로 형변환 됐다
							   //다운캐스팅, 명시적으로 형변환 
		System.out.println(ch2.a);
		System.out.println(ch2.b);
	}
}
