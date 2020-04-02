package day16;

// SimpleDateFormat
import java.text.*;
import java.util.*;

import javax.swing.JOptionPane;
public class Test02 {

	public Test02() {
		// Calendar Ŭ������ ���� �ð��� ����� ������ ������
		Calendar cal = Calendar.getInstance();
		
		// Calendar �����ʹ� Date Ÿ������ ��ȯ��ų �� getTime()�� ����ؼ� ��ȯ��Ų��
		Date date = cal.getTime();
		
		// ��� ���ڿ� ��ȯ
		String sTime = getStr(date);
		
		// ���
		JOptionPane.showMessageDialog(null, date);
		JOptionPane.showMessageDialog(null, sTime);
	}

	public static void main(String[] args) {
		new Test02();
	}
	
	// Date Ÿ���� �����͸� �Է��ϸ� ���Ŀ� �µ��� ���ڿ��� ���� ��ȯ���ִ� �Լ�
	public String getStr(Date date) {
		// ���� �����
		SimpleDateFormat form = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm�� ss��");
		// ������� 
		String result = form.format(date);
		
		return result;
	}

}