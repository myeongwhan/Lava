package day02;

import java.util.*;
public class Ex01 {
/*
 	문제 1]
 		3자리로 구성된 숫자 하나를 입력받은 후 또는 랜덤하게 만든 후
 		백자리 이하를 버린 숫자를 만들어서 출력하세요
 			예]
 			456 --> 400
 		
 	문제 2]
 		0 ~ 255 사이의 숫자를 랜덤하게 만들고
 		그 숫자를 코드값으로 하는 문자를 만들어서
 		해당 문자가 영문자인지 아닌지 판별해서 출력하세요
 		단, 삼항 연산자를 사용해서 처리하세요
 		
 	문제 3]
 		화씨(Fahrenheit) 100도는 섭씨(Celcius) 몇 도인지 알아보는
 		프로그램을 작성하세요
 			공식]
 				섭씨온도 = 5 / 9 * (화씨온도 - 32)
 	
 	문제 4]
 		소수점이 있는 숫자를 입력한 후
 		소수점 이하 셋째 자리에서 반올림한 결과를 출력하세요
 		
 			원리]
 				+0.005를 하면 셋째 자리에서 변화가 일어날 것이고
 				여기에 x100 해주면 둘째 자리까지 정수부에 들어갈 것이고
 				이것을 정수로 바꾸면 원숫자의 셋째 자리 이하는 버릴 것이고
 				다시 /100 해주면 원 소수점 형태로 변환될 것이다
 				
 	문제 5]
 		10 ~ 99 사이의 랜덤한 숫자를 발생시킨 후
 		그 숫자가 가까운 10의 배수의 차를 출력하는 프로그램을 작성하세요
 			예]
 			45는 50과의 차가 5가 난다
 			53은 50과의 차가 3이 난다
 			
 	문제 6]
		임의의 년도를 입력받아서
		해당 년도가 윤년인지 평년인지 판별해서 출력해주는 프로그램을 작성하세요
		단, 삼항연산자를 사용해서 처리하세요
			윤년의 정의]
				4로 나누어 떨어지고 100으로 나누어 떨어지지 않으며,
				400으로 나누어 떨어지는 해를 윤년이라 한다
 	
 */
	// 기본 생성자 함수 정의
	public Ex01() {
		Scanner sc = new Scanner(System.in);
		System.out.print("3자리 입력 : ");
		int num = sc.nextInt();
		
		int result = num - (num % 100);
		
		System.out.println("결과 : " + result);
		
	}
	
	public void sov1() {
		int num = (int)(Math.random()*(999-100+1)) + 100;
		
		int result = num - (num % 100);
	}
	
	public static void sov2() {
		int num = (int)(Math.random()*(255-0+1)) + 0;
		
		System.out.print("랜덤숫자 : " + num + " ");
		String str = (num >= 'A' & num <= 'Z')? "영대문자" + (char)num: 
				((num>='a' & num <= 'z') ? "영소문자" + num: "다른문자" + num) ;
		
		System.out.println("결과 : " + str);
	}
	
	public static void sov3() {
		int ff = 100;
		float cc = 5f/9f*(ff - 32);
		
		System.out.println("화씨 100도 : 섭씨 " + cc + "도");
	}
	
	public static void sov4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("소수 있는 숫자 입력 : ");
		float num = sc.nextFloat();
		
		float num2 = (float)(num+0.005)*100;
		
		int num3 = (int)num2;
		
		System.out.println("반올림 결과 : " + (float)(num3*0.01));
	}
	
	public static void sov5() {
		int no = (int)(Math.random()*(99 - 10 + 1)) + 99;
		int namuge = no % 10;
		int nof = no/10*10;
		int nof2 = (no/10 +1)*10;
		int result = (namuge < 5)? (nof):(nof2);
		
		System.out.println(no + "는 " + result + "와 " + (no-result));
	}
	
	public void sov6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도입력: ");
		int num = sc.nextInt();
		
		
	}
	
	public static void main(String[] args) {
		new Ex01();
		sov2();
		sov3();
		sov4();
		sov5();

	}

}
