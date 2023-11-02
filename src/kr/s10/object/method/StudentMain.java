package kr.s10.object.method;

public class StudentMain {
	//<멤버 변수>
	String name;
	int korean;
	int math;
	int english;
	
	//<멤버 메서드>
	
	//총점 구하기 
	public int makeSum() { // StudentMain 내에 name,korean등과 같이 같은 저장된 값이라서 인자를 넣지 않아도 위에 있는 멤버 변수를 갖다 쓸수있음.
		return korean + math + english;
	}
	
	//평균 구하기
	public int makeAverage() {//메서드 안에서 멤버변수를 쓸수 있는 것처럼 메서드 안에서 메서드를 호출할 수 있음
		return makeSum() / 3;
	}
	
	//등급 구하기
	public String makeGrade() {
		String grade;
		switch(makeAverage()/10) {
		case 10:
		case 9: grade = "A";break; //앞에 string이어서 ""
		case 8: grade = "B";break;
		case 7: grade = "C";break;
		case 6: grade = "D";break;
		default: grade = "F";
		}
		return grade;
	}
	
	public static void main(String[] args) {
		StudentMain student = new StudentMain();
		student.name = "서강준";
		student.korean = 98;
		student.math = 97;
		student.english = 96;
		
		System.out.println("이름 : " + student.name);
		System.out.println("국어 : " + student.korean);
		System.out.println("수학 : " + student.math);
		System.out.println("영어 : " + student.english);
		System.out.println("총점 : " + student.makeSum());
		System.out.println("평균 : " + student.makeAverage());
		System.out.println("등급 : " + student.makeGrade());
	}
}
