package day08;

import java.util.*;

/*
 	���� 2]
	����, ����, ����, ����, ���� ������ �����Ϸ��� �Ѵ�(������ ����)
	�л��� ���� 5���̰� 2���� �迭�� ����
	5���� ������ ������ �迭�� ���弼��
 */
public class Ex02 {

	public static void main(String[] args) {
		int[][] so = new int[5][5];
		
		for(int i=0; i<so.length; i++) {
			for(int j=0; j<so[i].length; j++) {
				so[i][j] = (int)(Math.random()*(100-0+1));
			}
		}
		System.out.print(Arrays.deepToString(so));

	}

}
