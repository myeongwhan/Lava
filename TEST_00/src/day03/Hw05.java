package day03;
/**
 * day02 - Ex01 ����Ǯ��
 */
/*
 	���� 5]
 		10 ~ 99 ������ ������ ���ڸ� �߻���Ų ��
 		�� ���ڰ� ����� 10�� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ���
 			��]
 			45�� 50���� ���� 5�� ����
 			53�� 50���� ���� 3�� ����
 */
public class Hw05 {
	
	public Hw05(){
		solv();		
	}
	
	public void solv() {
		// ��������
		int num = (int)(Math.random()*(99 - 10 + 1)) + 10;
		// ����� 10�� ���
		int nmj = num%10;
		int sip = (nmj >= 5) ? (num/10*10 + 10) : (num/10*10);
		// �������� 5���� ũ�ų� ���� ���� sip���� num��, 5���� ������ num���� sip�� ��
		int cha = (nmj >= 5) ? (sip - num) : (num - sip);
		
		System.out.println("�������� : " + num + "\n ����� ���� ��� : " + sip
							+ "\n����� ���� ������� �� : " + cha
				);
	}
	public static void main(String[] args) {
		new Hw05();
	}
	
	public void abc() {
		System.out.println("************");
	}

}
