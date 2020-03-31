package yeonspjang;

import java.util.*;
public class ArrayListTest {

	public ArrayListTest() {
		ArrayTest();
	}

	public static void main(String[] args) {
		new ArrayListTest();
	}
	
	public void ArrayTest() {
		ArrayList list = new ArrayList();
		list.add("oo");
		list.add(1, "XXX");
		list.add("fqfqf");
		list.add("fqfqftw");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.indexOf("X"));
		list.clear();
		System.out.println(list);
	}

}
