package day06;

import java.util.Arrays;

/*
 	���� 6]
	���丮�� 10���� ������ �迭�� �����
	1���� ���������� 10������ ���丮���� ���� �迭�� ��� ������ ����ϼ���
 */
public class Ex06 {

	public static void main(String[] args) {
		int[] p = new int[10];
		p[0] = 1;
		
		int jun = p[0];
		for(int i=1; i<10; i++) {
			p[i] = (jun+1)*p[i-1];
			jun += 1;
		}
		
		System.out.println(Arrays.toString(p));

	}

}
