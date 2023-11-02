package kr.s24.object.supertest;

class Mother{
	public String getLunch() {
		return "밥";
	}
}
class Daughter extends Mother{
	//메서드 오버라이딩(재정의)
	@Override
	public String getLunch() {
		return "마라탕"; //오버라이딩이 강력해서 다시 부모 메서드 호출을 못하는데 super를 사용하면 가능함
	}

	public String getRice() {
		//부모클래스의 getLunch 메서드 호출
		return super.getLunch();
	}
}

public class SuperMain01 {
	public static void main(String[] args) {
		Daughter d = new Daughter();
		System.out.println("딸은 " + d.getLunch() + "을 먹습니다.");
		System.out.println("딸은 오늘은 왠지 " + d.getRice() + "이 먹고 싶어졌다!");
	}
}





