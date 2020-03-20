package day09;

import java.util.Arrays;

/*
 	문제 2]
	1차 배열에 10개의 데이터를 입력한 후
	총점과 평균을 구하는 프로그램을 작성하세요
	단, 입력, 총점계산, 평균계산, 출력은 함수로 처리하세요
 */
public class Ex02 {
	int[] bae = new int[10];
	
	public Ex02() {
		input();
		sum(bae);
		avg(sum(bae), 10);
		output();
		
	}
	
	public void input() {
		for(int i=0; i<10; i++) {
			bae[i] = (int)(Math.random()*(100));
			
		}
		System.out.println(Arrays.toString(bae));
	}
//	(int)(Math.random()*(100-0+1)+1)
	public int sum(int[] a) {
		int result = 0;
		for(int i=0; i<10; i++) {
			result += a[i];
		}
		return result;
	}
	
	public float avg(float a, float b) {
		float result = 0;
		result = a/b;
		return result;
	}
	
	public void output() {
		System.out.println(sum(bae));
		System.out.println(avg(sum(bae), bae.length));
	}

	public static void main(String[] args) {
		new Ex02();

	}

}
