package kr.s24.object.supertest;

//부모 클래스
class People{
	int a = 100;
	
	//기본생성자 (생략되어있고 자동으로 들어가있음)
	public People() {
		//object의 인자가 없는 생성자 호출
		super();
	}
}
//자식 클래스
class Student extends People{
	int b = 200;
	
	//기본생성자 (생략되어있고 자동으로 들어가있음)
	public Student() {
		//부모 클래스의 인자가 없는 생성자 호출
		super();
	}
}

public class SuperMain03 {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.a);
		System.out.println(s.b);
	}
}
//지금까진 몰라도 됐지만 (명시 안해도 상관 없는 상황이라서)
//이제 꼭 필요한 상황을 학습해봅시다용