package kr.s02.variable;

public class VariableMain01 {
	public static void main(String[] args) {
		//변수(Variable)는 값을 저장할 수 있는 메모리의 공간
		//여러 차례 반복해서 사용하기 위해 변수를 선언함
		//변경될 수 있는 값: 변수 <> 상수: 고정되어 있는 값
		
		//변수 선언
		int num; // int=정수
		
		//변수의 초기화
		num = 17; // = 대입 /= == 같음
		
		//변수의 값 출력
		System.out.println(num);
		System.out.println("============");
		
		//변수 선언, 초기화
		int number = 20;
		System.out.println(number);
		
		//데이터 변경
		number = 40;
		System.out.println(number);
		System.out.println("===========");
			
		/* 주의사항
		 * 동일한 변수명으로 변수를 선언하면 오류 발생
		 * int number = 30; 선언 후 초기화할 때 int number=20; 이라고 하는 경우
		 * 그냥 number=20; 이라고만 해야함. 경고에 duplicate ~ 라고 뜸. 동일한 변수가 있다고.
		 */
	
		//동일한 자료형을 사용하기 때문에 두 번째 변수명 앞의 자료형은 생략 가능
		int a = 10, b = 20;
		int result = a + b; //변수에서 값을 호출해서 연산
		
		// 1. printf로 출력
		System.out.printf("result = %d%n", result);
		
		/* java 내 +
		+ : 연산 역할을 할 때 / 숫자 + 숫자
		+ : 연결 역할을 할 때 / 문자열+문자열, 문자열 + 숫자 -> 문자열과 숫자를 연결하여 새로운 문자열을 만듦 (순서 상관 x)
		*/

		// 2. println으로 출력
		System.out.println("result = " + result);
		
		//주의사항
		System.out.println("결과 : " + a + b); // 이렇게 하면 출력> 결과 : 1020 이라고 나옴
		/* 위 문장 구현 순서
		 * (결과 : ) + a, (결과 : a) + b > 결과 : 10 > 결과 : 1020 이 되버림
		 */
		System.out.println("결과 : " + (a + b)); //라고 하면 정상적으로 결과 : 30 출력됨
		
		//변수 선언
		int no;
		
		//변수 선언 후 출력 또는 연산하기 전에 반드시 초기화를 해야 함
		//System.out.println(no);
		
		
	}
}
