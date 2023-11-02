package kr.s06.array;

public class ArrayMain01 {
	public static void main(String[] args) {
		char[] ch; //배열 선언 / char[] 이 배열의 자료형이고 ch가 배열 선언한다는 얘기임.
		ch = new char[4]; //배열 생성
		
		//배열의 초기화
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a'; 
		
		//배열의 요소 출력 = 저장된 데이터를 출력한다는 뜻임
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		System.out.println("--------------");
		
		//반복문을 이용한 배열의 요소 출력
		// for(int i=0;i<4;i++) { //i<4 -> 방의 개수를 알아야 할 수 있는 반복문임
		for(int i=0;i<ch.length;i++) { //이러면 ch.length만큼 가능 (0부터 시작이니까) / 중간의 .은 하위라는 뜻
			System.out.println("ch["+i+"]:"+ch[i]); //i: 0~3
		}
		
		System.out.println("-----------------");
			
		//배열의 선언, 생성 같이
		int[] it = new int[6]; // int=배열의 자료형 / int[] it 여도 되고 int it[] 라고 기재해도 됨.
		
		//배열의 선언, 생성(명시적 배열 생성), 초기화
		char[] ch2 = new char[] {'자', '바'}; //new char[]가 있으면 명시적 배열 생성.
		//선언, 생성, 초기화 할때는 new char[여기] 안에 배열 길이를 기재하지 않는다 오히려 new char[2]라고 명시하면 에러 남...!!!!!
		
		//배열의 선언, 생성(암시적 배열 생성), 초기화
		char[] ch3 = {'강', '남', '구'}; // new char[] 없이 바로 {초기화}; 하면 암시적 배열 생성.
		//둘다 비슷한 비율로 사용하는데 암시적 배열 생성이 코드를 조금 더 줄일 수 있어서 이걸 조금 더 많이 쓰는 듯..!
		
	}
}
