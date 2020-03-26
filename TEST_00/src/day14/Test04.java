package day14;

import javax.swing.JOptionPane;

public class Test04 extends Test03 {
	
	// Test03의 getNum()의 기능을 수정해보자
	// 입력받은 숫자에 10을 곱한 정수를 반환해주도록 오버라이드 해보자
	/*
	 	오버라이드 규칙]
	 		0. 상속을 받아야 한다
	 		1. 함수의 원형을 유지한다
	 		2. 접근지정자는 같거나 넓은 범위로
	 		3. 예외처리는 같거나 좁은 범위로
	 */
	
	public int getNum() throws NumberFormatException, Exception {
		int num = 0;
		String sno = JOptionPane.showInputDialog("숫자입력: ");
		num = Integer.parseInt(sno);
		
		// 음수일 경우 강제로 예외를 발생시킨다
		if(num < 0)	{
			throw new NumberFormatException();
		}

		return num * 10;
	}

	public static void main(String[] args) {
		new Test04();
	}

}
