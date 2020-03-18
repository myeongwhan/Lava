package day08.preSolv;

/*
	extra ]
		영문 문자열을 입력받아서
		해당 알파벳이 출현하는 빈도를 저장하고
		빈도를 * 로 표현하세요.
		
		
		"We are the World!"
		==> [W|e| |a|r|t|h|o|l|d|!]
		==> [2|3|3|1|2|1|1|1|1|1|1]
 */

import javax.swing.*;
public class SolvExtra_02 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("영문을 입력하세요!");
		
		// 할일
		
		// 1. 포함되어 있는 문자의 가지수를 구한다.
		int cnt = 0 ;
		loop:
		for(int i = 0 ; i < str.length(); i++ ) {
			for(int j = 0 ; j < i; j++ ) {
				if(str.charAt(j) == str.charAt(i)) {
					continue loop;
				}
			}
			++cnt;
		}
		
		// 2. 포함된 문자의배열을 만들 수 있게 되었으므로 문자배열과 카운트 배열을 만든다.
		char[] ch = new char[cnt];	// 포함된 문자를 저장할 배열
		
		for(int i = 0 ; i < ch.length ; i++ ) {
			loop:
			for(int j = 0 ; j < str.length() ; j++) {
				for(int k = 0 ; k < i ; k++) {
					if(str.charAt(j) == ch[k]) {
						continue loop;
					}
				}
				ch[i] = str.charAt(j);
				break;
			}
		}
		
		// 문자배열을 문자의 아스키코드가 작은 순으로 정렬하고
		
		for(int i = 0 ; i < ch.length - 1;i++ ) {
			for(int j = i+1; j < ch.length; j++ ) {
				if(ch[i] > ch[j]) {
					char c = ch[i];
					ch[i] = ch[j];
					ch[j] = c;
				}
			}
		}
		
		int[] count = new int[cnt];	// 포함된 문자의 출현빈도를 기억할 배열
		// 2. 문자마다 출현하는 카운트를 구해준다.
		for(int i = 0 ; i < ch.length; i++ ) {
			char c = ch[i];
			for(int j = 0 ; j < str.length(); j++ ) {
				if(c == str.charAt(j)) {
					count[i] += 1;
				}
			}
		}
		
		// 3. 출력한다.
		StringBuffer buff = new StringBuffer();
		for(int i = 0 ; i < ch.length ; i++ ) {
			buff.append("  ");
			buff.append(ch[i]);
			buff.append("   :   ");
			for(int j = 0 ; j < count[i] ; j++ ) {
				buff.append("*");
			}
			buff.append("\n");
		}
		
		JOptionPane.showMessageDialog(null, buff.toString());
		
	}

}