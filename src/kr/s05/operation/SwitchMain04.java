package kr.s05.operation;

public class SwitchMain04 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 
		 * 두 개의 정수와 연산자를 입력한 후 연산의 결과를 출력하시오
		 * 
		 * (입력 예시)
		 * 첫번째 수:10
		 * 연산자:+ // next() 사용
		 * 두번째 수:20 //nextInt() 사용
		 * 
		 * (출력 예시)
		 * 10 + 20 = 30
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
//		int result = 0;
		
		System.out.print("첫번째 수:");
		int a = input.nextInt();
		
		System.out.print("연산자:");
		String str = input.next();
		
		System.out.print("두번째 수:");
		int b = input.nextInt();
		
		switch(str) {
		case "+":
//			result = a + b; break;
//			System.out.printf("%d %s %d = %d%n", a, str, b, result);
			
			System.out.printf("%d %s %d = %d%n",a,str,b,(a+b));
			break;
		case "-":
//			result = a - b; break;
			
			System.out.printf("%d %s %d = %d%n",a,str,b,(a-b));
			break;
		case "*":			
			System.out.printf("%d %s %d = %d%n",a,str,b,(a*b));
			break;
		case "/":
			System.out.printf("%d %s %d = %f%n",a,str,b,(double)a/b);
			break;
		case "%":
			System.out.printf("%d %s %d = %f%n",a,str,b,(double)a%b);
			break;
		default:
			System.out.println("잘못된 연산자 입력");
			System.exit(0); // 여기서 break써서 나가버리면 바깥 문장이 실행되니까 그냥 종료시켜버리는것.
		}
		
		System.out.println(); //단순 줄바꿈
		input.close();
		
	}

}
