package day03;
/**
 * day02 - Ex01 문제풀이
 */

/*
 	문제 3]
 		화씨(Fahrenheit) 100도는 섭씨(Celcius) 몇 도인지 알아보는
 		프로그램을 작성하세요
 			공식]
 				섭씨온도 = 5 / 9 * (화씨온도 - 32)
 */

/*
 	데이터 연산 결과
 		정수 +, -, *, /, % 정수		==> 정수
 		정수 + | - | * | / | % 문자	==> 정수(타입이 정수가 더 큼)
 		정수 + | - | * | / | % 실수	==> 실수
 		정수 - | * | / | % | 문자열	==> 에러(문자열은 +(결합)연산자 이외는 못 씀)
 		정수 + 문자열		==>	문자열
 		실수 + 문자열		==> 문자열
 		문자 + 문자열		==> 문자열
 		논리값 + 문자열		==> 문자열
 */
public class Hw03 {
	
	public static void main(String[] args) {
		// 화씨온도 변수 만들기
		double fr = 100;
		
		// 참고] 정수와 정수의 연산 결과는 정수가 나온다
		// 섭씨온도 계산
		double cl = 5 / 9. * (fr - 32);
		
		System.out.println("화씨 " + fr + " 는 섭씨 [" + 
		(int)(cl*10 + 5) / 10 + "] 도 입니다");
		
	}

}
