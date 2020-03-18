package day08;

import java.util.Arrays;

/*
 	"PengSoo Good!"
	이라는 문자열을 한 문자씩 꺼내서 배열로 저장하고
	하나씩 꺼내서 출력하세요
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
