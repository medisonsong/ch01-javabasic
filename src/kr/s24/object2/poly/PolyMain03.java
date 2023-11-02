package kr.s24.object2.poly;

//부모 클래스
class Parent2{
	public void make() {
		System.out.println("부모 클래스의 make");
	}
}

//자식 클래스
class Child2 extends Parent2{
	@Override
	public void make() {
		System.out.println("자식 클래스의 make");
	}
}

public class PolyMain03 {
	public static void main(String[] args) {
		Child2 ch = new Child2();
		ch.make(); //재정의된 메서드 호출
		
		System.out.println("---------------------");
		
		Parent2 p = ch; // 자식클래스 타입 -> 부모클래스 타입으로 형변환
						// 업 캐스팅, 자동적으로 형 변환
		p.make(); //재정의된 메서드 호출
	}
}
//원래 parent 타입으로 업캐스팅을 하면 자식 메서드 것은 호출이 안되는데 오버라이딩이 파워가 세서
//자식 메서드가 반환됨