package day08;

import java.util.*;

public class EchaArray01 {

	public static void main(String[] args) {
		// 2차배열을 관리할 변수 선언
		int[][]num;
		
		// 변수에 배열을 만들어서 기억시킴
		num = new int[3][];
		
		num[0] = new int[3];
		num[1] = new int[5];
		num[2] = new int[7];
		
		// 출력해본다
		System.out.println(Arrays.deepToString(num));

	}

}
