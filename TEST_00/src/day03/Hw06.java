package day03;
/**
 * day02 - Ex01 ����Ǯ��
 */
/*
 	���� 6]
		������ �⵵�� �Է¹޾Ƽ�
		�ش� �⵵�� �������� ������� �Ǻ��ؼ� ������ִ� ���α׷��� �ۼ��ϼ���
		��, ���׿����ڸ� ����ؼ� ó���ϼ���
			������ ����]
				4�� ������ �������� 100���� ������ �������� ������,
				400���� ������ �������� �ظ� �����̶� �Ѵ�
 */
import java.util.*;
public class Hw06 {
	public Hw06() {
		solv();
	}
	
	// ���� �Ǻ��ϴ� �Լ�
	public void solv() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ �Է� : ");
		int year = sc.nextInt();
		String result = (year % 4 != 0) ? ("���") : 
							(year % 100 != 0) ? ("����") :(
							(year % 400 == 0) ? "����":"���"
							);
		
		System.out.println("�Է��� �� [" + year + "] �� [" + result +"] �Դϴ�");
	}
	public static void main(String[] args) {
		new Hw06();
	}

}
