package day06;

/*
 	���� 8]
	ȸ���� �̸�, ��ȭ��ȣ, �̸����� ������ �迭�� ����� �����͸� �Է��ؼ�
	ȸ���� �̸��� �Է��ϸ�
	ȸ���� �̸��� ��ȭ��ȣ, �̸����� ������ִ� ���α׷��� �ۼ��ϼ���
 */
import java.util.*;
public class Ex08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[5];
		String[] tel = new String[5];
		String[] email = new String[5];
		
		for(int i=0; i<5; i++) {
			
			System.out.print("�̸� : ");
			String pname = sc.nextLine();
			name[i] = pname;
			System.out.print("��ȭ��ȣ : ");
			String ptel = sc.nextLine();
			tel[i] = ptel;
			System.out.print("�̸��� : ");
			String pemail = sc.nextLine();	
			email[i] = pemail;
		
		}
		
		System.out.println();
		
		System.out.print("�˻��� �̸� : ");
		String search = sc.nextLine();
		for(int i=0; i<5; i++) {
			if(search.equals(name[i])) {
				System.out.println(name[i] + ", "+tel[i] +", "+ email[i]);
				break;
			}
		}
		sc.close();

	}

}
