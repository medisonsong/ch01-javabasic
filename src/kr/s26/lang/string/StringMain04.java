package kr.s26.lang.string;
import java.util.Scanner;
public class StringMain04 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 입력 받은 문자열을 한 문자씩 읽어서 역순으로 표시하시오.
		 * 
		 * (입력 예시)
		 * 문자열 : hello
		 * 
		 * (출력 예시)
		 * olleh (char로 읽고 역순으로 출력)
		 * 
		 * 뒤에서부터 읽어서 출력하면 된다는디 뭔소리지 
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String n = input.nextLine();
		
		/*
		 * for(int i=0; i<n.length(); i++) {
		 * System.out.print(n.charAt(i)); //이렇게 입력하면 우리가 입력한 순서대로 출력됨
		 * }
		 */
		
		for(int i=n.length()-1; i>=0; i--) {
			System.out.print(n.charAt(i));
		}
		
		input.close();
	}
}

//입력 받고 읽을 때 for문으로 인덱스 반대로 읽고 출력 charAt(i) i인덱스에 맞춰서 문자 추출
