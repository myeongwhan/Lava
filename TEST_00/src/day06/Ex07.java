package day06;

/*
 	���� 7]
	���ڿ��� �Է¹޾Ƽ�
	���ڹ迭�� ���ڿ��� �̷�� ���ڸ� ���������� �����ϼ���
	
	"hong"
	
	-----------------
	|'h'|'o'|'n'|'g'|
	-----------------
	
	����]
		���ڿ��� Ư����ġ�� ���ڸ� �������ִ� �Լ�
			���ڿ�.charAt(��ġ��);
			
		���ڿ��� ���̸� ��ȯ���ִ� �Լ�
			���ڿ�.length();
			==> ��ȯ���� ����
 */
import java.util.*;
public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		char[] ch = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			ch[i]=str.charAt(i);
		}
		System.out.println(Arrays.toString(ch));

	}

}
