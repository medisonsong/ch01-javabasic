package kr.s24.object2.poly;

//부모 클래스
class A{
	public void make() {
		System.out.println("make 메서드");
	}
}

//자식 클래스
class B extends A{
	public void play() {
		System.out.println("play 메서드");
	}
}


public class PolyMain02 {

	public static void main(String[] args) {
		B bp = new B(); 
//   2) B타입을 쓴다 => 호출 전체 가능
//              1) B 객체를 형성하는데
		bp.make();
		bp.play();
		
		A ap = bp; // 자식 클래스 타입 -> 부모 클래스 타입 형변환
		//업 캐스팅, 자동적으로 형 변환
		
		ap.make();
		//호출 범위를 벗어나 호출 불가능
		//ap.play();
		
		B bp2 = (B)ap; // 부모 클래스 타입 -> 자식 클래스 타입으로 형변환
		//다운 캐스팅, 명시적으로 형변환 () 꼭 넣어줘야함
		
		bp2.make();
		bp2.play();
		

	}
}
