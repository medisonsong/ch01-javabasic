package kr.s06.array;

public class ArrayMain12 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 
		 * 요소의 수를 지정하고 지정된 수로 정수형 배열을 생성해서 해당 배열에
		 * 정수를 저장하시오.
		 * 배열에 저장된 요소를 역순으로 출력하시오.
		 * 
		 * [입력 예제]
		 * 요소수:3
		 * array[0] : 20
		 * array[1] : 10
		 * array[2] : 5
		 * 
		 * [출력 예시]
		 * 요소를 역순으로 정렬했습니다.
		 * array[0] : 5
		 * array[1] : 10
		 * array[2] : 20
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("요소수:");
		int num = input.nextInt();
		
		int array[] = new int[num];
		
		for(int i=0; i<array.length; i++) {
			System.out.print("array[" + i + "] : ");
			array[i] = input.nextInt();
		}
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		
		for(int i=(array.length-1); i>=0; i--) {
			System.out.println("array[" + i + "] : " + array[i]);
		}
		
		input.close();
		
		/*
		 * 선생님 풀이
		 * 
		 * 위엔 다 똑같고
		 * 역순 정렬
		 * for(int i=0;i<array.length/2;i++) {
		 * 	   int t = array[i];
		 * 	   array[i] = array[array.length-1-i];
		 * 	   array[array.length-1-i] = t; // 요소수가 3개라면 맨앞/맨마지막 요소들의 자리를 바꾸는 방법 
		 * }
		 * 
		 * System.out.println("요소를 역순으로 정렬했습니다.");
		 * for(int i=0; i<num; i++){
		 * 		System.out.println("array [" + i + "] : " + array[i]);
		 * }
		 * 
		 * input.close();
		 * 아 이게 왜 다르냐면 나는 그냥 역순으로 출력만 했고
		 * 선생님은 아예 데이터를 교체하고 출력했기 때문임..!
		 */
		
	}
}
