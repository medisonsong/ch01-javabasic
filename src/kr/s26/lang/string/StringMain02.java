package kr.s26.lang.string;

public class StringMain02 {
	public static void main(String[] args) {
		String s1 = "Kwon Sun Ae";
			       //012345678910(인덱스), 길이:11 (공백포함)
		
		//지정한 문자의 인덱스 반환
		int index = s1.indexOf('n'); //맨 앞에 있는 ()속 문자의 위치(인덱스)
		System.out.println("맨 처음 문자 n의 위치 : " + index);
		
		index = s1.indexOf("Sun"); //567인데 return은 하나의 값, 하나의 객체밖에 못하기 때문에 5라고 반환함
		System.out.println("문자열 Sun의 위치 : " + index);
		
		index = s1.indexOf('s');
		System.out.println("소문자 s의 위치 : " + index);
		//s가 없어서 -1 반환함 (0값은 이미 K라서 없다고 0 반환하진 않음)
		
		index = s1.lastIndexOf('n'); //뒤에 있는 ()속 문자의 위치
		System.out.println("마지막 문자 n의 위치 : " + index);
		
		//지정한 인덱스를 통해서 문자를 반환/ 문자 추출
		char c = s1.charAt(index); // 위 index에 저장되어 있는 s1[7]을 문자로 반환하는거임
		System.out.println("추출한 문자 : " + c);
		
		//지정한 인덱스부터 끝 인덱스까지 문자열 추출
		index = s1.indexOf('S');
		String str = s1.substring(index);
		System.out.println("대문자 S부터 끝까지 잘라내기 : " + str);
		
		//시작 인덱스부터 끝 인덱스 전까지 문자열 추출
		str = s1.substring(index, index+3); // 5(s) index+3은 8이라 Sun (공백포함) 이 8까진데 끝 인덱스 -1까지 추출이니까 Sun까지 추출 / 5 6 7 추출
		System.out.println("시작 인덱스부터 끝 인덱스 전까지 문자열 추출 : " + str);
		
		//s1의 전체 길이
		int length = s1.length();
		System.out.println("s1의 길이 : " + length);
		
		String[] array = s1.split(" "); // " "을 구분자로 배열에 넣고 반복문을 통해서 배열 출력함
		for (int i=0; i<array.length;i++) {
			System.out.println("array[" + i + "]:" + array[i]);
		}
	}
}
