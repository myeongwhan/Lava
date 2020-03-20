package day10;

/*
 	문제 4]
	학생의 점수를 입력하면 총점을 계산해주는 프로그램을 제작하세요
	
	심화]
		랜덤하게 인수를 만들고
		그 인원수만큼 점수를 랜덤하게 만들어서
		함수를 실행하게 하세요
 */
public class Ex04 {
	
	public Ex04() {
		int no1 = (int)(Math.random()*101);
		int no2 = (int)(Math.random()*101);
		int no3 = (int)(Math.random()*101);
		int no4 = (int)(Math.random()*101);
		
		System.out.println("no1 : " + no1);
		System.out.println("no2 : " + no2);
		System.out.println("no3 : " + no3);
		System.out.println("no4 : " + no4);
		System.out.println(getSum(no1, no2, no3, no4));
	}
	
	public int getSum(int...score) {
		int total = 0;
		for(int i=0; i<score.length; i++) {
			total += score[i];
		}
		return total;
	}

	public static void main(String[] args) {
		new Ex04();

	}

}
