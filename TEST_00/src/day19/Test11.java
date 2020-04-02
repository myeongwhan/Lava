package day19;

/*
 	Test10에서 만든 문서를 읽어보자
 */
import java.io.*;
import javax.swing.*;
public class Test11 {

	public Test11() {
		// 스트림 준비
		FileReader fr = null;
		try {
			// 스트림 초기화
			fr = new FileReader("src/day19/etc/FileWriter_test.txt");
			
			/*
			// 1. 한 글자 읽기
			int ch = fr.read();
			JOptionPane.showMessageDialog(null, "읽은 데이터: " + (char)ch);
			*/
			
			// 2. 여러 글자 읽기
			char[] buff = new char[1024];
			int len = fr.read(buff);
			// 문자 배열을 문자열로 변환
			String str = new String(buff, 0, len);
			
			JOptionPane.showMessageDialog(null, "읽은 데이터: " + str);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				fr.close();
			} catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
