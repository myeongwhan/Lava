package day03;

/*
 	���� 1]
 		�Խ��ǿ� ���� �� �������� 15�� ǥ���� �� �ִ�
 		�Խù��� ������ �����ϰ�(0 ~ 100) �߻��� ��
 		�ʿ��� ������ ���� ����ؼ� ������ִ� ���α׷��� �ۼ��ϼ���
 		��, �Խù� ���� 0�� ���� 1�������� �ʿ��� ������
 */
public class Ex02 {
	
	public Ex02() {
		int no = (int)(Math.random()*(100-0+1));
		
		System.out.println("�Խù� ����: " + no);
		int page = 0;
		if(no == 0) {
			page = 1;
		} else {
			if(no%15 == 0) {
				page = no/15;
			} else {
				page = no/15 + 1;
			}
		}
		
		System.out.println("�ʿ��� ������ �� : " + page);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
