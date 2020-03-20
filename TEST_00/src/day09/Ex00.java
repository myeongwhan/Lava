package day09;

import java.util.Arrays;

/*
 	String str = "GitHub is built for collaboration. 
 		Set up an organization to improve the way your team works together, 
 		and get access to more features.";
 	
 	1. str 문장을 두 문장으로 분리해서 배열에 넣으세요
 		String[] str1 = new String['.' 개수만큼 배열개수];
 	2. 단어 수만큼의 크기를 가지는 배열을 만들고 배열에 단어를 입력하세요(toCharArray x)
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
