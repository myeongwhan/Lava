package day01;

public class Ex01 {
/*
 	1.	1, 2, 5, 10, 20 을 제외한 숫자 하나를 가정하고(양수, 음수 모두)
 		이것을 2진수로 바꿔보고 실제 프로그램의 결과와 일치하는지 확인하세요
 		
 		비트코드 확인 방법
 			Integer.toBinaryString(숫자)
 			
-------------------------------------------------------

	2.	반지름이 7인 원의 넓이, 둘레를 계산해서 출력하세요
		원의 둘레 : 2 * 반지름 * 3.14
		원의 넓이 : 반지름 * 반지름 * 3.14
		
		단, 반지름, 둘레, 넓이는 변수를 만들어서 처리하세요
		둘레는 float 타입의 변수로 만드세요
		
	3.	두 개의 숫자(정수)를 변수에 담고 두 수를 가로, 세로로 하는 사각형의 넓이를 구하세요
	
	4.	3번 문제의 두 수를 밑변과 높이로 가지는 삼각형의 넓이를 구하세요
	
	5. 54232원을 지불해야 하는데, 우리나라의 화폐로 각 단위가 몇 개나 필요한지 계산해서 출력하세요
		5만원권 - 1장, 1만원권 - 0장, 5천원권 - 0장, ...
		
	숙제]
		1년은 365.2426일이다.
		이 날짜는 과연 며칠, 몇 시간, 몇 분, 몇 초인지 계산해서 출력하세요
 */
	public static void main(String[] args) {
		System.out.println("8214 : " + Integer.toBinaryString(8214));
		System.out.println("-8 : " + Integer.toBinaryString(-8));
		System.out.println("-8214 : " + Integer.toBinaryString(-8214));
		
		int r = 7;
		double PI = 3.14;
		System.out.println("원의 둘레 : " + 2*r*PI);
		System.out.println("원의 넓이 : " + (float)r*r*PI);
		
		int no1 = 4;
		int no2 = 5;
		
		System.out.println("사각형 넓이 : " + no1*no2);
		System.out.println("삼각형 넓이 : " + no1*no2/2);
		

		System.out.println();
		getMoneyCnt();
		
		System.out.println();
		illNyon();
		
	}
	
	public static void getMoneyCnt() {
		int money = 54232;
		int oman = 0;
		int man = 0;
		int ochun = 0;
		int chun = 0;
		int obak = 0;
		int bak = 0;
		int osib = 0;
		int sib = 0;
		int o = 0;
		int i = 0;
		
		int tmp = money;
		oman = tmp / 50000;
		tmp %= 50000;
		man = tmp / 10000;
		tmp %= 10000;
		ochun = tmp / 5000;
		tmp %= 5000;
		chun = tmp / 1000;
		tmp %= 1000;
		obak = tmp / 500;
		tmp %= 500;
		bak = tmp / 100;
		tmp %= 100;
		osib = tmp / 50;
		tmp %= 50;
		sib = tmp / 10;
		tmp %= 10;
		o = tmp / 5;
		tmp %= 5;
		i = tmp / 1;
		tmp %= 1;

		System.out.println("오만 "+ oman + " 만 " + man + " 오천 " + ochun + " 천 " + chun + " 오백 " + obak + " 백 " + bak + 
				" 오십 " + osib + " 십 " + sib + " 오 " + o + " 일 " + i);
	}
	
	public static void illNyon() {
		double year = 365.2426;
		
		double hour = year*24;
		double min = hour*60;
		double sec = min*60;
		int day = (int)year;
		
		System.out.println("일:" + day + " 시간:" + (int)hour + " 분:" +(int)min + " 초:" +(int)sec);
	}
}
