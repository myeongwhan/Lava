package day09;

public class Test01 {
	int no;
	int[] arr;
	
	public Test01() {
		setNo(1004);
		System.out.println(no);
	}
	public static void main(String[] args) {
		new Test01();

	}
	
	public void setNo(int a) {
		/* 
		 	�� �Լ��� ����� ��������� �ʱ�ȭ��
			�� �Լ��� ���� ����� ���� no�� �����͸� ä���ִ� ���̰�
		 	�� ����� �����ϸ� �� �Լ��� ������ �޼��� �� ���̴�
			���� �������� �� �����Ͱ� �����ϴ� ���� �ƴϴ�
			�Լ� ���ο��� �� �Լ��� ����� ��� �޼��Ǿ���
		*/
		no = a;
//		return;
	}

}
