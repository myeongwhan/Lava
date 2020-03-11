package day03;
/**
 * day02 - Ex01 문제풀이
 */

/*
	문제 2]
 		0 ~ 255 사이의 숫자를 랜덤하게 만들고
 		그 숫자를 코드값으로 하는 문자를 만들어서
 		해당 문자가 영문자인지 아닌지 판별해서 출력하세요
 		단, 삼항 연산자를 사용해서 처리하세요
 */
public class Hw02 {
	public Hw02() {
		solv1();
	}
	
	// 숫자를 랜덤하게 만들고 문자로 변경하고 영문자인지 아닌지 판별하는 함수
	public void solv1() {
		// 랜덤숫자만들기
		int num = (int)(Math.random()*(255 - 0 +1));
		// 문자로 변경
		char ch = (char)num;
		// 문자 판별
		String msg = (ch >= 'A' && ch <= 'Z') ? 
									("영대문자") : 
									(
										(ch >= 'a' && ch <= 'z') ? ("영소문자") : ("영문이 아닌 문자")
									);
		// 출력
		System.out.println("랜덤하게 발생한 문자 : [" + ch + "] 는 [" + msg + "] 입니다.");
		
	}
	public static void main(String[] args) {
		new Hw02();
	}
}
