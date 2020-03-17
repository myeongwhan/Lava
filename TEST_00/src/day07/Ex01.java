package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 	문제 1]
	알파벳 10개를 저장할 배열을 만들고
	대문자 10개를 랜덤하게 추출해서 배열에 저장하고
	저장된 배열을 얕은 복사로 복사해서 출력하고
	원래 배열을 소문자로 변경한 후, 두 배열을 출력하세요
 */
public class Ex01 {

	public static void main(String[] args) {
		char[] ch1 = new char[10];
		for(int i=0; i<10; i++) {
			ch1[i] = (char)(Math.random()*('Z'-'A'+1)+'A');
		}
		
		char[] ch2 = ch1;
		
		String msg1 = (Arrays.toString(ch2));
		JOptionPane.showMessageDialog(null, msg1);
		
		for(int i=0; i<10; i++) {
			ch1[i] += 32;
		}
		
		String msg2 = ("ch1: " + Arrays.toString(ch1)
					+ "\nch2: " + Arrays.toString(ch2));
		
		JOptionPane.showMessageDialog(null, msg2);

	}

}
