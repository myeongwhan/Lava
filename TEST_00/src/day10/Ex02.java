package day10;

/*
 	���� 2]
	10���� ������ ������ �Է��� �迭�� �����(�迭 ���̴� 10)
	�� �迭�� ��� ������ ����, ����� ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���
	��, �Է�, �������, ��հ��, ����� �Լ��� �����ؼ� ó���ϼ���
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
