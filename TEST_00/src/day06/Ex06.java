package day06;

import java.util.Arrays;

/*
 	문제 6]
	팩토리얼 10개를 저장할 배열을 만들고
	1부터 순차적으로 10까지의 팩토리얼을 만들어서 배열에 담고 꺼내서 출력하세요
 */
public class Ex06 {

	public static void main(String[] args) {
		int[] p = new int[10];
		p[0] = 1;
		
		int jun = p[0];
		for(int i=1; i<10; i++) {
			p[i] = (jun+1)*p[i-1];
			jun += 1;
		}
		
		System.out.println(Arrays.toString(p));

	}

}
