package day19;

/*
 	Test11.java 파일을 읽어보자
 */
import java.io.*;
import javax.swing.*;
public class Test12 {

	public Test12() {
		// 타겟스트림 준비
		FileReader fr = null;
		// 필터스트림 준비
		BufferedReader br = null;
		
		try {
			// 스트림 초기화
			fr = new FileReader("src/day19/Test11.java");
			br = new BufferedReader(fr);
			// 몇 번 읽어야 할지 모르므로 반복해서 처리한다
			String msg = "";
			while(true) {
				String str = br.readLine();
				if(str == null) {
					break;
				}
				msg += str + "\n";
			}
			
			// 읽은 내용 출력
			JOptionPane.showMessageDialog(null, msg);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			try {
				br.close();
				fr.close();
			} catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test12();
	}

}
