package day02;

import java.util.*;
public class Ex01 {
/*
 	���� 1]
 		3�ڸ��� ������ ���� �ϳ��� �Է¹��� �� �Ǵ� �����ϰ� ���� ��
 		���ڸ� ���ϸ� ���� ���ڸ� ���� ����ϼ���
 			��]
 			456 --> 400
 		
 	���� 2]
 		0 ~ 255 ������ ���ڸ� �����ϰ� �����
 		�� ���ڸ� �ڵ尪���� �ϴ� ���ڸ� ����
 		�ش� ���ڰ� ���������� �ƴ��� �Ǻ��ؼ� ����ϼ���
 		��, ���� �����ڸ� ����ؼ� ó���ϼ���
 		
 	���� 3]
 		ȭ��(Fahrenheit) 100���� ����(Celcius) �� ������ �˾ƺ���
 		���α׷��� �ۼ��ϼ���
 			����]
 				�����µ� = 5 / 9 * (ȭ���µ� - 32)
 	
 	���� 4]
 		�Ҽ����� �ִ� ���ڸ� �Է��� ��
 		�Ҽ��� ���� ��° �ڸ����� �ݿø��� ����� ����ϼ���
 		
 			����]
 				+0.005�� �ϸ� ��° �ڸ����� ��ȭ�� �Ͼ ���̰�
 				���⿡ x100 ���ָ� ��° �ڸ����� �����ο� �� ���̰�
 				�̰��� ������ �ٲٸ� �������� ��° �ڸ� ���ϴ� ���� ���̰�
 				�ٽ� /100 ���ָ� �� �Ҽ��� ���·� ��ȯ�� ���̴�
 				
 	���� 5]
 		10 ~ 99 ������ ������ ���ڸ� �߻���Ų ��
 		�� ���ڰ� ����� 10�� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ���
 			��]
 			45�� 50���� ���� 5�� ����
 			53�� 50���� ���� 3�� ����
 			
 	���� 6]
		������ �⵵�� �Է¹޾Ƽ�
		�ش� �⵵�� �������� ������� �Ǻ��ؼ� ������ִ� ���α׷��� �ۼ��ϼ���
		��, ���׿����ڸ� ����ؼ� ó���ϼ���
			������ ����]
				4�� ������ �������� 100���� ������ �������� ������,
				400���� ������ �������� �ظ� �����̶� �Ѵ�
 	
 */
	// �⺻ ������ �Լ� ����
	public Ex01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("3�ڸ� �Է� : ");
		int num = sc.nextInt();
		
		int result = num - (num % 100);
		
		System.out.println("��� : " + result);
		
	}
	
	public void sov1() {
		int num = (int)(Math.random()*(999-100+1)) + 100;
		
		int result = num - (num % 100);
	}
	
	public static void sov2() {
		int num = (int)(Math.random()*(255-0+1)) + 0;
		
		System.out.print("�������� : " + num + " ");
		String str = (num >= 'A' & num <= 'Z')? "���빮��" + (char)num: 
				((num>='a' & num <= 'z') ? "���ҹ���" + num: "�ٸ�����" + num) ;
		
		System.out.println("��� : " + str);
	}
	
	public static void sov3() {
		int ff = 100;
		float cc = 5f/9f*(ff - 32);
		
		System.out.println("ȭ�� 100�� : ���� " + cc + "��");
	}
	
	public static void sov4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ҽ� �ִ� ���� �Է� : ");
		float num = sc.nextFloat();
		
		float num2 = (float)(num+0.005)*100;
		
		int num3 = (int)num2;
		
		System.out.println("�ݿø� ��� : " + (float)(num3*0.01));
	}
	
	public static void sov5() {
		int no = (int)(Math.random()*(99 - 10 + 1)) + 99;
		int namuge = no % 10;
		int nof = no/10*10;
		int nof2 = (no/10 +1)*10;
		int result = (namuge < 5)? (nof):(nof2);
		
		System.out.println(no + "�� " + result + "�� " + (no-result));
	}
	
	public void sov6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵�Է�: ");
		int num = sc.nextInt();
		
		
	}
	
	public static void main(String[] args) {
		new Ex01();
		sov2();
		sov3();
		sov4();
		sov5();

	}

}
