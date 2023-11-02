package kr.s07.object;

public class Student04 {
	//멤버 변수
	String name;
	int korean;
	int math;
	int english;
	int sum;
	double average;
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		Student04 student = new Student04();
		student.name = "차은우";
		student.korean = 98;
		student.math = 95;
		student.english = 97;
		//총점 구하기
		student.sum = student.korean + student.math + student.english;
		//평균 구하기
		student.average = student.sum / 3.0;
		
		//객체의 멤버 변수의 값 출력
		System.out.println("이름 : " + student.name);
		System.out.println("국어 : " + student.korean);
		System.out.println("수학 : " + student.math);
		System.out.println("영어 : " + student.english);
		System.out.println("총점 : " + student.sum);
		System.out.printf("평균 : %.2f", student.average);
		
	}
}
//장점 -> 배열로 했다면 같은 자료형으로만 처리해야하기 때문에 sum까진 가능한데 name, average는 따로 빼야함
//		 우리가 원하는대로 자료형을 쓸 수 있다는게 객체의 장점임
// 기본문법 공부 후 API도 공부하기