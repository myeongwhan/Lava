package exam;

import java.util.Arrays;

/*
 	문제 1]
	 	JOptionPane 으로 숫자를 입력받아서 배열을 만들고
	 	배열이 기억할 수 있는 개수만큼 숫자를 입력받아서
	 	그 숫자들의 합을 구해주는 프로그램을 작성하세요
	 	단, 합을 구하는 기능은 함수를 만들어서 처리하세요
 */
import javax.swing.*;
public class Ex01 {

	public Ex01() {
		
		String str = JOptionPane.showInputDialog("배열 개수: ");
		int no = Integer.parseInt(str);
		
		int[] arr = new int[no];
		for(int i=0; i<arr.length; i++) {
			String str2 = JOptionPane.showInputDialog("숫자 입력: ");
			int no2 = Integer.parseInt(str2);
			arr[i] = no2;
		}
		
		JOptionPane.showMessageDialog(null, getSum(arr));
		
	}
	
	public int getSum(int...a) {
		int no = 0;
		for(int i=0; i<a.length; i++) {
			no += a[i];
		}
		return no;
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
