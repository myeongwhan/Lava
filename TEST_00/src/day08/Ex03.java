package day08;

import java.util.Arrays;

/*
 	���� 3]
	2�� ��������
	������ ���� ������ ����� �߰��ؼ� �����Ϸ��� �Ѵ�
	2�� ������ �迭�� ���̸� �������Ѽ� ó���ϼ���
 */
public class Ex03 {

	public static void main(String[] args) {
		int[][] so = new int[5][5];
		
		for(int i=0; i<so.length; i++) {
			for(int j=0; j<so[i].length; j++) {
				so[i][j] = (int)(Math.random()*(100-0+1));
			}
		}
		
		System.out.print(Arrays.deepToString(so));
		System.out.println();
		

		float[][] so2 = new float [5][7];
		for(int i=0; i<so2.length; i++) {
			for(int j=0; j<so[i].length; j++) {
				so2[i][j] = so[i][j];
			}
		}
		
		System.out.print(Arrays.deepToString(so2));
		System.out.println();
		
		lp:
		for(int i=0; i<so2.length; i++) {
			for(int j=5; j<7; j++) {
				so2[i][5] = so[i][0]+so[i][1]+so[i][2]+so[i][3]+so[i][4];
				so2[i][6] = (so[i][0]+so[i][1]+so[i][2]+so[i][3]+so[i][4])/5;
				continue lp;
			}
		}
		
		System.out.print(Arrays.deepToString(so2));

	}

}
