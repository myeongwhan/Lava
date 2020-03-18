package day08.preSolv;

public class Temp {

	public static void main(String[] args) {
		String str = "We are the World!";
		System.out.println(str.substring(str.indexOf('W', 3), str.indexOf('!')));
		System.out.println(str.substring(str.indexOf("World"), str.indexOf('!')));

	}

}
