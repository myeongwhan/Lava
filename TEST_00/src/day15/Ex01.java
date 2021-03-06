package day15;

/*
 	문제 1]
 		이메일을 입력받아서 
 		입력받은 문자열이 이메일 형식에 맞는지 검사하세요
 		이메일 형식은
 			알파벳과 숫자로 8글자 이상 + @ + 도메인주소
 		로 처리하세요
 		
 		\w{8,]@\w{2.10}\.[a-z]{2,3}\.?[a-z]{0.2}
 		
 		참고]
 			한글 처림 : [가-힣]	-	한글은 아이디에 쓰지 마세요
 */
import javax.swing.*;
import java.util.regex.*;
public class Ex01 {

	public static void main(String[] args) {
		String val = JOptionPane.showInputDialog("이메일 입력: ");
		
		Pattern pattern = Pattern.compile("\\w{8,]@\\w{2.10}\\.[a-z]{2,3}\\.?[a-z]{0.2}");
		
		Matcher match = pattern.matcher(val);
		
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "올바른 이메일입니다");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
	}

}
