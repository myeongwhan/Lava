package day15;

import java.util.*;
public class Test08 {

	public Test08() {
		Date date = new Date();
		
		for(int i=0; i<10 ; i++) {
			System.out.println(date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
