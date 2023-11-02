package kr.s26.lang.string;

public class StringMain03 {
	public static void main(String[] args) {
		String s1 = "  aBa  "; //공백2 aBa 공백2 문자열
		String s2 = "abc";
		int a = 100;
		String msg = null; // null = 객체 생성을 하지 않아서 주소가 없다는 뜻/ 초기화할 때 사용
		
		//문자열을 대문자로 반환
		msg = s1.toUpperCase();
		System.out.println("msg:"+msg);
		
		//문자열을 소문자로 반환
		msg = s1.toLowerCase();
		System.out.println("msg:"+msg);
		
		//old문자를 new문자로 대체
		msg = s1.replace("aB", "b");
		System.out.println("msg:" + msg);
		
		//앞, 뒤 공백 제거
		msg = s1.trim();
		System.out.println("msg:"+msg);
		//중간에 있는 공백은 데이터로 인정되기 때문에 a ba 라고 적혀있으면 trim으로는 제거할 수 없음. 그냥 문자 앞뒤만 가능. (다른건가능)
		
		//지정한 문자열이 포함되어 있으면 true 반환
		boolean f = s1.contains("aB"); // s1.contains("aB") s1에 aB를 포함하고 있느냐 라는 뜻임/ 포함되어 있으면 f=true, 아니면 f=false가 됨
		System.out.println("f:" + f);
		
		//지정한 문자열로 시작할 경우 true 반환
		f = s2.startsWith("ab"); //startsWith("ab") ab로 문자가 시작하고 있느냐 라는 뜻
		System.out.println("f:"+f);
		
		//지정한 문자열로 끝나는 경우 true 반환
		f = s2.endsWith("bc");
		System.out.println("f:" + f);
		
		//int -> String
		msg = String.valueOf(a); // 1) 메서드를 이용한 방법
		msg = a + ""; // 2) a+빈문자열 (공백을 넣지 않게 주의해야함)
		
	}
}
