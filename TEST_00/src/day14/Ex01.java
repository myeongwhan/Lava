package day14;

/*
 	�߰� �н�]
 		���� ����� �Լ��� �����ؼ� ó���ϼ���
 */
import javax.swing.JOptionPane;
public class Ex01 {
	
	public Ex01() {
		String str = JOptionPane.showInputDialog("�����Է�: ");
		
		int age = 0;
		String msg = "";
		
		try {
			age = Integer.parseInt(str);
			if(age<10) {
				JOptionPane.showMessageDialog(null, "����");
			} else if(age<20) {
				JOptionPane.showMessageDialog(null, "10��");
			} else if(age<30) {
				JOptionPane.showMessageDialog(null, "20��");
			} else if(age<40) {
				JOptionPane.showMessageDialog(null, "30��");
			} else if(age<50) {
				JOptionPane.showMessageDialog(null, "40��");
			} else {
				JOptionPane.showMessageDialog(null, "50�� �̻�");
			}
		} catch(Exception e) {
			msg = "���� ������ �ƴմϴ�";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
