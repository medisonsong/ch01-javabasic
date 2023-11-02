package kr.s24.object6.inter;

interface I{
	public abstract void play();
}

class Pianist implements I { // 부모 object
	@Override
	public void play() {
		System.out.println("피아노를 연주하다.");
	}
}

class Cellist implements I { // 부모 object
	@Override
	public void play() {
		System.out.println("첼로를 연주하다.");
	}
}

class Stage{
	public void autoPlay(I i) {
		i.play();
	}
}

public class InterMain04 {
	public static void main(String[] args) {
		Stage a = new Stage();
		a.autoPlay(new Pianist()); // Pianist 타입이 I 타입이 됨
								   // 클래스 타입 -> 인터페이스 타입으로 형변환
		a.autoPlay(new Cellist()); // Cellist 타입이 I 타입이 됨
								   // 클래스 타입 -> 인터페이스 타입으로 형변환
	}
}

/*
 * <상속>
 * 클래스: 클래스간 단일 상속만 가능
 * 인터페이스: 인터페이스간 다중상속 가능 (-> 인터페이스에는 내용이 없고 형식만 있기 때문에 가능함)
 * ---------------------------------------------
 * <구현>
 * 클래스-인터페이스 간 여러 개 구현 가능
 * 
 */
