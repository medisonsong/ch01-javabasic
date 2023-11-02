package kr.s20.object.extention;

//부모 클래스
class Parent extends Object{ // extends Object >> Parent(부모)클래스의 부모클래스는 extends Object임. 기본적으로 생략되고, 자동으로 object가 상속됨
	int a = 100;
}

//자식 클래스
class Child extends Parent{ // extends 부모클래스명{ -> 상속
	int b = 200;
}

public class ExtentionMain01 {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
	}
}

