package kr.s24.object6.inter;

//인터페이스
interface A2{
	//추상메서드
	public abstract void make(); // 원형
	void play(); // public abstract 생략된 추상메서드
}

//인터페이스는 상속이 아닌 보통 우회적으로 or 구현이라는 단어를 사용함/ 근데 책은 간략하게 구현,상속 등 단어 쓰기 때문에 혼동 X

//일반 클래스
class B2 implements A2{ // A2 인터페이스를 구현하기 위한 일반 클래스 B2
	//인터페이스의 추상메서드 구현
	@Override
	public void make() {
		System.out.println("make 메서드");
	}
	@Override
	public void play() {
		System.out.println("play 메서드");
	}
}

public class InterMain02 {
	public static void main(String[] args) {
		B2 bp = new B2();
		bp.make();
		bp.play();
	}
}

/*
 * 인터페이스는 클래스가 못하는 것들, 클래스로 하기 귀찮은 것들을 맡아서 해줌
 * 추상메서드처럼 인터페이스도 형식만 있어서
 * 형식을 인터페이스에서 만들고 클래스로 구현함. 한마디로 인터페이스는 틀을 가지고 있는거고 틀에 맞게끔 구현만 하면 되는거임
 * 팀장: 인터페이스 구현-> 인터페이스 내에 있는 메서드들 하나씩 어떻게 구현해라 이런 식으로 주석처리+전달
 * 팀원: 주석대로 내용 구현
*/
