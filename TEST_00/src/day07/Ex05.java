package day07;

import javax.swing.JOptionPane;

/*
 	extra]
	���� ���ڿ��� �Է¹޾Ƽ�
	�ش� ���ĺ��� �����ϴ� �󵵸� �����ϰ�
	�󵵸� * �� ǥ���ϼ���
 */
public class Ex05 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("���� �Է�: ");
		
		char ch[] = str.toCharArray();
		
		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<str.length(); j++) {
				if(ch[i] == ch[j]) {
					cnt++;
				}
			}
		}
		
		String bindo[] = new String[str.length()];
		

	}

}
