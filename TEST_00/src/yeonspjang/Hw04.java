package yeonspjang;

import java.util.Scanner;

public class Hw04 {

	public Hw04() {
		getArea();
	}
	
	private void getArea() {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력: ");
		
		int rad = sc.nextInt();
		sc.close();
		
		System.out.println("넓이: " + 3.14*rad*rad);
	}

	public static void main(String[] args) {
		new Hw04();
	}

}
