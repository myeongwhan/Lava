package day12;

import java.util.Arrays;

/*
 	���� 1]
 		�л��� java, db, html, javascript, spring, sum, avg
 		������ ������ �迭�� �����
 		������ ����� ���ؼ� ����ϼ���
 		
 		��, ���� ������ ��յ� ���� �迭���� �����ϼ��� (5��)
 		
 		java	db	html	javascript	spring	sum	avg
 		--------------------------------------------
 		100		95	100			100		90		����	���
 		...
 	
 ��������	450		480  
 �������	90.00	96.00
 
 		�� ���·� ���� �迭�� �����͸� ä��� ����ϼ���
 		�迭��
 			double[][] score = new double[7][7];
 */
public class Ex01 {

	public Ex01(){
//		setScore();
		
		double[][] score = new double[7][7];
		
		for(int i=0; i<score.length-2; i++) {
			for(int j=0; j<score[i].length-2; j++) {
				score[i][j] = (int)(Math.random()*(100-60+1)+60);
			}
		}
		
		// sum
		for(int i=0; i<score.length-2; i++) {
			for(int j=0; j<score[i].length-2; j++) {
				score[i][5] += score[i][j];
			}
		}
		
		// avg
		for(int i=0; i<score.length; i++) {
			score[i][6] = score[i][5]/5;
		}
		
		// ��������
		for(int j=0; j<score.length-2; j++) {
			for(int i=0; i<score[j].length-2; i++) {
				score[5][i] += score[j][i];
			}
		}
		
		// �������
		for(int j=0; j<score.length; j++) {
			score[6][j] = score[5][j]/5;
		}
		
		// ���
		System.out.println("java, db, html, javascript, spring, sum, avg");
		System.out.println("----------------------------------------------");
		for(int i=0; i<score.length; i++) {
			System.out.println(Arrays.toString(score[i]));
		}
	}
	
	public static void main(String[] args) {
		new Ex01();

	}
	
//	public void setScore() {
//		int java = (int)(Math.random()*(100-60+1)+60);
//		int db = (int)(Math.random()*(100-60+1)+60);
//		int html = (int)(Math.random()*(100-60+1)+60);
//		int javascript = (int)(Math.random()*(100-60+1)+60);
//		int spring = (int)(Math.random()*(100-60+1)+60);
//	}

}
