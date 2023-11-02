package kr.s19.object.Array;
import java.util.Scanner;
public class ScoreMain {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 1. Scanner 객체 생성
		 * 2. 배열의 길이가 4인 scoreArray 배열 생성
		 * 3. 변수 전체 과목 총점(total), 전체 과목 평균(avg) 생성 -> 전체 과목 총점, 평균 .. 총점 구한후 평균 구하기
		 * 4. Score 객체를 4개 생성해서 배열에 저장
		 * 		이름, 국어, 영어, 수학 점수 입력 받아서 객체에 저장하시오.
		 * 5. 반복문을 이용한 객체의 멤버 변수 값 출력
		 *    이름, 국어, 영어, 수학, 총점, 평균, 등급
		 * 6. 전체 과목 총점, 전체 과목 평균 출력
		 */
			
		Scanner input = new Scanner(System.in);
		Score scoreArray[] = new Score[4];
		
		int total = 0;
		int avg = 0;
		
		for (int i=0; i<scoreArray.length;i++) {
			System.out.print("이름:");
			String name = input.nextLine();
			System.out.print("국어:");
			int korean = input.nextInt();
			System.out.print("영어:");
			int english = input.nextInt();
			System.out.print("수학:");
			int math = input.nextInt();
			
			input.nextLine(); // enter를 흡수하는 역할임 
			//수학 입력 다 하고 엔터 누르면 이름 건너뛰고 국어부터 시작하는거 방지하기 위해서 넣었음. 어쩐지 계속 국어 나오더라..
			
			scoreArray[i] = new Score(name, korean, english, math);
			System.out.println("----------------------");
		}
		
		for(Score s : scoreArray) {
			System.out.printf("%s\t", s.getName());
			System.out.printf("%d\t", s.getKorean());
			System.out.printf("%d\t", s.getEnglish());
			System.out.printf("%d\t", s.getMath());
			System.out.printf("%d\t", s.makeSum());
			System.out.printf("%d\t", s.makeAvg());
			System.out.printf("%s\n", s.makeGrade());
			
			//전체 과목 총점
			total += s.makeSum();
		}
		avg = total / (scoreArray.length * 3); // 4*3이 됨 학생수*과목수
		
		System.out.println("----------------------");
		System.out.printf("전체 과목 총점 : %d, 전체 과목 평균 : %d", total, avg);

		input.close();
	}
	
}
