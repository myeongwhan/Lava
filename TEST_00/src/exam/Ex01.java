package exam;

import java.util.Arrays;

/*
 	���� 1]
	 	JOptionPane ���� ���ڸ� �Է¹޾Ƽ� �迭�� �����
	 	�迭�� ����� �� �ִ� ������ŭ ���ڸ� �Է¹޾Ƽ�
	 	�� ���ڵ��� ���� �����ִ� ���α׷��� �ۼ��ϼ���
	 	��, ���� ���ϴ� ����� �Լ��� ���� ó���ϼ���
 */
import javax.swing.*;
public class Ex01 {

	public Ex01() {
		
		String str = JOptionPane.showInputDialog("�迭 ����: ");
		int no = Integer.parseInt(str);
		
		int[] arr = new int[no];
		for(int i=0; i<arr.length; i++) {
			String str2 = JOptionPane.showInputDialog("���� �Է�: ");
			int no2 = Integer.parseInt(str2);
			arr[i] = no2;
		}
		
		JOptionPane.showMessageDialog(null, getSum(arr));
		
	}
	
	public int getSum(int...a) {
		int no = 0;
		for(int i=0; i<a.length; i++) {
			no += a[i];
		}
		return no;
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
