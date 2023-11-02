package kr.s31.util.calendar;

import java.util.Calendar; // calendar도 안에 있어서 import해야함

public class CalendarMain01 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		
		int year = today.get(Calendar.YEAR); // get이라는 메서드 안에 연도에 해당하는 상수를 넣으면 됨. static한 상수라서 Calendar.+YEAR (연도 읽어오기)
		int month = today.get(Calendar.MONTH)+1; //월 (0~11) 이기 때문에 +1로 해야함 안그러면 현재 월수보다 -1로 표기됨
		int date = today.get(Calendar.DATE);
		
		System.out.printf("%d년 %d월 %d일 ", year, month, date); 
		
		int day = today.get(Calendar.DAY_OF_WEEK); // 요일 1~7 아래 인덱스에 넣어야 해서 -1 해야함
		
		String[] days = {"일", "월", "화", "수", "목", "금", "토"}; // 0 1 2 3 4 5 6  
		System.out.print(days[day-1] + "요일"); //배열로 요일 표기
		
		int amPm = today.get(Calendar.AM_PM); // ampm 알려주는거고 오전은 0 오후1 이라고 알려줌
		//삼항연산자로 읽어도 되고 배열로 읽어도 됨
		String str = amPm == Calendar.AM ? "오전" : "오후";
//					조건식(amPm=Calendar.AM) ? true=0="오전 : false=1="오후"
		
		//HOUR는 0~11시, 정오와 자정은 12시가 아니라 0시로 표시됨
		int hour = today.get(Calendar.HOUR); // 시(12시 기준) / 24시로 하고 싶으면 HOUR_OF_DAY 라고 하면됨(24시 표기)
		int min = today.get(Calendar.MINUTE); // 분
		int sec = today.get(Calendar.SECOND);
		
		System.out.printf(" %s %d시 %d분 %d초", str, hour, min, sec);
	}
}
// calendar은 데이터가 많아서 상수를 사용해서 년월일시분초를 뽑아서 쓰면 됨
// 달력처럼 따로따로 상수 하나씩 필요한 경우에 사용하면 됨
// date format을 쓸 수도 있는데 너무 복잡해져서 그냥 calendar쓰는게 더 간단함
// date format은 한꺼번에 모든것을 표시할 때 사용, calendar는 연도만/ 일만/ 월만 등등 몇개만 뽑아내서 쓸 때 사용
