package day04;

/*	(��ø�� �ݺ������� ó��)
 	2 ~ 100 ������ �� �� �Ҽ��� ������ִ� ���α׷��� �ۼ��ϼ���
 	
 	�Ҽ�: 1�� �ڱ��ڽ����θ� ���� �� �ִ� ��
 	
 	comm ]
 		�� ������ ����� ã�Ƴ� �Ҽ��� ������ �� �������� ����ϼ���
 */
public class Hw03 {

	public static void main(String[] args) {
		
		int count = 0;
		
		t1:
		for(int i=2; i<=100; i++) {
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					count += 1;
					continue t1;
				} 
			}
			String mk = ", ";
			if(i == 2) {
				mk = "";
			}
			System.out.println(mk +i);
		}

		System.out.println();
		System.out.println("���� : " + (99 - count));
	}

}
