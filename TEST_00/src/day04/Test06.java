package day04;

/*
 	do ~ while ���
 		: for�� while ����� ������ó�� ����̰� ���ǿ� ���� �� ���� ������ �� �� �� ������,
 			do ~ while ����� ������ó�� ����̰� ���ǿ� �������
 			������ �� �� �̻� ������ �Ѵ�
 			
 		����]
 			(1)
 			do{
 				(2)
 			} while(���ǽ� -(3));
 			-(4)
 			����: 1 -> 2-> 3-> 2 -> 3 -> ...(���ǽ��� false�� ������)
 				-> 4
 */
public class Test06 {

	public static void main(String[] args) {
		int no = 10; // while���ǿ� ���� �ʾƵ� do�� �� �� ����
		
		do {
			System.out.println("no : " +no);
		} while(no++ < 10);

	}

}
