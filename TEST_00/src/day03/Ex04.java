package day03;

/*
 	���� 3]
 		�μ���ȣ�� �Է��ϸ� �μ��̸��� ������ִ� ���α׷��� �ۼ��ϼ���
 			10 - �ѹ���
 			20 - ȸ���
 			30 - ������
 			40 - �����
 			��Ÿ - ������ȸ��
 */
import java.util.*;
public class Ex04 {
	
	public Ex04() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�μ���ȣ �Է� : ");
		int dno = sc.nextInt();
		
		String cho = "�ѹ���";
		String hwo = "ȸ���";
		String yeo = "������";
		String gi = "�����";
		
		if(dno == 10) {
			System.out.println("�μ��̸� : " + cho);
		} else if(dno == 20) {
			System.out.println("�μ��̸� : " + hwo);
		} else if(dno == 30) {
			System.out.println("�μ��̸� : " + yeo);
		} else if(dno == 40) {
			System.out.println("�μ��̸� : " + gi);
		} else {
			System.out.println("������ȸ��");
		}
	}

	public static void main(String[] args) {
		new Ex04();

	}

}
