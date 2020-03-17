package day06;

import java.util.Arrays;

/*
 	문제 4]
	반지름 5개를 기억할 배열을 만들고
	랜덤하게 2 ~ 30 까지의 5개의 반지름을 만들어서 입력하고
	각각의 반지름을 가진 원의 넓이를 계산해서 저장할 배열을 만들고
	각 원의 둘레를 계산해서 저장할 배열도 만들어서
	결과를 출력하는 프로그램을 작성하세요
	단, 출력 형태는
		예]
			반지름 : 10, 원의 둘레 : 62.8, 원의 넓이 : 314
	의 형태로 출력되게 하세요
 */
public class Ex04 {

	public static void main(String[] args) {
		int[] ban = new int[5];
		for(int i=0; i<5; i++) {
			ban[i] = (int)(Math.random()*(30-2+1)+2);
		}
		
		double[] mm = new double[5];
		for(int i=0; i<5; i++) {
			mm[i] = 3.14*ban[i]*ban[i];
		}
		
		double[] dd = new double[5];
		for(int i=0; i<5; i++) {
			dd[i] = 2*3.14*ban[i];
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("반지름: " + ban[i] +", "+ "둘레: " + dd[i] +", "+ "넓이: " + mm[i]);
		}
		

	}

}
