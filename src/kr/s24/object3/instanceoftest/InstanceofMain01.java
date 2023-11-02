package kr.s24.object3.instanceoftest;

//부모 클래스
class Parent{
	// Object의 toString 재정의
	@Override
	public String toString() { 
		return "Parent 클래스";
	}
}
//자식 클래스
class Child extends Parent{
	@Override
	public String toString() {
		return "Child 클래스";
	}
}

public class InstanceofMain01 {
	public static void main(String[] args) {
		Parent p = new Parent();
		
		//컴파일 오류는 없지만 실행시 오류가 발생함 (parent 객체 생성 후 child를 호출하니까/ 메모리에 child가 없기 때문에)
		//Child ch = (Child)p;
		
	 //생성된 객체       사용 가능한 자료형
		if(p instanceof Child) { //p (생성된 객체)가 child를 사용할 수 있느냐? 라는 뜻임
			//생성된 객체가 Child 타입을 사용할 수 있음
			Child ch2 = (Child)p;
			System.out.println(ch2);
			System.out.println("~~~~~~~~~~~~~~~~~~");
		}else {
			//생성된 객체가 Child 타입을 사용할 수 없음
			System.out.println(p);
			System.out.println("+++++++++++++++");
		}
	}
}

//instanceof > 상속관계일 때, 연산자를 이용해서 테스팅할 수 있는지 사용해보는거 (상속관계가 아니면 사용할 수 없음)
