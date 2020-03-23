package day08;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		// 2���� �迭�� �����. 
		// �迭�� ������ ������ 3, �迭�� ��� ������ ������ 7
		int[][] num = new int[3][7];
		
		for(int[] no1 : num) {	
			// num�� ��� �����ʹ� �����迭�� ���̰�
			// �ϳ��� ������ �Ǹ� �����迭�� ���̴�
			for(int val : no1) {
				System.out.print(val + ", ");
			}
			System.out.println();			
		}
		
		// �����͸� 3, 6, 9�� ä������
		// 1���迭�� �� �濡 �ϳ��� ���ʷ� �����ؾ� �ȴ�
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j] = 3 + 3*i;
			}
		}
		
		// �ϳ��� ������ ���
		for(int[] no1 : num) {
			for(int val : no1) {
				System.out.print(val + ", ");
			}
			System.out.println();			
		}
		/*
		 3, 4, 5, 6, 7, 8, 9, 
		 6, 7, 8, 9, 10, 11, 12, 
		 9, 10, 11, 12, 13, 14, 15, 
		  �� ��������
		*/
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				// num�� i��° �ε����� �����͸� ������ �迭�� ���̱� ������
				// ���濡 ���� �� �����͸� ������ �����͸� �ε�����ŭ �����ش�
				num[i][j] += j;	// <== num[i][j] = num[i][j] + j;
			}
		}
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.printf("%-3d, ", num[i][j]);
			}
			System.out.println();
		}

	}

}