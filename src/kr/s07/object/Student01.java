package kr.s07.object;

public class Student01 {//메인 안이 아닌 클래스 영역에다가 만들었음. 객체에 포함시키려면 클래스 영역에다 만들어야함.
	
	//멤버 변수 (Student01이라는 그룹안에 name이랑 age가 들어가있는 모습임)
	String name;
	int age;
	
	public static void main(String[] args) {
		//객체 선언
		Student01 student; //Student01 자료형 student 변수
		//객체 생성
		student = new Student01(); //이렇게 하면 메모리에 저장이 됨
		//student는 Student01 메모리 주소가 기억됨. Student01(그룹)안에는 name, age가 포함되어 있음 
		
		//객체의 멤버 변수에 값 할당
		student.name = "홍길동"; //.이 하위를 뜻하니까 student 하위 name은 홍길동 이라는 듯임
		student.age = 20;
		
		//객체의 멤버 변수 값 출력
		System.out.println(student.name + ", " + student.age);
		
	}
}


