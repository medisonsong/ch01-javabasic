package kr.s27.lang.stringbuffer;

public class StringBufferMain {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("여름 덥다!!"); //문자열 생성
										   //0123456
		System.out.println("1:" + sb);
		
		//가공 작업(문자 추가)
		sb.insert(2, '이'); // 앞이 인덱스 번호, 뒤가 추가할 문자 >index[2]에 이 를 추가한다는 뜻
		System.out.println("2:" + sb);
		
		//문자열을 기존 문자열의 뒤에 추가
		sb.append("가을은 ");
		System.out.println("3:"+sb);
		
		sb.append("시원하다.");
		System.out.println("4:"+sb);
		
		//시작 인덱스부터 끝 인덱스 전까지 문자열 대체
		sb.replace(0, 3, "여행가자!!"); // 
		System.out.println("5:"+sb); // 0 1 2 (3-1)까지 문자열 대체
		
		//지정한 인덱스의 문자를 삭제
		sb.deleteCharAt(0);
		System.out.println("6:"+sb);
		
		//시작 인덱스와 끝 인덱스 전까지 문자열 삭제
		sb.delete(0, 3); // 0 1 2 만 삭제
		System.out.println("7:"+sb);
		
		//StringBuffer -> String 변환
		String str = sb.toString();
		System.out.println("str = " + str);
		
		System.out.println(str.length());
	}
}
