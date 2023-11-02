package kr.s19.object.Array;

public class Score {
/*
 * [실습]
 * 1. 멤버 변수(private) : 이름(name), 국어(korean), 영어(english), 수학(math)
 * 2. 생성자 : 인자가 없는 생성자, 인자가 있는 생성자
 * 3. 메서드 정의 1) 총점(makeSum), 평균(makeAvg), 등급(makeGrade) // 무조건 입력할 때 0~100 사이로 입력한다고 전제함. (조건체크 안해도됨)
 * 4. set/get 메서드 생성
 */
	
	private String name;
	private int korean;
	private int english;
	private int math;
	
	public Score() {}
	
	public Score(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	//메서드 정의
	
	public int makeSum() {
		return korean + english + math;
	}
	public int makeAvg() {
		return makeSum() / 3;
	}
	
	public String makeGrade() {
		String grade;
		switch(makeAvg()/10) { //왜 오류가 나죵 ㅠ ㅠ ㅠ ㅠ 
		case 10:
		case 9: grade = "A"; break;
		case 8: grade = "B"; break;
		case 7: grade = "C"; break;
		case 6: grade = "D"; break;
		default: grade = "F";
		}
		return grade; //아 이걸 안해서 오류난거였음 ㄷㄷ
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
}
