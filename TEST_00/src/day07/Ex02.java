package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 	문제 2]
	정수 10개를 저장할 배열을 만들고
	랜덤하게 1 ~ 50까지 수 중에 발생시켜서 배열에 담고
	배열의 5번째까지 데이터를 깊은 복사로 복사하세요
 */
public class Ex02 {

	public static void main(String[] args) {
		int[] no = new int[10];
		for(int i=0; i<10; i++) {
			no[i] = (int)(Math.random()*(50-1+1)+1);
		}
		
		int[] no2 = new int[10];
		System.arraycopy(no, 0, no2, 0, 5);
		
		String msg = ("no: "+ Arrays.toString(no) +
				"\nno2: " + Arrays.toString(no2));
		
		JOptionPane.showMessageDialog(null, msg);
		

	}

}
