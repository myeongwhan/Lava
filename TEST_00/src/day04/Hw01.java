package day04;

/*
 	�� ���� �Է¹��� ��, �� ���� �ִ������� ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���
 	
 	�ִ�����: �� ���� ���� �� �ִ� ���� ū ��
 */
import java.util.*;
public class Hw01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° �� �Է�: ");
		int no1 = sc.nextInt();
		System.out.print("�� ��° �� �Է�: ");
		int no2 = sc.nextInt();
		
		// �� �� �� ���� �� ã��
		int val = (no2 > no1)? no1 : no2;
		
		for(int i=val; i>=1 ;i--) {
			if(no1%i==0 && no2%i==0) {	// ==> i �� no1�� no2�� ���� �� �ִ� ��
				System.out.println("�ִ����� : " + val);
				break;
			}
			
		}
		
		
	}

}
