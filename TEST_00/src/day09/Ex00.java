package day09;

import java.util.Arrays;

/*
 	String str = "GitHub is built for collaboration. 
 		Set up an organization to improve the way your team works together, 
 		and get access to more features.";
 	
 	1. str ������ �� �������� �и��ؼ� �迭�� ��������
 		String[] str1 = new String['.' ������ŭ �迭����];
 	2. �ܾ� ����ŭ�� ũ�⸦ ������ �迭�� ����� �迭�� �ܾ �Է��ϼ���(toCharArray x)
 */
public class Ex00 {

	public static void main(String[] args) {
		String str = "GitHub is built for collaboration. Set up an organization to improve the way your team works together, and get access to more features.";
		
		// 1.
		int jum = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '.') {
				++jum;
				continue;
			}
		}
		
		String[] str1 = new String[jum];
		
		String tmp = str;
		for(int i=0; i<jum; i++) {
			str1[i] = tmp.substring(0, tmp.indexOf("."));
			tmp = str.substring(str.indexOf(".")+1);
			str = tmp;
		}
		
		System.out.println(Arrays.toString(str1));
		
		
		// 2.
		
		str = "GitHub is built for collaboration. Set up an organization to improve the way your team works together, and get access to more features.";

		int space = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				++space;
				continue;
			}
		}
		
//		System.out.println(space);
		
		String[] str2 = new String[space+1];
		tmp = str;
		
		for(int i=0; i<space+1; i++) {
			if(tmp.indexOf(' ') == -1) {
				str2[i] = tmp.substring(0);
				break;
			}
			str2[i] = tmp.substring(0, tmp.indexOf(' '));
			tmp = str.substring(str.indexOf(' ')+1);
			str = tmp;
		}
		System.out.println(Arrays.toString(str2));

	}

}
