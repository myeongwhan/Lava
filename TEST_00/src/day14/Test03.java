package day14;

import javax.swing.*;

public class Test03 {
	
	public Test03() {
		// getNum() �� ���ܸ� �����ϴ� �Լ��̹Ƿ�
		// �̷� ���������Լ��� �ݵ�� ����ó���� ����� �Ѵ�
		
		int num = 0;
		
		try {
			num = getNum();
			
		} catch(NumberFormatException e) {
			// ����Ŭ������ ����� ���� ���������� ����ϴ� ���� ��Ģ�̴�
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}
	
	// ���ڸ� �Է¹޾Ƽ� ������ ��ȯ���ִ� getNum() �Լ�
	public int getNum() throws NumberFormatException, Exception {
		int num = 0;
		String sno = JOptionPane.showInputDialog("�����Է�: ");
		num = Integer.parseInt(sno);
		/*
		 	num ������ �����͸� ���� ��� ���ܰ� �߻��� �� �ִ�
		 	���� ��Ģ�� �� �κ��� ����ó���� �ؾ� ������
		 	�̹����� �� �Լ��� ȣ���� ������ ����ó���� ���ѱ��
		 */
		if(num < 0) {
			// ���� ���� �߻���Ű��
			//	����]
			//		throw new ����Ŭ����������();
			throw new NumberFormatException();
		}
		return num;
	}

	public static void main(String[] args) {
		new Test03();
	}

}
