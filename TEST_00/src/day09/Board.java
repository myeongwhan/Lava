package day09;

import java.util.Arrays;

/*
 	1 2 3 4 5 6 7 8 9 10
 	A B C D E F G H I J
 	가 나 다 라 마 바 ,사 ,아,자,차
 */
public class Board {

	public static void main(String[] args) {
		// 메인
		char[][] ch = new char[3][10];
		for(int i=0; i<10; i++) {
			ch[0][i] = (char)('0'+i);
		}
		
		ch[1][0] = 'A';
		for(int i=1; i<10; i++) {
			ch[1][i] = (char)(ch[1][0]+i);
		}
		
		ch[2][0] = '가';		ch[2][1] = '나';
		ch[2][2] = '다';		ch[2][3] = '라';
		ch[2][4] = '마';		ch[2][5] = '바';
		ch[2][6] = '사';		ch[2][7] = '아';
		ch[2][8] = '자';		ch[2][9] = '차';
		
		System.out.println(Arrays.deepToString(ch));
		
		// 1.
		char[][] ch1 = new char[2][10];
		for(int i=0; i<2; i++) {
			for(int j=0; j<10; j++) {
				ch1[i][j] = ch[i][j];
			}
		}
		
		// 2.
		char[][] ch2 = new char[2][10];
		for(int i=0; i<10; i++) {
			ch2[0][i] = ch[0][i];
		}
		for(int i=0; i<10; i++) {
			ch2[1][i] = ch[2][i];
		}
		
		// 3.
		char[][] ch3 = new char[10][3];
		for(int i=0; i<10; i++) {
			for(int j=0; j<3; j++) {
				ch3[i][j] = ch[j][i];
			}
		}
		
		// 4.
		char[][] ch4 = new char[10][2];
		for(int i=0; i<10; i++) {
			for(int j=0; j<2; j++) {
				ch4[i][j] = ch[j][i];
			}
		}
		
		// 5.
		char[][] ch5 = new char[10][2];
		for(int i=0; i<10; i++) {
			ch5[i][0] = ch[0][i];
		}
		for(int i=0; i<10; i++) {
			ch5[i][1] = ch[2][i];
		}
		
		
		System.out.println(Arrays.deepToString(ch1));
		System.out.println(Arrays.deepToString(ch2));
		System.out.println(Arrays.deepToString(ch3));
		System.out.println(Arrays.deepToString(ch4));
		System.out.println(Arrays.deepToString(ch5));

	}

}
