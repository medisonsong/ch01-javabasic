package kr.s30.util.date;

import java.text.SimpleDateFormat; // date 한글화 + 형식 지정
import java.text.DateFormat; // 한글화하는 패키지 import
import java.util.Date; // 기본 date 표기

public class DateMain {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.toString()); // object의 toString을 date쪽에서 재정의해서 now랑 똑같은 값이 나옴
		System.out.println("---------------------------");
		//deprecated가 되어 사용하지 않음
		System.out.println(now.toLocaleString()); // 한글화 (근데 금지당한)
		System.out.println("---------------------------");
		
		DateFormat df = DateFormat.getInstance();
		//지금까지는 생성자를 이용해서 만들었는데 dateformat은 getInstance 메서드 내에서 만들어서 반환하기 때문에
		//DateFormat.getInstance() 를 붙여야함
		String today = df.format(now); //연도 두자리 수 반환 23 (시간 초 없음)
		System.out.println(today);
		System.out.println("---------------------------");
		
		df = DateFormat.getDateTimeInstance(); //연도 네자리 수 반환 2023 (시간 초 포함)
		today = df.format(now);
		System.out.println(today);
		System.out.println("---------------------------");
		
		df = DateFormat.getDateInstance(); // 시간 없이 날짜만 출력(연도 4자리)
		today = df.format(now);
		System.out.println(today);
		System.out.println("---------------------------");
		
		df = DateFormat.getTimeInstance(); // 시간만 출력
		today = df.format(now);
		System.out.println(today);
		System.out.println("---------------------------");
		
		//simple date format은 dateformat의 자식 데이터포맷임 근데 얘는 이제 부모가 23.9.13. 이라고 형식이 정해져있는데 비해
		//본인이 설정할 수 있는거임
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/package-summary.html
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년 MM월 dd일 (E) a hh:mm:ss");
		today = sf.format(now);
		System.out.println(today);
	}
}

//년월일 시분초 -> 다 뽑기 위해선 util.date 사용
//개별적으로 뽑을땐 simple 이나 그냥 get 사용