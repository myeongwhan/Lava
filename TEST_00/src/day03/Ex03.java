package day03;

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
public class Ex03 {
	
	public Ex03(){
		Scanner sc = new Scanner(System.in);
		System.out.print("������ڵ� : ");
		int code = sc.nextInt();
		System.out.print("��뷮 : ");
		int time = sc.nextInt();
		
		int one = 3800;
		int two = 2400;
		int three = 2900;
		int four = 3200;
		
		int uone = 245;
		int utwo = 157;
		int uthree = 169;
		int ufour = 174;
		
		if(code == 1) {
			System.out.println("��� : " + ((int)one + time*uone));
		} else if(code == 2) {
			System.out.println("��� : " + ((int)two + time*utwo));
		} else if(code == 3) {
			System.out.println("��� : " + ((int)three + time*uthree));
		} else if(code == 4) {
			System.out.println("��� : " + ((int)four + time*ufour));
		} else {
			System.out.println("�߸��Է�");
		}
		
	}

	public static void main(String[] args) {
		new Ex03();

	}

}
