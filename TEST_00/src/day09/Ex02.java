package day09;

import java.util.Arrays;

/*
 	���� 2]
	1�� �迭�� 10���� �����͸� �Է��� ��
	������ ����� ���ϴ� ���α׷��� �ۼ��ϼ���
	��, �Է�, �������, ��հ��, ����� �Լ��� ó���ϼ���
 */
public class Ex02 {
	int[] bae = new int[10];
	
	public Ex02() {
		input();
		sum(bae);
		avg(sum(bae), 10);
		output();
		
	}
	
	public void input() {
		for(int i=0; i<10; i++) {
			bae[i] = (int)(Math.random()*(100));
			
		}
		System.out.println(Arrays.toString(bae));
	}
//	(int)(Math.random()*(100-0+1)+1)
	public int sum(int[] a) {
		int result = 0;
		for(int i=0; i<10; i++) {
			result += a[i];
		}
		return result;
	}
	
	public float avg(float a, float b) {
		float result = 0;
		result = a/b;
		return result;
	}
	
	public void output() {
		System.out.println(sum(bae));
		System.out.println(avg(sum(bae), bae.length));
	}

	public static void main(String[] args) {
		new Ex02();

	}

}
