package day10;

/*
 	문제 3]
	학생의 이름, 국어, 영어, 수학, 물리, 코딩 과목의 점수를 저장하고
	총점, 평균을 계산해서 입력할 클래스를 제작하세요
	단, 입력, 총점계산, 평균계산, 출력은 함수를 만들어서 처리하세요
	그리고 5명의 학생을 배열로 만들어서 과목 점수, 이름을 입력해서 출력하세요
 */
public class Ex03 {

	public static void main(String[] args) {
		String[] name = {
				"박광호","박기윤","안홍주","김소영","이진수"
		};
		Stud[] ban = new Stud[5];
		for(int i=0; i<ban.length; i++) {
			ban[i] = new Stud(name[i]);
		}
		
		// 출력
		for(int i=0; i<ban.length; i++) {
			ban[i].toPrint();
		}

	}

}
