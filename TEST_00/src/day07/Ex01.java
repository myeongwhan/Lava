package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 	���� 1]
	���ĺ� 10���� ������ �迭�� �����
	�빮�� 10���� �����ϰ� �����ؼ� �迭�� �����ϰ�
	����� �迭�� ���� ����� �����ؼ� ����ϰ�
	���� �迭�� �ҹ��ڷ� ������ ��, �� �迭�� ����ϼ���
 */
public class Ex01 {

	public static void main(String[] args) {
		char[] ch1 = new char[10];
		for(int i=0; i<10; i++) {
			ch1[i] = (char)(Math.random()*('Z'-'A'+1)+'A');
		}
		
		char[] ch2 = ch1;
		
		String msg1 = (Arrays.toString(ch2));
		JOptionPane.showMessageDialog(null, msg1);
		
		for(int i=0; i<10; i++) {
			ch1[i] += 32;
		}
		
		String msg2 = ("ch1: " + Arrays.toString(ch1)
					+ "\nch2: " + Arrays.toString(ch2));
		
		JOptionPane.showMessageDialog(null, msg2);

	}

}
