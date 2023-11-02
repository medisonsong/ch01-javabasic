package kr.s04.operator;

public class OperatorMain04 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때
		 * 학생당 몇 개를 가질 수 있고, 최종적으로 몇 개가 남는지를 구하시오.
		 * 
		 * (출력 예시)
		 * 학생 한 명이 가지는 연필 수 : **
		 * 남은 연필 수 : **
		 */
		
		int pen = 534, stu = 30;
		int a = pen / stu;
		int b = pen % stu;
		System.out.printf("학생 한 명이 가지는 연필 수 : %d%n", a);
		System.out.printf("남은 연필 수 : %d%n", b);
		
		//println으로 표시하는 방법
		System.out.println("학생 한 명이 가지는 연필 수 : " + pen / stu); // /가 +보다 상위라서 먼저 연산
		System.out.println("남은 연필 수 : " + a % b);
	}
}
