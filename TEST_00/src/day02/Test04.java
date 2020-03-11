package day02;

public class Test04 {
/*
 	*****
 	생성자(Constructor)
 	: 클래스가 객체가 될 때 클래스의 멤버가 가져야 될 기본 값이 있을 것이다
 		이 때 그 멤버들의 기본값을 세팅해주는 역할을 하는 것이 생성자 함수
 		
 		형식]
 			public 클래스이름() {
 				내용...
 			}
 		
 		***
 		생성자 함수는 반환값이 없다
 		
 		***
 		생성자 함수를 하나도 정의하지 않으면
 		자바 가상머신이 자동으로 기본 생성자 함수를 만들어서 호출해준다
 		
 		만일 생성자 함수를 하나라도 만들면
 		자바 가상머신은 기본 생성자 함수를 만들지 않는다
 		
 		따라서 생성자 함수를 정의할거면
 		내용이 없더라도 기본 생성자 함수를 정의해두는 것이 좋다
 */
	
/*
	비교 연산자
		: 변수나 상수의 크기를 비교해서 논리값을 얻는 연산자
		
	참고]
		수학에서 비교연산자를 사용하듯이 한 번에 두 개를 비교할 수는 없다
		ex]
			int no = 10;
			1 <= no <= 20;	==> 에러
			
		==>	(1 <= no) & (no <= 20);
		
	
	논리연산자
		논리값을 가지고 연산해서 논리값을 얻어내는 연산자
		
		종류]
			&	- 두 조건이 모두 참이면 참
			|	- 두 조건 중 하나가 참이면 참
			!	- 부정 연산자(참이면 거짓으로, 거짓이면 참으로)
			
			절삭연산을 하는 논리연산자
			&&	- 두 조건이 모두 참이면 참
			||	- 두 조건 중 하나가 참이면 참
			
 */
	public Test04() {
		test1();
		test2();
	}
	
	public static void main(String[] args) {
		new Test04();
	}
	
	public void test1() {
		char ch1 = 'A';
		char ch2 = 97;
		System.out.println("97 : " + ch2);
		int no1 = ch1;
		
		ch2 = (char)(no1 + 3);
		
		boolean bool1 = false;
		boolean bool2 = true;
		
		System.out.println(ch1 < 'a');
	}
	
	public void test2() {
		boolean bool1 = false;
		boolean bool2 = true;
		
		System.out.println("1. " + (bool1 & bool2));
		System.out.println("2. " + (bool1 | bool2));
		System.out.println("3. " + !(bool1 & bool2));
		
		int no1 = 10;
		int no2 = 11;
		
		System.out.println("4. " + ((no1 > no2) && (++no1 == no2)));
		System.out.println("4-1. " + no1);
		//	==> 앞이 거짓이면 뒤의 식은 읽지 않으므로 no1에 증감연산이 적용되지 않음
		System.out.println("5. " + ((no1 < no2) || (++no1 == no2)));
		//	==> 앞이 참이면 뒤의 식은 읽지 않으므로 no1에 증감연산이 적용되지 않음
		System.out.println("5-1. " + no1);
		
		// 비트연산자
		System.out.println("6. " + (35 & 24));
	}
}
