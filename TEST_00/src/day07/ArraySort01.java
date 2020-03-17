package day07;


/*
 	����]
 		�ζ� �� ������ ���� �迭�� ���
 		���� ��ȣ���� �����ؼ� ��� �����͸� ����غ���
 		
 		�ζ� �� ������
 			1 ~ 45 ������ ���ڰ� ���� 6�� �ʿ�
 */
import java.util.*;
import javax.swing.*;
public class ArraySort01 {

	public static void main(String[] args) {
		// 1. ���� 6���� ����� �迭�� �����
		int[] lotto = new int[6];
		
		// 2. �迭�� �����ϰ� ������ �����
		loop:
		for(int i=0; i<lotto.length; i++) {
			int no = (int)(Math.random()*(45-1+1)+1);
			// 3. ������ ������� ���� ��ȣ�� �ִ��� üũ
			for(int j=0; j<i; j++) {
				if(lotto[j] == no) {
					i--;
					continue loop;
				}
			}
			// �� �κ��� �����ϴ� ���� ���� �ݺ����� ��� ������ �� ����
			// �� �ǹ̴� ���� ��ȣ�� ������ ���ٴ� �ǹ��̹Ƿ�
			// 4. �� �濡 �� ��ȣ�� ����
			lotto[i] = no;
		}
		
		// 5. ���
		JOptionPane.showMessageDialog(null, 
				"* ��÷��ȣ *\n" + Arrays.toString(lotto));
		
		// 6. ����
		for(int i=0; i<lotto.length-1; i++) {
			// ���⼭ ���� �����ʹ� �� ������ �����ʹ� ���� �ʿ䰡 �����Ƿ�
			// �� ������ �ٷ� ���������� �̾Ƽ� �����ָ� �ȴ�
			// ���� ������ ���ĺ��� �� ���������� �ϳ��� ������ ��
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					// �� ���� �ڿ��� �̾ƿ� �����Ͱ� �� ���� ����̹Ƿ�
					// ���� �ڸ��� �����͸� ��ü�ؾ� �Ѵ�
					// �� �� ���� �ڸ��� �����͸� ��ü�ϴ� ����
					// ���� �������� ����� ������Ƿ� ������ �ּҸ� �����ѳ��´�
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
			
		}
		// 7. ���
		JOptionPane.showMessageDialog(null,
				"<html><b style=\"color: red;\">**��÷��ȣ**</b></html>\n" + Arrays.toString(lotto));
		
		

	}

}
