package day02;

public class Test02 {
	/*
	 	모든 클래스는 생성자 함수를 가지고 있다
	 	생성자 함수는 해당 클래스가 객체가 될 때 
	 	멤버가 가져야할 초기값을 세팅해주는 역할을 한다
	 	
	 	클래스에는 멤버가 변수와 함수가 있는데
	 	멤버변수 중 기본형 멤버변수들(8가지)은 자동으로 초기화가 이루어진다
	 		int ==> 0
	 		char ==> ' '
	 		boolean ==> false
	 		float ==> 0.0f
	 		double ==> 0.0
	 */
	
	int no;
	
	public static void main(String[] args) {
//		int num = no + 1;
		Test02 t2 = new Test02();
		System.out.println("Test02.no : " + t2.no);
		
//		abc();
		t2.abc();
	}
	
	public void abc() {
		System.out.println("***************");
	}
}
