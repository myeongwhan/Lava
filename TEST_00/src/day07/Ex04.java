package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 	���� 4]
	��ȭ��ȣ�� �Է��ϸ� 
	'-'�� �������� �����͸� �и��ؼ� ������ �迭�� �����
	�и��� �����͸� ������ �°� �Է��ϰ� ����ϼ���
	indexOf(), substring()
 */
public class Ex04 {
	
	public Ex04(){
		String sTel = "010-1234-2345";
		String[] sNum = new String[3];
		
		int idx = sTel.indexOf('-');
		sNum[0] = sTel.substring(0, idx);
		String tmp = sTel.substring(idx + 1);
		idx = tmp.indexOf('-');
		sNum[1] = tmp.substring(0, idx);
		sNum[2] = tmp.substring(idx + 1);
	}

	public static void main(String[] args) {
		String tel = JOptionPane.showInputDialog(null, "��ȭ��ȣ �Է�: ");
		
		String result[] = new String[3];
		
		result[0] = tel.substring(0, 3);
		result[1] = tel.substring(4, 8);
		result[2] = tel.substring(9, 13);
		
		for(int i=0; i<3; i++) {
			
		}
		
		String msg = Arrays.deepToString(result);
		JOptionPane.showMessageDialog(null, msg);

	}

}
