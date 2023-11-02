package kr.s06.array;

public class ArrayMain02 {
	public static void main(String[] args) {
		//배열 선언 및 생성
		//배열을 생성하면 배열의 요소로 기본값이 저장됨
		//정수형 배열은 0을 기본값으로 배열을 생성
		
		int[] array = new int[5];
		//변수는 생성하면 메모리가 만들어진 후 초기 데이터가 없는데,
		//배열은 기본값으로 데이터가 들어간다. int일 경우에는 0으로 들어감.
	
		
		//반복문을 이용한 요소의 출력
		              //배열의 길이
		for(int i=0;i<array.length;i++) {
			System.out.println("array["+i+"]:"+array[i]); // 이러면 데이터가 들어간걸 볼 수 있음..! array[0]:0 이런식으로 출력됨
		}
		
		// 배열 생성하면 자바 파일 기본자료형의 종류에 기본값이 들어감
		//논리형-false 문자형-\u0000 정수형-0 실수형-0.0
		
		System.out.println("----------------------");
		
		//배열의 요소 변경
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		//없는 인덱스를 호출하면 오류 발생
        // array[5] = 60;
		
		
		//반복문을 이용한 배열의 요소 출력
		for(int i=0;i<array.length;i++) {
			System.out.println("array[" + i + "]:" + array[i]);
		}
		
	}
}
