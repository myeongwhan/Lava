package day18;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

import javax.swing.*;
public class Ex01 {
/*
 	문제 1]
 		Ex01.txt에 저장된 데이터를 Properties에 담고
 		키값을 모두 꺼내서 데이터를 추출하고 총점을 구해주세요
 		메시지 창을 띄워서 총점을 출력해주세요
 */
	public Ex01() {
		Properties prop = new Properties();
		
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day18/Ex01.txt");
			prop.load(fin);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		JOptionPane.showMessageDialog(null, "kor: " + prop.get("kor"));
		JOptionPane.showMessageDialog(null, "eng: " + prop.get("eng"));
		JOptionPane.showMessageDialog(null, "math: " + prop.get("math"));
		JOptionPane.showMessageDialog(null, "physic: " + prop.get("physic"));
		JOptionPane.showMessageDialog(null, "code: " + prop.get("code"));
		
//		Iterator itor = prop.entrySet().iterator();
//		Iterator<Entry<Object, Object>> itor = prop.entrySet().iterator();
//		int tmp = 0;
//		while(itor.hasNext()) {
//			tmp = Integer.parseInt(itor.next());
//		}
//		JOptionPane.showMessageDialog(null, tmp);
		
		Set set = prop.entrySet();
		ArrayList<Map.Entry<String, String>> eList = new ArrayList<Map.Entry<String,String>>(set);
		int sum = 0;
		for(int i=0; i<eList.size(); i++) {
			sum += Integer.parseInt(eList.get(i).getValue());
		}
			JOptionPane.showMessageDialog(null, "총점: " + sum);
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
