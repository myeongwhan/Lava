package day14;

/*
 	���� 2]
	�ﰢ�� Ŭ������ �ۼ��ϰ�
	�ﰢ�� Ŭ������ �غ��� ���̸� �Է��ؼ� ��ü�� ���鵵�� �ۼ��ϰ�
	���� �غ��� ������ ���� �ﰢ���� �ǵ���
	equals �Լ�, toString() �� �������̵��ϰ� �׽�Ʈ�ϼ���
	
	�Է��� JOptionPane �Ҽ��� �Լ��� ó��, ��µ� ���� �Ҽ��� �Լ��� ó���ϼ���
	�߰��� ����ó���� ���ּ���
 */
import javax.swing.JOptionPane;

public class SamgakTest {
	
	public SamgakTest() {
		int str1 = Integer.parseInt(JOptionPane.showInputDialog("ù ��° �ﰢ�� �غ�: "));
		int str2 = Integer.parseInt(JOptionPane.showInputDialog("�� ��° �ﰢ�� �غ�: "));
		
//		try {
//			
//		} catch(Exception e) {
//			
//		}
		
		Samgak s1 = new Samgak(str1);
		Samgak s2 = new Samgak(str2);
		
		System.out.println("ù ��° �غ�: " + s1.getMit());
		System.out.println("�� ��° �غ�: " + s2.getMit());
		
		System.out.println("����? : " + ((s1.equals(s2))? "����" : "�ٸ�"));
	}

	public static void main(String[] args) {
		new SamgakTest();
	}

}
