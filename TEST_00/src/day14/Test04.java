package day14;

import javax.swing.JOptionPane;

public class Test04 extends Test03 {
	
	// Test03�� getNum()�� ����� �����غ���
	// �Է¹��� ���ڿ� 10�� ���� ������ ��ȯ���ֵ��� �������̵� �غ���
	/*
	 	�������̵� ��Ģ]
	 		0. ����� �޾ƾ� �Ѵ�
	 		1. �Լ��� ������ �����Ѵ�
	 		2. ���������ڴ� ���ų� ���� ������
	 		3. ����ó���� ���ų� ���� ������
	 */
	
	public int getNum() throws NumberFormatException, Exception {
		int num = 0;
		String sno = JOptionPane.showInputDialog("�����Է�: ");
		num = Integer.parseInt(sno);
		
		// ������ ��� ������ ���ܸ� �߻���Ų��
		if(num < 0)	{
			throw new NumberFormatException();
		}

		return num * 10;
	}

	public static void main(String[] args) {
		new Test04();
	}

}
