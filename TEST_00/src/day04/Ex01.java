package day04;

/*
 	4�ڸ� ���ڷ� �� �⵵�� �Է¹޾Ƽ� �������� ������� �Ǵ��ؼ� ����ϼ���
 	��, switch ~ case ��������
 */
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�Է� : ");
		int year = sc.nextInt();
		String hae;
		int code = 0;
		
		if(year % 400 == 0) {
			code = 3;
		} else if(year % 100 ==0) {
			code = 2;
		} else if(year % 4 == 0) {
			code = 1;
		}
		
		// switch ~ case ����ó��
		switch(code) {
		case 3:
			hae = "����";
			break;
		case 2:
			hae = "���";
			break;
		case 1:
			hae = "����";
			break;
		default:
			hae = "���";
		}
		
		System.out.println(hae);

	}

}
