package day12;

/*
 	문제 2]
	학생의 이름, java, db, html, js, css, 총점, 평균
	을 저장할 클래스를 만들고
	5학생의 데이터를 입력해서 출력하세요.
	단, 변수는 은닉화시키세요.
 */

public class Ex02 {
	public Ex02() {
		String[] name = {"김", "이", "박", "최", "하"};
		Student[] ban = new Student[5];
		ban = setArr(ban, name);
		
		for(int i=0; i<ban.length; i++) {
			ban[i].toPrint();
		}
	}
	
	public Student[] setArr(Student[] s, String...name) {
		for(int i=0; i<name.length; i++) {
			s[i] = new Student();
		}
		return s;
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

}
