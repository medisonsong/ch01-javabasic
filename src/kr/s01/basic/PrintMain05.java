package kr.s01.basic;
public class PrintMain05 {
	public static void main(String[] args) {
		//System.out.printf(포맷문자, 데이터)를 이용한 출력
		//(데이터의 종류를 표시할 수 있는 포맷문자 지원)
		
		//문자 (%c)
		System.out.printf("%c%n", 'A'); // A가 %c로 들어가서 %c 형식에 맞게 출력됨
		System.out.printf("%6c%n", 'B'); // 6자리 확보, 오른쪽 정렬
		System.out.printf("%-6c%n", 'C'); // 6자리 확보, 왼쪽 정렬
		System.out.println("=================");
		
		//정수 (%d), 숫자들은 포맷문자로 인해서 결과적으로는 가공 후 문자열로 출력됨 
		System.out.printf("%d%n", 67);
		System.out.printf("%5d%n", 8); // 5자리 확보, 오른쪽 정렬
		System.out.printf("%-5d%n", 3); // 5자리 확보, 왼쪽 정렬
		System.out.printf("%,d원%n", 100000); // 3자리 단위로 쉼표 표시
		System.out.println("=================");

		//실수 (%f)
		System.out.printf("%f%n", 35.896); //소수점 6자리 확보, 비어있는 자리는 0으로 채움
		System.out.printf("%.2f%n", 35.896); //3번째 자리에서 반올림 후 2번째 자리까지 나타냄
		System.out.printf("%10.2f%n", 35.896); //10자리를 확보하고 오른쪽부터 표시, 소수점 둘째자리까지 출력
		System.out.println("=================");
		
		//문자열 (%s)
		System.out.printf("%s%n", "우주");
		System.out.println("=================");
		
		//논리값 (%b)
		System.out.printf("%b%n", true);
		System.out.printf("%b%n", false);
		System.out.println("=================");
		
		//데이터의 종류가 여러 개일 경우
		System.out.printf("%s는 %d점입니다.%n", "점수", 98);
		
		/*
		 * <정리>
		 *우측 정렬: %0d / 좌측 정렬: %-0d / 숫자 끊기 %,d / 원 붙이기 %,d원
		 * printf는 뒤 데이터를 가공해서 "" 안에 있는 내용이 출력됨
		 */
	}
}
