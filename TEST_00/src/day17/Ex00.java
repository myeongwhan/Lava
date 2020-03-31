package day17;

import java.util.ArrayList;
import java.util.Collections;

public class Ex00 {

	public Ex00() {
		ArrayList<Semo> list = new ArrayList<Semo>();
		for(int i=0; i<10; i++) {
			int no1 = (int)(Math.random()*(10-1+1)+1);
			int no2 = (int)(Math.random()*(10-1+1)+1);
			list.add(new Semo(no1, no2));
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getArea() + " | ");
		}
		
		System.out.println();
		
		// ³ÐÀÌ Á¤·Ä
		Collections.sort(list, new Ex00_Sort01());
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getArea() + " | ");
		}
		
		System.out.println();
		
		// ¹Øº¯ Á¤·Ä
		Collections.sort(list, new Ex00_Sort02());
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i).getMit() + " | ");
		}
		
		System.out.println();
		
	}

	public static void main(String[] args) {
		new Ex00();
	}

}
