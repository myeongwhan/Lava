package yeonspjang;

public class ParseInt_Test {

	public ParseInt_Test() {
		String str1 = "±ט";
		String str2 = "ÀÌ";
		
		int tmp1 = Integer.parseInt(str1);
		int tmp2 = Integer.parseInt(str2);
		
		System.out.println(tmp1 - tmp2);
	}

	public static void main(String[] args) {
		new ParseInt_Test();
	}

}
