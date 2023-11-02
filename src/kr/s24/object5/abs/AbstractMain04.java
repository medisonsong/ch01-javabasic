package kr.s24.object5.abs;

abstract class AbsEx1{
	int a = 100;
	public void make() {
		System.out.println("make 메서드");
	}
	//추상 메서드
	public abstract void play();
	public abstract void take();
}

// 추상클래스에 추상클래스 상속
/* 일반메서드에 추상클래스 상속 할땐 추상메서드 구현해달라고 에러 떴는데
*  추상클래스에 추상클래스 상속하니 구현 의무가 없어서 에러가 안남 어차피 둘다 메모리에 안 올라가서
*/
//추상클래스를 추상클래스에 상속하면 추상메서드 구현 의무가 없음
abstract class AbsEx2 extends AbsEx1{
	//추상 메서드 구현
	@Override
	public void play() {
		System.out.println("play 메서드");
	}
	//AbsEx2의 추상메서드
	public abstract void sound(); 
}

//현재 추상메서드 중 take랑 sound가 누적되어있음

public class AbstractMain04 extends AbsEx2{
	//추상메서드 구현
	@Override
	public void take() {
		System.out.println("take 메서드");
	}
	@Override
	public void sound() {
		System.out.println("sound 메서드");
	}

	public static void main(String[] args) {
		AbstractMain04 ab = new AbstractMain04();
		ab.make();
		ab.play();
		ab.take();
		ab.sound();
	}
}
