package day10;

public class Test04 {

	public static void main(String[] args) {
		String str = "TODO Auto-generated method stub";
		
		int idx = str.lastIndexOf('o',5);
		System.out.println(idx);
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i) + " - " + i);
		}

	}

}
