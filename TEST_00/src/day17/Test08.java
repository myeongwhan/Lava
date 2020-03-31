package day17;

import java.util.*;
import javax.swing.*;
public class Test08 {

	public Test08() {
		// Hashtable - HashMap의 구버젼
		// 변수 만들고
		Hashtable<String, String> table = new Hashtable<String, String>();
		// 데이터 채우고
		table.put("이름", "큰손");
		table.put("tel", "010-9999-9999");
		table.put("직업", "건물주");
		table.put("부업", "재벌");
		
		/*
		for(;;) {
			// 데이터 꺼내기
			// 먼저 키를 만들고
			String key = JOptionPane.showInputDialog("알고싶은 정보를 입력하세요");
			if(key.equals("q")) break;
			// 데이터 꺼내서 보여주고
			JOptionPane.showMessageDialog(null, table.get(key));
		}
		
		// Map 계열은 키값을 알아야 데이터를 꺼낼 수 있다
		*/
		
		Collection<String> con = table.values();
		
		// Iterator로 변환 후 출력
		Iterator<String> itor = con.iterator();
		
		// 하나씩 순차적으로 꺼내서 출력
		while(itor.hasNext()) {
			System.out.print(itor.next() + " | ");
		}
		System.out.println();
		
		// 키값만 뽑아보자
		Enumeration<String> en = table.keys();
		
		// Iterator 처럼 꺼내주자
		while(en.hasMoreElements()) {
			// 문자열 변수에 담고
			String key = en.nextElement();
			// 출력
			System.out.print("key: " + key + " \n\t ");
			// Enumeration도 버퍼에 저장되는 데이터이므로 꺼내는 순간 사라지는 데이터이다
			// 따라서 꺼내면 즉시 사용하거나 따로 보관해야 한다
			System.out.println(key + " : " + table.get(key));
		}
		System.out.println();
		
		/*
		while(en.hasMoreElements()) {
			String key = en.nextElement();
		}
		버퍼메모리이기 때문에 위에서 꺼내고 데이터가 사라짐. 고로 위에서 꺼내야 됨
		*/
		System.out.println();
	}

	public static void main(String[] args) {
		new Test08();
	}

}
