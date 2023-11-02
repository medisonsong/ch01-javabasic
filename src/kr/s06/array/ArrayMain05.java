package kr.s06.array;

public class ArrayMain05 {
	public static void main(String[] args) {
		//배열 선언 및 생성, 초기화
		int[] array = {10,20,30,40,50};
					 //0, 1, 2, 3, 4 / length = 5
		//반복문을 이용한 배열의 요소 출력
					// 배열의 길이
		for(int i=0; i<array.length; i++) {
			System.out.println("array[" + i + "]:" + array[i]);
		}
		System.out.println("----------------------------");
		//개선된 루프(확장 for문)
			// 변수명 : 배열명
		for(int num : array) { // 위에처럼 인덱스를 사용해서 반복하지 않고 num 변수를 생성해서 반복함.
			System.out.println(num);
		}
		// 정리: 배열 반복문 (2가지/ 1) 일반for문 : index사용/ 2) 확장for문 : 값만 사용)
	}
}

