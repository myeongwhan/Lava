package day15;

import java.io.*;
import java.util.*;
public class Test06 {

	public Test06() {
		File f = new File("D:\\class\\Java\\git\\Lava\\TEST_00\\src\\doc\\ScannerTest.txt");
		
		Scanner scan = null;
		
		try {
			scan = new Scanner(f);
			String str = scan.nextLine();
			System.out.println("내 파일 내용: " + str);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
