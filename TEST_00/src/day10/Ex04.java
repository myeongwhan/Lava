package day10;

/*
 	���� 4]
	�л��� ������ �Է��ϸ� ������ ������ִ� ���α׷��� �����ϼ���
	
	��ȭ]
		�����ϰ� �μ��� �����
		�� �ο�����ŭ ������ �����ϰ� ����
		�Լ��� �����ϰ� �ϼ���
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
