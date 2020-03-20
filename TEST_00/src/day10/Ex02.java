package day10;

/*
 	문제 2]
	10개의 과목의 점수를 입력할 배열을 만들고(배열 길이는 10)
	그 배열에 담긴 정수의 총점, 평균을 구해서 출력해주는 프로그램을 작성하세요
	단, 입력, 총점계산, 평균계산, 출력은 함수를 제작해서 처리하세요
 */
public class Ex02 {
	Calc ca;
	int[] score;
	
	public void setEx02() {
//		Ex02 = new Calc[10];
//		for(int i=0; i<Ex02.length; i++) {
//			Ex02[i] = new Calc();
//			int qwe[i] = (int)(Math.random()*(100-0+1));
//			
//		}
	}

	public static void main(String[] args) {
		Calc ca1 = new Calc();
		Calc ca2 = new Calc();
		int[] score = new int[10];
		for(int i=0; i<score.length; i++) {
			score[i] = (int)(Math.random()*(100-0+1));
		}
		
		ca1.setVal(score);
		System.out.println(ca1.sum); 
		System.out.println(ca1.avg);
		
		ca2.setVal(score);
		System.out.println(ca2.sum); 
		System.out.println(ca2.avg);
		
		Ex02 ex2 = new Ex02();
		ex2.setEx02();
	}

}
