package day06;

import java.util.Arrays;

/*
 	���� 1]
	'A' ~ 'J'������ ���ڸ� ���������� ���� �迭�� �ְ� 
	�� ���ڸ� �ϳ��� ������ �ҹ��ڷ� �����Ͽ� ����ϼ���
	�迭�� ��� ������ ���ڿ��� Ȯ���ؼ� ����ϼ���
 */
public class Ex01 {

	public static void main(String[] args) {
		char[] dae = new char[10];
		for(int i=0; i<10; i++) {
			dae[i] = (char)('A'+i);
		}
		System.out.println(Arrays.toString(dae));
		
		char[] so = new char[10];
		for(int i=0; i<10; i++) {
			so[i] = (char)(dae[i] + 32);
		}
		System.out.println(Arrays.toString(so));
	}

}
