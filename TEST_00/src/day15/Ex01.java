package day15;

/*
 	���� 1]
 		�̸����� �Է¹޾Ƽ� 
 		�Է¹��� ���ڿ��� �̸��� ���Ŀ� �´��� �˻��ϼ���
 		�̸��� ������
 			���ĺ��� ���ڷ� 8���� �̻� + @ + �������ּ�
 		�� ó���ϼ���
 		
 		\w{8,]@\w{2.10}\.[a-z]{2,3}\.?[a-z]{0.2}
 		
 		����]
 			�ѱ� ó�� : [��-�R]	-	�ѱ��� ���̵� ���� ������
 */
import javax.swing.*;
import java.util.regex.*;
public class Ex01 {

	public static void main(String[] args) {
		String val = JOptionPane.showInputDialog("�̸��� �Է�: ");
		
		Pattern pattern = Pattern.compile("\\w{8,]@\\w{2.10}\\.[a-z]{2,3}\\.?[a-z]{0.2}");
		
		Matcher match = pattern.matcher(val);
		
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "�ùٸ� �̸����Դϴ�");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
	}

}
