package kr.s28.lang.math;
import java.util.Random;
import java.util.Arrays; // 정렬하는 클래스
public class RandomMain03 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 로또 프로그램 제작
		 * 길이가 6인 int형 배열 생성하고, 1~45 숫자 범위로 난수를 구함
		 * 중복되지 않는 6개의 숫자를 생성해서 배열에 저장
		 * 난수 생성: Math.random() 또는 Random 클래스의 nextInt() 메서드 사용 가능
		 */
		
		//선생님 방법
		
		//로또 번호를 저장할 배열 생성
		int[] lotto = new int[6];
		Random random = new Random();
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = random.nextInt(45)+1; //일단 데이터를 넣고 중복체크
			
			//중복된 숫자가 있는지 검증
			for(int j=0; j<i; j++) { //i값을 포함하면 자기자신과도 비교를 하게됨. 자기 이전에 입력된 데이터들과 비교하는 반복문
				if(lotto[i] == lotto[j]) { //중복된 값
					System.out.println("~~~~" + lotto[i]); //하면 중복된 값 볼 수 있음 (j라고 해도 되고 i라고 해도 됨)
					 i--; //앞으로 안 넘어가고 제자리로 돌아옴 => (다음 루프로 넘어가지 못하고 현재 루프에서 새로 값을 입력할 수 있도록 처리)
					 break;//for문 나가서 다시 반복문 시작(랜덤)
				}
			}
		}
		//오름차순 정렬
		Arrays.sort(lotto); //sort(int형); 하면 int형 자료를 오름차순 시킴
		
		//확장 for문을 이용한 출력
		for(int num : lotto) {
			System.out.print(num + "\t");
		}
		
	}
}

/*
내방법..

int[] lotto = new int[6];

for(int i=0; i<lotto.length; i++) {
			int number = (int)(Math.random()*45)+1;
			if(lotto[i] == number) {
				continue;
			}
			lotto[i] = number;
			System.out.println(lotto[i]);
		}
*/