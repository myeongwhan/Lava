package day08.preSolv;

import java.util.Arrays;

/*
 	
 	문제 4]
	전화번호를 입력하면 
	'-'를 기준으로 데이터를 분리해서 저장할 배열을 만들고
	분리된 데이터를 순서에 맞게 입력하고 출력하세요
	indexOf(), substring()
 
 */
import javax.swing.*;
public class Solv04 {

	public static void main(String[] args) {
		// 전화번호는 xxx-xxxx-xxxx 의 형식으로 입력받을 것이고
		// 이 번호를 문자열로 저장하고 
		// 문자열중에 '-' 의 개수만큼 반복해서 번호를 나누고 배열에 저장
		
		// 입력받아서 변수에 저장
		String phone = JOptionPane.showInputDialog("번호입력: ");
		
		// '-'의 개수 카운트
		int cnt = 0;
		for(int i=0; i<phone.length(); i++) {
			char ch = phone.charAt(i);
			if(ch < '0' || ch > '9') ++cnt;
		}
		
		// 분리된 문자열을 입력할 배열 만들기
		//	==> 전화번호를 분리하게 되면 '-'의 개수보다 1개 더 많은 문자열로 분리됨
		String[] arr = new String[cnt + 1];
		
		// 배열에 문자열을 분리해서 입력
		// 잘려진 문자열을 저장할 변수(작업할 변수)를 만듦
		// 처음에는 전체 문자열이 모두 저장이 되어야 될 것이다
		String tmp = phone;
		int idx = 0;
		for(int i=0; i<cnt; i++) {
			// '-'의 인덱스 알아내기
//			idx = tmp.indexOf('-');
			// 간혹 '-'를 넣지 않고 다른 특수문자')'등을 입력하는 경우가 있다
			for(int j=0; j<tmp.length(); j++) {
				if(tmp.charAt(j)<'0' || tmp.charAt(j)>'9') {
					idx=j;
					break;
				}
			}
			// '-' 이전까지의 문자열 추출
			arr[i] = tmp.substring(0, idx);
			// 추출하고 남은 뒷 번호를 다시 tmp에 저장, 반복
			tmp = tmp.substring(idx+1);
		}
		arr[cnt] = tmp;
		
		JOptionPane.showMessageDialog(null, "번호: " + phone + 
											"\n분리해놓은 배열: " + Arrays.deepToString(arr));

	}

}
