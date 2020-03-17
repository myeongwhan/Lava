package day06;

import java.util.Arrays;

/*
 	문제 1]
	'A' ~ 'J'까지의 문자를 순차적으로 만들어서 배열에 넣고 
	각 문자를 하나씩 꺼내서 소문자로 변경하여 출력하세요
	배열에 담긴 내용을 문자열로 확인해서 출력하세요
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
