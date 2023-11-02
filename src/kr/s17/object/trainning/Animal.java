package kr.s17.object.trainning;

public class Animal {
	/*
	 * [실습]
	 * 1. 멤버 변수: 이름(name), 나이(age), 비행 여부(fly)
	 * 2. 생성자 지정: 인자가 없는 생성자, 인자가 있는 생성자(name, age, fly) -> 2개 만들기
	 * 3. set/get 메서드 지정: 멤버 변수를 private으로 지정하고, public한 set/get 메서드
	 */
	//1
	private String name;
	private int age;
	private boolean fly;
	
	//2
	public Animal() {}
	
	public Animal(String name, int age, boolean fly) {
		this.name = name;
		this.age = age;
		this.fly = fly;
	}
	/*
	//3
	public void set(String name, int age, boolean fly) {
		this.name = name;
		this.age = age;
		this.fly = fly;
	}
		
	public void get() {
		System.out.println("이름 : " + this.name);
		System.out.printf("나이 : %d살%n", this.age);
		if(this.fly) { //this.fly자체가 true/false라서 = 안넣어도됨.
			System.out.println("비행 여부 : 가능");
		}else {
			System.out.println("비행 여부 : 불가능");
		}
	}
	// 이걸 한꺼번에 하면 안되는건가..?!?!?
	*/
	
	public void SetName(String name) {
		//멤버변수    지역변수
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void SetAge(int age) {
		//멤버변수    지역변수
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void Setfly(boolean fly) {
		//멤버변수    지역변수
		this.fly = fly;
	}
	public boolean isFly() {
		return fly;	
	}
	
	public static void main(String[] args) {
	
	}
}

