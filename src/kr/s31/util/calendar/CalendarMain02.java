package kr.s31.util.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarMain02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		//현재 날짜와 시간을 구함
		Calendar cal = Calendar.getInstance();
		System.out.println("희망 연도와 월을 입력하세요!!(ex 연도 : 2023, 월 : 9)");
		System.out.print("연도 : ");
		int year = input.nextInt();
		System.out.print("월 : ");
		int month = input.nextInt();
		
		//입력한 월로 세팅/ 1일의 요일 알아내고 그 이전 요일은 공백으로 채워줌/ 루프 돌면서 +1씩 채워주는데 토요일 이후로
		//줄바꿈을 하기 때문에 토요일에 줄바꿈처리+ 매주 토요일 일수를 알아내는 게 목표
		
		System.out.println("        [" + year + "년 " + month + "월]");
		System.out.println("---------------------------------");
		System.out.println("  일 월  화 수  목  금 토  "); //공백2 일1 => 총3
		
		//희망 연도, 월, 일 세팅
		cal.set(year, month-1, 1); // index는 0부터 시작하기 때문에 input month-1 을 꼭 해야함
								  //1일을 알아내고 요일을 알고 그 이전 요일들을 공백 처리해야함. 안그러면 1일이 항상 일요일일것
		//1일부터 시작하기 때문에 1일의 요일을 구함
		int week = cal.get(Calendar.DAY_OF_WEEK); //요일 1(일요일)~7(토요일)
		int lastOfDate = cal.getActualMaximum(Calendar.DATE); //달의 마지막 날짜
		
		//1일 전 공백 만들기
		for(int i=1; i<week; i++) {
			System.out.printf("%3s", " "); //3자리 확보하고 s(공백) 넣기 (1일 이전 요일 공백처리)
		} 
		// 만약 23.9월 기준 금요일이 6 (week=6) 이면 1~5까지 공백 넣는다는 뜻
		
		//1~마지막 날까지 반복 / 마지막 날짜까지 포함해서 표시해야하기 때문에 <=라고 했음
		for(int i=1; i<=lastOfDate; i++) {
			System.out.printf("%3d", i); //i가 날짜역할임
			//토요일마다 줄바꿈을 해줘야하기 때문에 날짜 출력 후 줄바꿈
			if(week%7==0) System.out.println();
			//week(그 달의 첫째날)에서 +가 되어야지 요일이 계속 바뀌기 때문에 ++
			week++;
		}
		System.out.println("================================");
		
		input.close();
	}
}
