package kr.s09.object.instance;

public class InstanceMain {
	//<클래스의 기본 구조>
	//멤버 변수
	int var1;
	String var2;
	
	//생성자 (생략 가능함)
	public InstanceMain() {} 
	
	//멤버 메서드
	public int sum(int a, int b) { //sum-메소드명 int a-인자값 / 객체 생성 후 객체 안에 함수가 포함된 형태를 메서드라고 함..다네용
		return a + b;
	} // return이 보이면 함수 밖에서 입력+실행시키면 함수 바깥으로 결과를 반환함.
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		//자료형   참조자료형(me)     생성자
		InstanceMain me = new InstanceMain();
		System.out.println("me : " + me); //주소값이 뜸 근데 자바에선 별 필요 없음. me : kr.s09.object.instance.InstanceMain@372f7a8d
		
		int result = me.sum(5, 6);
		System.out.println("result = " + result);
		
	}
	
}
