package day03;
/**
 * day02 - Ex01 ����Ǯ��
 */
/*
 	���� 4]
 		�Ҽ����� �ִ� ���ڸ� �Է��� ��
 		�Ҽ��� ���� ��° �ڸ����� �ݿø��� ����� ����ϼ���
 		
 			����]
 				+0.005�� �ϸ� ��° �ڸ����� ��ȭ�� �Ͼ ���̰�
 				���⿡ x100 ���ָ� ��° �ڸ����� �����ο� �� ���̰�
 				�̰��� ������ �ٲٸ� �������� ��° �ڸ� ���ϴ� ���� ���̰�
 				�ٽ� /100 ���ָ� �� �Ҽ��� ���·� ��ȯ�� ���̴�
 */
import java.util.*;
public class Hw04 {

	public Hw04() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ǽ��� �Է��ϼ��� : ");
		double num = sc.nextDouble();
		// �Լ� ���������� �Ѱ��ָ鼭 �����ϰ� ������ �ޱ�
		double result = banolim(num);
		System.out.println("�Է¹��� �Ǽ� : " + num + "\n�ݿø��� �Ǽ� : " + result);
	}
	
	// �Ǽ��� �Ҽ� ��° �ڸ����� �ݿø����ִ� �Լ�
	public double banolim(double no){
		// ��ȯ�� ���� ���� �����
		double result = 0.;
		// �Է¹��� ������ �ݿø�(�Ҽ� ��° �ڸ�)
		int no1 = (int)(no * 1000);		//==>	123456
		no1 += 5;						//==>	123461
		result = (no1 / 10) / 100.;		//==>	123.46
		// ������ ��ȯ
		return result;
	}
	public static void main(String[] args) {
		new Hw04();
	}

}
