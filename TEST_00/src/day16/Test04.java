package day16;

// ChoiceFormat
import java.text.*;

import javax.swing.JOptionPane;
public class Test04 {

	public Test04() {
		// ChoiceFormat 을 만들 때 limits, formats를 하나로 만들 수도 있다
		/*
		 	형식]
		 		60#D	- <= 의 의미(D는 60보다 크거나 같다)
		 		70<C	- < 의 의미(C는 70보다 크다)
		 		
		 		이것을 | 을 이용하여 연결해서 사용하면 된다
		 */
		String pattern = "0#F | 60#D | 70#C | 80<B | 90#A";
		// 60#D의 의미는 60 <= 면 다음 숫자보다는 작은 경우는 D로 처리한다
		
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		while(true) {
			String sno = JOptionPane.showInputDialog("점수 입력하세요.\n종료는 q");
			if(sno.equals("q")) {
				break;
			}
			int score = 0;
			try {
				score = Integer.parseInt(sno);
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "잘못된 점수입니다");
				continue;
			}
			
			// 등급 구하고
			String grade = form.format(score);
			
			// 결과 출력
			JOptionPane.showMessageDialog(null, "점수: " + score + "\n학점: " + grade);
		}
		
	}

	public static void main(String[] args) {
		new Test04();
	}

}
