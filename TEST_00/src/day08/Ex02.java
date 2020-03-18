package day08;

import java.util.*;

/*
 	문제 2]
	국어, 수학, 영어, 물리, 역사 점수를 관리하려고 한다(점수는 랜덤)
	학생의 수는 5명이고 2차원 배열로 만들어서
	5명의 점수를 저장할 배열을 만드세요
 */
public class Ex02 {

	public static void main(String[] args) {
		int[][] so = new int[5][5];
		
		for(int i=0; i<so.length; i++) {
			for(int j=0; j<so[i].length; j++) {
				so[i][j] = (int)(Math.random()*(100-0+1));
			}
		}
		System.out.print(Arrays.deepToString(so));

	}

}
