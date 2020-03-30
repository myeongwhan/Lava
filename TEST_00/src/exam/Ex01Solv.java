package exam;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex01Solv {

	public Ex01Solv() {
		/*
	 	�迭�� ������� Ÿ�԰� ���̰� �ʿ��ϴ�
	 	���⼭ ���ڸ� �Է¹������ ������
	 	�迭�� ���̷� ����� ���ڸ� �Է¹������ ���̹Ƿ�
	 	���� �迭�� ���̿� �ش��ϴ� ���ڸ� �Է¹޾Ƽ� ���������� ��ȯ���ش�
		 */
		
		// ���̷� ����� ���� ���� �� �ʱ�ȭ
		int len = 0;
		
		while(true) {
			// �������� ���ڿ� �Է¹ް�
			String snum = JOptionPane.showInputDialog("�迭 ���� �Է�: ");
			
			// ���ڿ��� ������ ��ȯ
			try {
				len = Integer.parseInt(snum);
				// �� ������ �д´ٸ� ���� ���ڷ� ��ȯ������ ������ ������ �� ���̹Ƿ�
				// �� �ݺ����� �������ش�
				break;
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "���ڰ� �ƴ� ���ڸ� �Է��߽��ϴ�");
				continue;
			}
		}
		
		// ���� �迭�� ���̴� ���������� �迭�� �����
		int[] num = new int[len];
		
		loop:
		for(int i=0; i<len; i++) {
			while(true) {
				String sno = JOptionPane.showInputDialog("���� �Է�: ");
				try {
					int no = Integer.parseInt(sno);
					// �� ������ �����ϴ� ���� ���� ������ ��ȯ������ ���������� ������ �� ����̹Ƿ�
					// �迭�� ä���ָ� �ȴ�
					num[i] = no;
					continue loop;
				} catch(Exception e) {
					// �� ���� �迭�� ä�� ���ڸ� �� ���� ����̹Ƿ�
					// ���ڸ� �ٽ� ������ �ڴ�
					continue;
				}
			}
		}
		
		// ���� �迭�� �ϼ��� �Ǿ����� ���� ��������
		int sum = getSum(num);
		
		// ���
		JOptionPane.showMessageDialog(null, "num[] : " + Arrays.toString(num) + "\nsum : " + sum);
	}
	
	/*
	public int getSum(int[] arr) {
		int sum = 0;
		return sum;
	}
	*/
	
	public int getSum(int...arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		new Ex01Solv();
	}

}
