package day08;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 	comm 2]
	�ݾ��� �Է��ϸ� �ݾ׸�ŭ�� �ζǰ����� ������ִ� ���α׷��� �ۼ��ϼ���
	�ζ� �� ������ 1000��, �� �忡�� 5������ ����
	�Է� �ݾ��� 1000�� ������ �ϱ�� �Ѵ�
	��, �ζ� ��ȣ�� �������� �����ؼ� �����ϼ���
	
	��]
		�Է±ݾ� : 8000��
		�ζ�:
			1,2,3,4,5,6			- 1����
			7,8,9,10,11,12		- 2����
			...
			11,12,13,14,15,16	- 5����
			--------------------------
			1,2,3,4,5,6			- 6����
			7,8,9,10,11,12		- 7����
			11,12,13,14,15,16	- 8����
 */
public class Comm2 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		loop:
		for(int i=0; i<lotto.length; i++) {
			int no = (int)(Math.random()*(45-1+1)+1);
			
			for(int j=0; j<i; j++) {
				if(lotto[j] == no) {
					i--;
					continue loop;
				}
			}
			
			lotto[i] = no;
		}		
		
		for(int i=0; i<lotto.length-1; i++) {
			
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
			
		}
		
		int don = 8000;//JOptionPane.showInputDialog("�ݾ��Է�: ");
		int game = don/1000;
		
		for(int i=0; i<game; i++) {
			
		}
		JOptionPane.showMessageDialog(null,
				"**��÷�ݾ�**\n" + Arrays.toString(lotto) + "\t " + game+"����");

	}

}
