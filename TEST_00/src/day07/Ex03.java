package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 	���� 3]
	ȸ���� �̸�, ��ȭ��ȣ, �̸����� ������ �迭�� �����
	�����͸� �Է��س���
	
	�̸��� �Է��ϸ�
	�� ����� �����͸� ��� ������ �迭�� ����
	�����͸� �ְ� ����ϼ���
 */
public class Ex03 {

	public static void main(String[] args) {
		String name[] = {"��", "��", "��"};
		String tel[] = {"02", "010", "070"};
		String mail[] = {"gmail", "naver", "increpas"};
		
		String info[] = new String[3];
		
		String str = JOptionPane.showInputDialog("�̸� �Է�: ");
		// �̸��� �´� ��ġ���� ã���ش�.
		int index = -1 ;
		for(int i = 0 ; i < name.length ; i++ ) {
			if(str.equals(name[i])) {
				index = i;
				info[0] = name[i];
				info[1] = tel[i];
				info[2] = mail[i];
				break;
			}
		}
		String msg = "ã�� ��� : " + str + "\n" + Arrays.toString(info);
		if(index == -1) {
			msg = "���� ����Դϴ�!";
		}
		JOptionPane.showMessageDialog(null, msg);
		
		/*
		for(int i=0; i<3; i++) {
			if(str.equals(name[i])) {
				info[0] = name[i];
				info[1] = tel[i];
				info[2] = mail[i];
				String msg = Arrays.toString(info);
				JOptionPane.showMessageDialog(null, msg);
				break;
			} else {
				
			}
		}
		*/
		
	}

}
