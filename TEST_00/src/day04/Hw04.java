package day04;

/*
 	�� ����� ����� �ϴµ�, �� ����� ���� ����� 0.54m/s �����ϰ�
 	�ٸ� ����� ���󿡼� 1.07m/s �������� �����ߴ�
 	
 	���� ���̰� 7564m��� �����ϰ�
 	�� ����� ������ �ð��� �� �� �� �� �������� ���̸� ������ִ� ���α׷��� �ۼ��ϼ���
 */
public class Hw04 {

	public static void main(String[] args) {
		double p1 = 0.54;
		double p2 = 1.07;
		
		int mount = 7564;
		double ex1 = 7564/p1;
		double ex2 = 7564/p2;
		
		ti:
		for(int j = mount; p2*j >= 0;j--) {
			for(int i = 1; p1*i <= mount;i++) {
				if(p2*j == p1*i) {
					break ti;
				}
			}
			System.out.println("��: " + j);
		}

	}

}
