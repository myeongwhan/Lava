package day08;

import java.util.Arrays;

/*
 	"PengSoo Good!"
	�̶�� ���ڿ��� �� ���ھ� ������ �迭�� �����ϰ�
	�ϳ��� ������ ����ϼ���
 */
public class Comm1 {

	public static void main(String[] args) {
		String str = "PengSoo Good!";
		char[] ch = str.toCharArray();
		
		System.out.print(Arrays.toString(ch));
		System.out.println();
		
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
	}

}
