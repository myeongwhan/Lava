package day11;
/*
	���� 3]
		���� 1, 2������ ���� Ŭ������ ��ü�� ����
		�� �������Լ��� �ùٸ��� �۵��ϴ��� �����ϼ���
*/

public class Ex01 {
	
	public Ex01() {
		// �� 10�� ���� ����
		Circle[] cir = new Circle[10];
		for(int i=0; i<cir.length; i++) {
			if(i < 5) {
			cir[i] = new Circle((int)(Math.random()*16 + 5));
			} else {
				cir[i] = new Circle();
			}
		}
		
		// �� ���
		for(int i=0; i<cir.length; i++) {
			cir[i].toPrint();
		}
		
		System.out.println();
		System.out.println("***********************************");
		System.out.println();
		
		// ���� Ŭ���� �����
		Score[] score = new Score[3];
		score[0] = new Score();
		score[1] = new Score("������");
		score[2] = new Score("�ؼ���", 100, 100, 100, 100, 95, 80);
		
		// ���� ���
		for(int i=0; i<score.length; i++) {
			score[i].toPrint();
		}
		
	}
	
	public static void main(String[] args) {
		new Ex01();

	}

}
