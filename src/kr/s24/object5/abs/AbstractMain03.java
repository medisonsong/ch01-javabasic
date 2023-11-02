//동물 울음소리 구현

package kr.s24.object5.abs;

//부모 클래스
abstract class Animal{
	//일반적인 메서드
	public void breathe() {
		System.out.println("숨을 쉬다");
	}
	//추상메서드
	public abstract void sound(); // 동물마다 우는게 다르기 때문에 자식 메서드에 의무를 지우는 것임 
}

//자식 클래스
class Dog extends Animal{
	//추상메서드 구현
	@Override
	public void sound() {
		System.out.println("개는 멍멍멍~~");
	}
}

class Cat extends Animal{
	//추상메서드 구현
	@Override
	public void sound() {
		System.out.println("고양이는 야옹^^");
	}
}

public class AbstractMain03 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.breathe();
		d.sound();
		System.out.println("========================");
		Cat c = new Cat();
		c.breathe();
		c.sound();
	}
}

//필수적인데 일반화 되지 않은 것들은 일단 부모- 추상화 자식- 구체적으로 구현 > 이럴때 abstract사용
//일반화 되는 것들은 위 breathe 처럼 그냥 일반 객체 생성해서 하면 됨