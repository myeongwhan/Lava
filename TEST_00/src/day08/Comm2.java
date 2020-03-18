package day08;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 	comm 2]
	금액을 입력하면 금액만큼의 로또게임을 만들어주는 프로그램을 작성하세요
	로또 한 게임은 1000원, 한 장에는 5게임이 들어가고
	입력 금액은 1000원 단위로 하기로 한다
	단, 로또 번호는 오름차순 정렬해서 저장하세요
	
	예]
		입력금액 : 8000원
		로또:
			1,2,3,4,5,6			- 1게임
			7,8,9,10,11,12		- 2게임
			...
			11,12,13,14,15,16	- 5게임
			--------------------------
			1,2,3,4,5,6			- 6게임
			7,8,9,10,11,12		- 7게임
			11,12,13,14,15,16	- 8게임
 */
public class Comm2 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		loop:
		for(int i=0; i<lotto.length; i++) {
			int no = (int)(Math.random()*(45-1+1)+1);
			
			for(int j=0; j<i; j++) {
				if(lotto[j] == no) {
					i--;
					continue loop;
				}
			}
			
			lotto[i] = no;
		}		
		
		for(int i=0; i<lotto.length-1; i++) {
			
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
			
		}
		
		int don = 8000;//JOptionPane.showInputDialog("금액입력: ");
		int game = don/1000;
		
		for(int i=0; i<game; i++) {
			
		}
		JOptionPane.showMessageDialog(null,
				"**당첨금액**\n" + Arrays.toString(lotto) + "\t " + game+"게임");

	}

}
