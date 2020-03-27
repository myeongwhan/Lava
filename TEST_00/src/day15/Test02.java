package day15;

import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6}};
		
		List<int[]> list = Arrays.asList(arr);	// 배열을 다루기 위한 함수
		
		for(int[] a : list) {
			for(int no : a) {
				System.out.print(no + ", ");
			}
			System.out.println();
		}
	}

}
