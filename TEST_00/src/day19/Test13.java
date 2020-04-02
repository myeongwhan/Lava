package day19;

/*
 	day19/etc/poem.txt 파일을 읽어보자
 	FileInputStream으로 읽고	(byte)
 	BufferedReader를 연결해보자	(char)
 	
 	이렇게 크기가 다른 스트림을 연결해주는 보조스트림이
 	InputStreamReader / OutputStreamWriter
 	가 있다
 */
import java.io.*;
import javax.swing.*;
public class Test13 {

	public Test13() {
		// 타겟스트림
		FileInputStream fin = null;
		// 보조스트림 -1
		InputStreamReader ir = null;
		// 보조스트림 -2
		BufferedReader br = null;
		
		try {
			fin = new FileInputStream("src/day19/etc/poem.txt");
			ir = new InputStreamReader(fin);
			br = new BufferedReader(ir);
			
			StringBuffer buff = new StringBuffer();
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				
				buff.append(str + "\n");
			}
			
			JOptionPane.showMessageDialog(null, buff.toString());
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			try {
				br.close();
				ir.close();
				fin.close();
			} catch(Exception e) {
				
			}
		}
		
	}

	public static void main(String[] args) {
		new Test13();
	}

}
