package day07;

import javax.swing.JOptionPane;

/*
 	extra]
	영문 문자열을 입력받아서
	해당 알파벳이 출현하는 빈도를 저장하고
	빈도를 * 로 표현하세요
 */
public class Ex05 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("영문 입력: ");
		
		char ch[] = str.toCharArray();
		
		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<str.length(); j++) {
				if(ch[i] == ch[j]) {
					cnt++;
				}
			}
		}
		
		String bindo[] = new String[str.length()];
		

	}

}
