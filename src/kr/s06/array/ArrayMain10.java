package kr.s06.array;

public class ArrayMain10 {
	public static void main(String[] args) { // 메인함수 단축키> main 누르고 ctrl+space
		/*
		 * [실습] 1) 10, 20, 30, 40, 50을 초기값으로 갖는 1차원 배열을 test이름으로 선언, 생성, 초기화 하시오.
		 * 2) 반복문을 이용해서 1) 배열을 출력하시오.
		 * 3) 확장for문을 이용해서 출력하시오
		 * 4) 인덱스3의 데이터를 100으로 변경하시오.
		 * 5) 마지막 요소의 값을 200으로 변경하시오.
		 * 6) 반복문을 사용하여 모든 요소의 값을 0으로 초기화하시오.
		 * 7) 홀수 인덱스에 10, 짝수 인덱스에 20 저장
		 * 8) 모든 요소의 총합과 평균(총합의 요소를 수로 나눔) 구하고 출력하시오. (총합- sum, 평균- avg)
		 */

		int[] test = { 10, 20, 30, 40, 50 };
		int sum = 0;
		float avg = 0.0f;

		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}

		System.out.println("--------------------");

		for (int num : test) {
			System.out.println(num);
		}

		System.out.println("--------------------");
		
		test[3] = 100;
		//마지막 인덱스 구하기 => length-1
		test[test.length-1] = 200; // 아까 4라고 했는데 test.length-1 해도 됨. 으으으으 이거 할까말까 했는딩 

		for (int i = 0; i < test.length; i++) {
			test[i] = 0;
			System.out.println(test[i]);
		}
		System.out.println("----------------");
		
		for(int i=0; i<test.length; i++) {
			if(i%2==0) {
				test[i]=20;
			}else {
				test[i]=10;
			}
			System.out.println(test[i]);
		}
		
		for (int i = 0; i < test.length; i++) {
			sum += test[i];
		}

		avg = sum / (float) test.length;

		System.out.printf("총합 : %d%n", sum);
		System.out.printf("평균 : %.2f", avg);

	}

}
