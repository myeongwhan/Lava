package day06;

/*
 	문제 5]
	피보나치 수열 10개를 저장할 배열을 만들고
	배열에 값을 입력해서 배열에 저장된 데이터를 출력하세요
	(앞의 두개 숫자를 더해서 나온 값)
 */
import java.util.*;
public class Ex05 {

	public static void main(String[] args) {
		int[] pibo = new int[10];
		pibo[0] = 1;
		pibo[1] = 1;
		
		int jun = pibo[0];
		int hu = pibo[1];
		for(int i=2; i < 10; i++) {
			pibo[i] = jun + hu;
			jun = hu;
			hu = pibo[i];
		}
		System.out.println(Arrays.toString(pibo));

	}

}
