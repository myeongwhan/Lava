package day01;

public class Ex01solve {
	public static void main(String[] args) {
		double data = 365.2426;
		// 1. ��¥ ���
		int day = (int)data; // data - (data % 1)
		// 2. �������� ��¥ �̿��� �����͸� �ʷ� ȯ��
		int sec = (int)((data % 1) * 24 * 60 * 60);
		// 0.2426�� ==> 0.2426 * 24(�ð�)
//						0.2426 * 24 * 60(��)
//						0.2426 * 24 * 60 * 60(��)
		int hour = sec / 3600;
		sec %= 3600;
		int min = sec / 60;
		
		System.out.println("�ϳ��� " + day + " ��, " + hour + " �ð�" + 
							min + " �� " + sec + " �� �Դϴ�"
							);
	}
}
