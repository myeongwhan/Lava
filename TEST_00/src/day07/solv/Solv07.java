package day07.solv;

/*
	���� 7]
���ڿ��� �Է¹޾Ƽ�
���ڹ迭�� ���ڿ��� �̷�� ���ڸ� ���������� �����ϼ���

"hong"

-----------------
|'h'|'o'|'n'|'g'|
-----------------

����]
	���ڿ��� Ư����ġ�� ���ڸ� �������ִ� �Լ�
		���ڿ�.charAt(��ġ��);
		
	���ڿ��� ���̸� ��ȯ���ִ� �Լ�
		���ڿ�.length();
		==> ��ȯ���� ����
*/
import java.util.Arrays;

import javax.swing.*;
public class Solv07 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("���ڿ� �ƹ��ų�");
		
		char[] ch = new char[str.length()]; // ���ڿ��� ���̸�ŭ ���ڹ迭 �����
		
		// ���ڿ� ������ ���ڹ迭
		char[] ch1 = new char[str.length()];
		
		// ���ڿ� ���̸�ŭ �ݺ��ؼ� ���ڸ� ������
		// ���� ���ڸ� ���� ���� �迭�� ������� �־��ش�
		for(int i=0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
			ch1[i] = str.charAt(str.length() -1 - i);
		}
		
		/*
		System.out.println("���ڿ� : " + str);
		System.out.println("ch : " + Arrays.toString(ch));
		System.out.println("ch1 : " + Arrays.toString(ch1));
		*/
		String msg = "���ڿ� : " + str + "\nch : " + Arrays.toString(ch)
		+ "\nch1 : " + Arrays.toString(ch1);
		JOptionPane.showMessageDialog(null, msg);

	}

}
