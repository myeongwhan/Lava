package day19;

import java.io.*;
import java.util.*;
import javax.swing.*;
public class Test04 {

	public Test04() {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try {
			fin = new FileInputStream("src/day19/Test04.java");
			fout = new FileOutputStream("src/day19/Test04_01.java");
			/*
			fin = new FileInputStream("src/day19/etc/sample.txt");
			fout = new FileOutputStream("src/day19/etc/increpas.whw");
			*/
			String str = "";
			byte[] buff = new byte[1024];
			while(true) {
				Arrays.fill(buff, (byte)0);
				int len = fin.read(buff);
				if(len == -1) break;
				str += new String(buff, 0, len);
			}
			
			byte[] bstr = str.getBytes();
			fout.write(bstr);
			
			JOptionPane.showMessageDialog(null, "*** 파일 복사 완료");
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
