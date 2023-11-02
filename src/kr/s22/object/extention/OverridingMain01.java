package kr.s22.object.extention;

//부모 클래스
class GrandParent{
	public String getCar() {
		return "구형 자동차";
	}
}

//자식 클래스
class Father extends GrandParent{ 
	/*
	 * Method Overriding, 메서드 재정의
	 * 상속관계에서 자식클래스에 메서드 재정의를 하면 부모클래스의 메서드가
	 * 호출되는 것이 아니라 자식클래스의 메서드가 호출됨 
	 * 메서드의 구조(뼈대)가 같아야 오버라이딩 가능 public String~ return 까지.
	 */
	public String getCar() {
		return "신형 자동차"; 
	}
}

class Uncle extends GrandParent{
	
}

public class OverridingMain01 {
	public static void main(String[] args) {
		Father ft = new Father();
		System.out.println(ft.getCar());
		
		Uncle uc = new Uncle();
		System.out.println(uc.getCar());
	}
}

//부모 값을 바꾸면 안되냐? 에 대한 대답 -> 상속관계에선 부모 1 자식 多 관계라서 부모를 바꾸면 나머지 자식도 다 바껴버림
//그래서 그냥 자식 메서드에서 오버라이딩하는게 맞는 방법임.
