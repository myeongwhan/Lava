package day14;

/*
 	추가 학습]
 		메인 기능을 함수로 제작해서 처리하세요
 */
import javax.swing.JOptionPane;
public class Ex01 {
	
	public Ex01() {
		String str = JOptionPane.showInputDialog("나이입력: ");
		
		int age = 0;
		String msg = "";
		
		try {
			age = Integer.parseInt(str);
			if(age<10) {
				JOptionPane.showMessageDialog(null, "유아");
			} else if(age<20) {
				JOptionPane.showMessageDialog(null, "10대");
			} else if(age<30) {
				JOptionPane.showMessageDialog(null, "20대");
			} else if(age<40) {
				JOptionPane.showMessageDialog(null, "30대");
			} else if(age<50) {
				JOptionPane.showMessageDialog(null, "40대");
			} else {
				JOptionPane.showMessageDialog(null, "50대 이상");
			}
		} catch(Exception e) {
			msg = "나이 형식이 아닙니다";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
