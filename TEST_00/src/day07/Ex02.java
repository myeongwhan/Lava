package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 	���� 2]
	���� 10���� ������ �迭�� �����
	�����ϰ� 1 ~ 50���� �� �߿� �߻����Ѽ� �迭�� ���
	�迭�� 5��°���� �����͸� ���� ����� �����ϼ���
 */
public class Ex02 {

	public static void main(String[] args) {
		int[] no = new int[10];
		for(int i=0; i<10; i++) {
			no[i] = (int)(Math.random()*(50-1+1)+1);
		}
		
		int[] no2 = new int[10];
		System.arraycopy(no, 0, no2, 0, 5);
		
		String msg = ("no: "+ Arrays.toString(no) +
				"\nno2: " + Arrays.toString(no2));
		
		JOptionPane.showMessageDialog(null, msg);
		

	}

}
