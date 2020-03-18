package day08;

import java.util.Arrays;

/*
 	���� 0]
	�������� ����ϴµ�
	�ܰ� ���� �迭�� ���� ó���ϰ� ����ϼ���
	-------------------
	| ��		|		�� |
	-------------------
	int[] dan = {2, 3, 4, ... , 9};
	int[] gop = {1, 2, 3, ... , 9};
	==> �ʱ�ȭ�� �ݺ�������
	int[][] gugudan = {dan, gop};
	
	������´�
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
