package day08;

import java.util.Arrays;

/*
 	문제 0]
	구구단을 출력하는데
	단과 곱을 배열을 만들어서 처리하고 출력하세요
	-------------------
	| 단		|		곱 |
	-------------------
	int[] dan = {2, 3, 4, ... , 9};
	int[] gop = {1, 2, 3, ... , 9};
	==> 초기화는 반복문으로
	int[][] gugudan = {dan, gop};
	
	출력형태는
		2 x 1 = 2
		2 x 2 = 4
		...
		2 x 9 = 18
		---------
		3 x 1 = 3
		...
 */
public class Ex00 {

	public static void main(String[] args) {
		int[] dan = new int[8];
		int[] gop = new int[9];
		int[][] gugudan = {dan, gop};
		
		for(int i=0; i<dan.length; i++) {
			dan[i] = i+2;
		}
		
		for(int i=0; i<gop.length; i++) {
			gop[i] = i+1;
		}
		
		System.out.print(Arrays.deepToString(gugudan));
		
		int[] tdan = gugudan[0];
		int[] tgop = gugudan[1];
		
		for(int i=0; i<tdan.length; i++) {
			for(int j=0; j<tgop.length; j++) {
				System.out.printf(tdan[i] + "x" + tgop[j] + "=" + tdan[i]*tgop[j]);
				System.out.println();
			}
			System.out.println("=========");
		}
		
		/*
		for(int i=0; i<dan.length; i++) {
			for(int j=0; j<gop.length; j++) {
				System.out.printf(dan[i] + "x" + gop[j] + "=" + dan[i]*gop[j]);
				System.out.println();
			}
			System.out.println("=========");
		}
		*/
	

	}

}
