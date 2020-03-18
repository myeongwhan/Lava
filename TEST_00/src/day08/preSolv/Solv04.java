package day08.preSolv;

import java.util.Arrays;

/*
 	
 	���� 4]
	��ȭ��ȣ�� �Է��ϸ� 
	'-'�� �������� �����͸� �и��ؼ� ������ �迭�� �����
	�и��� �����͸� ������ �°� �Է��ϰ� ����ϼ���
	indexOf(), substring()
 
 */
import javax.swing.*;
public class Solv04 {

	public static void main(String[] args) {
		// ��ȭ��ȣ�� xxx-xxxx-xxxx �� �������� �Է¹��� ���̰�
		// �� ��ȣ�� ���ڿ��� �����ϰ� 
		// ���ڿ��߿� '-' �� ������ŭ �ݺ��ؼ� ��ȣ�� ������ �迭�� ����
		
		// �Է¹޾Ƽ� ������ ����
		String phone = JOptionPane.showInputDialog("��ȣ�Է�: ");
		
		// '-'�� ���� ī��Ʈ
		int cnt = 0;
		for(int i=0; i<phone.length(); i++) {
			char ch = phone.charAt(i);
			if(ch < '0' || ch > '9') ++cnt;
		}
		
		// �и��� ���ڿ��� �Է��� �迭 �����
		//	==> ��ȭ��ȣ�� �и��ϰ� �Ǹ� '-'�� �������� 1�� �� ���� ���ڿ��� �и���
		String[] arr = new String[cnt + 1];
		
		// �迭�� ���ڿ��� �и��ؼ� �Է�
		// �߷��� ���ڿ��� ������ ����(�۾��� ����)�� ����
		// ó������ ��ü ���ڿ��� ��� ������ �Ǿ�� �� ���̴�
		String tmp = phone;
		int idx = 0;
		for(int i=0; i<cnt; i++) {
			// '-'�� �ε��� �˾Ƴ���
//			idx = tmp.indexOf('-');
			// ��Ȥ '-'�� ���� �ʰ� �ٸ� Ư������')'���� �Է��ϴ� ��찡 �ִ�
			for(int j=0; j<tmp.length(); j++) {
				if(tmp.charAt(j)<'0' || tmp.charAt(j)>'9') {
					idx=j;
					break;
				}
			}
			// '-' ���������� ���ڿ� ����
			arr[i] = tmp.substring(0, idx);
			// �����ϰ� ���� �� ��ȣ�� �ٽ� tmp�� ����, �ݺ�
			tmp = tmp.substring(idx+1);
		}
		arr[cnt] = tmp;
		
		JOptionPane.showMessageDialog(null, "��ȣ: " + phone + 
											"\n�и��س��� �迭: " + Arrays.deepToString(arr));

	}

}
