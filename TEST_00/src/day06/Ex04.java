package day06;

import java.util.Arrays;

/*
 	���� 4]
	������ 5���� ����� �迭�� �����
	�����ϰ� 2 ~ 30 ������ 5���� �������� ���� �Է��ϰ�
	������ �������� ���� ���� ���̸� ����ؼ� ������ �迭�� �����
	�� ���� �ѷ��� ����ؼ� ������ �迭�� ����
	����� ����ϴ� ���α׷��� �ۼ��ϼ���
	��, ��� ���´�
		��]
			������ : 10, ���� �ѷ� : 62.8, ���� ���� : 314
	�� ���·� ��µǰ� �ϼ���
 */
public class Ex04 {

	public static void main(String[] args) {
		int[] ban = new int[5];
		for(int i=0; i<5; i++) {
			ban[i] = (int)(Math.random()*(30-2+1)+2);
		}
		
		double[] mm = new double[5];
		for(int i=0; i<5; i++) {
			mm[i] = 3.14*ban[i]*ban[i];
		}
		
		double[] dd = new double[5];
		for(int i=0; i<5; i++) {
			dd[i] = 2*3.14*ban[i];
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("������: " + ban[i] +", "+ "�ѷ�: " + dd[i] +", "+ "����: " + mm[i]);
		}
		

	}

}
