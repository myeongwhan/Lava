package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 	문제 4]
	전화번호를 입력하면 
	'-'를 기준으로 데이터를 분리해서 저장할 배열을 만들고
	분리된 데이터를 순서에 맞게 입력하고 출력하세요
	indexOf(), substring()
 */
public class Ex04 {
	
	public Ex04(){
		String sTel = "010-1234-2345";
		String[] sNum = new String[3];
		
		int idx = sTel.indexOf('-');
		sNum[0] = sTel.substring(0, idx);
		String tmp = sTel.substring(idx + 1);
		idx = tmp.indexOf('-');
		sNum[1] = tmp.substring(0, idx);
		sNum[2] = tmp.substring(idx + 1);
	}

	public static void main(String[] args) {
		String tel = JOptionPane.showInputDialog(null, "전화번호 입력: ");
		
		String result[] = new String[3];
		
		result[0] = tel.substring(0, 3);
		result[1] = tel.substring(4, 8);
		result[2] = tel.substring(9, 13);
		
		for(int i=0; i<3; i++) {
			
		}
		
		String msg = Arrays.deepToString(result);
		JOptionPane.showMessageDialog(null, msg);

	}

}
