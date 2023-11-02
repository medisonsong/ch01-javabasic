package kr.s24.object5.abs;

//추상클래스
abstract class A2{
	//멤버 변수
	int x = 100;
	
	//추상클래스는 일반적으로 하나 이상의 추상 메서드를 가지고 있음
	//추상 메서드
	public abstract void make(); // 내용을 채워 넣을 수 없게끔 {} 없이 ;으로 막아놓음
	
	//멤버 메서드
	public void play() {
		System.out.println("play 메서드");
	}
}

class B2 extends A2{
	//추상 클래스를 상속받으면 추상 클래스의 추상 메서드를 자식 클래스에 
	//반드시 구현해야 객체 생성이 가능함
	@Override
	public void make() {
		System.out.println("make 메서드");
	}
}

public class AbstractMain02 {
	public static void main(String[] args) {
		B2 bp = new B2();
		bp.make();
	}
}

/*
 * 추상클래스 안에 추상 메서드를 입력했을 때
 * 상속받는 자식 클래스에 메서드 오버라이드를 해야함
 * 호출할 때는 부모가 아닌 자식 메서드에서 호출이 됨
 * 
 * 일반클래스가 아닌 추상클래스를 만드는 이유는 >> 
 * 미구현 상태를 만들고 자식 쪽에 의무를 지우는거임
 * 자식 클래스 쪽에서 알아서 해라 구현만 해줘라 이런 느낌이라 많이 씀
 * 생각보다 추상클래스의 빈도수가 높음
 * 
*/
