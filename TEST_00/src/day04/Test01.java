package day04;

/*
 	4�ڸ� ���ڷ� �� �⵵�� �Է¹޾Ƽ� �� �ذ� �������� �ƴ��� �Ǻ��ϼ���
 */
import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		// 0. �ʿ��� ���� ����
		Scanner sc;
		int year;
		String hae = "���";
		
		// 1. �Է¹��� �غ�
		sc = new Scanner(System.in);
		// 2. �޽��� ���
		System.out.print("�⵵�Է� : ");
		// 3. �⵵ ������ ������ ���
		year = sc.nextInt();
		// ����ó���ؼ� �Ǵ�
		if(year % 400 == 0) {
			// 400���� ������ �������� ��
			// �� ���� ����Ǹ� ��ü ���ǹ� ��ü�� ������
			hae = "����";
		} /*else if(year % 100 == 0) {
			// 400���� ������ �������� �ʴ� �� �߿� 100���� ������ �������� ��
			hae = "���";
		}*/ else if(year % 4 == 0) {
			// 400�� 100 �Ѵ� ������ �������� �ʴ� �� �߿� 4�� ������ �������� ��
			hae = "����";
		} /*else {
			hae = "���";
		}*/
		
		System.out.println("�Է��� �� [" + year + "] �� [ " + hae + " ] �Դϴ�");
	}

}
