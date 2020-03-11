package day01;

public class Ex01 {
/*
 	1.	1, 2, 5, 10, 20 �� ������ ���� �ϳ��� �����ϰ�(���, ���� ���)
 		�̰��� 2������ �ٲ㺸�� ���� ���α׷��� ����� ��ġ�ϴ��� Ȯ���ϼ���
 		
 		��Ʈ�ڵ� Ȯ�� ���
 			Integer.toBinaryString(����)
 			
-------------------------------------------------------

	2.	�������� 7�� ���� ����, �ѷ��� ����ؼ� ����ϼ���
		���� �ѷ� : 2 * ������ * 3.14
		���� ���� : ������ * ������ * 3.14
		
		��, ������, �ѷ�, ���̴� ������ ���� ó���ϼ���
		�ѷ��� float Ÿ���� ������ ���弼��
		
	3.	�� ���� ����(����)�� ������ ��� �� ���� ����, ���η� �ϴ� �簢���� ���̸� ���ϼ���
	
	4.	3�� ������ �� ���� �غ��� ���̷� ������ �ﰢ���� ���̸� ���ϼ���
	
	5. 54232���� �����ؾ� �ϴµ�, �츮������ ȭ��� �� ������ �� ���� �ʿ����� ����ؼ� ����ϼ���
		5������ - 1��, 1������ - 0��, 5õ���� - 0��, ...
		
	����]
		1���� 365.2426���̴�.
		�� ��¥�� ���� ��ĥ, �� �ð�, �� ��, �� ������ ����ؼ� ����ϼ���
 */
	public static void main(String[] args) {
		System.out.println("8214 : " + Integer.toBinaryString(8214));
		System.out.println("-8 : " + Integer.toBinaryString(-8));
		System.out.println("-8214 : " + Integer.toBinaryString(-8214));
		
		int r = 7;
		double PI = 3.14;
		System.out.println("���� �ѷ� : " + 2*r*PI);
		System.out.println("���� ���� : " + (float)r*r*PI);
		
		int no1 = 4;
		int no2 = 5;
		
		System.out.println("�簢�� ���� : " + no1*no2);
		System.out.println("�ﰢ�� ���� : " + no1*no2/2);
		

		System.out.println();
		getMoneyCnt();
		
		System.out.println();
		illNyon();
		
	}
	
	public static void getMoneyCnt() {
		int money = 54232;
		int oman = 0;
		int man = 0;
		int ochun = 0;
		int chun = 0;
		int obak = 0;
		int bak = 0;
		int osib = 0;
		int sib = 0;
		int o = 0;
		int i = 0;
		
		int tmp = money;
		oman = tmp / 50000;
		tmp %= 50000;
		man = tmp / 10000;
		tmp %= 10000;
		ochun = tmp / 5000;
		tmp %= 5000;
		chun = tmp / 1000;
		tmp %= 1000;
		obak = tmp / 500;
		tmp %= 500;
		bak = tmp / 100;
		tmp %= 100;
		osib = tmp / 50;
		tmp %= 50;
		sib = tmp / 10;
		tmp %= 10;
		o = tmp / 5;
		tmp %= 5;
		i = tmp / 1;
		tmp %= 1;

		System.out.println("���� "+ oman + " �� " + man + " ��õ " + ochun + " õ " + chun + " ���� " + obak + " �� " + bak + 
				" ���� " + osib + " �� " + sib + " �� " + o + " �� " + i);
	}
	
	public static void illNyon() {
		double year = 365.2426;
		
		double hour = year*24;
		double min = hour*60;
		double sec = min*60;
		int day = (int)year;
		
		System.out.println("��:" + day + " �ð�:" + (int)hour + " ��:" +(int)min + " ��:" +(int)sec);
	}
}
