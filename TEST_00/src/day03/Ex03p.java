package day03;
/**
 * Ex03 Ǯ��
 */
/*
 	���� 2]
 		���� ����� ����ϴ� ���α׷��� �ۼ��ϼ���
 		
 				�ڵ�		�⺻���	�����
 		������	(1)		3800	245
 		�����	(2)		2400	157
 		������	(3)		2900	169
 		�����	(4)		3200	174
 		
 		������ = �⺻��� + ��뷮 * �����
 		
 		������ڵ�� ��뷮�� �Է¹޾Ƽ� �������� ������ִ� ���α׷��� �ۼ��ϼ���
 */
import java.util.*;
public class Ex03p {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڵ��Է� : ");
		int code = sc.nextInt();
		
		// 1 ~ 4 �̿��� ���� �ԷµǸ� ��뷮 �Է��� �ǹ̰� �����Ƿ� ��� �����Ŵ
		if(!(code >= 1 && code <= 4)) {
			System.out.println("�߸� �Է�, ��� ����");
			return;
		}
		System.out.print("��뷮 �Է� : ");
		int used = sc.nextInt();
		
		int calc = 0;
		String yongdo = "������";
		
		int gibon = 3800;
		int yogm = 245;
		
		if(code == 2) {
			yongdo = "�����";
			gibon = 2400;
			yogm = 157;
		} else if(code == 3) {
			yongdo = "������";
			gibon = 2900;
			yogm = 169;
		} else if(code == 4) {
			yongdo = "�����";
			gibon = 3200;
			yogm = 174;
		} 
		
		calc = gibon + used * yogm;
		
		System.out.println("***********************");
		System.out.println("����� �ڵ�: " + code +
							"\n�뵵 : " + yongdo +
							 "\n��뷮 : " + used +
							  "\n������ : " + calc);

	}

}
