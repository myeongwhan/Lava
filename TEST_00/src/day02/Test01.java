package day02;

import java.util.*;
public class Test01 {
/*
	자바 프로그램의 토큰 구분
	
	 	==> 컴파일러는 토큰 단위로 번역을 시도한다
	 		따라서 개발자는 컴파일러가 번역을 하는 토큰을 구분해줘야 한다
	 		이 때 " ; " 기호를 사용해서 구분을 한다
	 		
	 	우리가 습관적으로 int a = 20; 라 작성한 이유는
	 	토큰을 구분해주기 위한 기호이기 때문
	 	
	 	결론적으로 토큰이란 하나의 명령이 종료되었음을 알려주는 기호이다
	 	만약 개발자가 토큰 구분을 하지 않으면 오류가 날 수 있다
	 	
	 	ex]
	 		int a = 10
	 		int b = 20;
	 			==> 컴파일러는 위의 두 줄을 하나의 명령으로 간주해서 처리할 것이고,
	 				이런 형식의 명령은 자바에서 존재하지 않으므로 에러 발생
	 				
	 	ex]
	 		int a = 10; int b = 20;
	 			==> 한 줄로 입력했지만 두 개의 명령을 토큰으로
	 				구분해줬기 때문에 각각을 인식해서 컴파일 할 수 있다
	 				
	 	참고]
	 		; 대신 } 기호가 그 역할을 대신할 수 있다
	 		
	 		ex]
	 			if(조건식) {
	 			}	//	이 부분에서 토큰 발생

-------------------------------------------------------------------	 
	  키보드로 데이터를 입력받아서 사용하는 방법
		1. 클래스 구문 시작전에
			import java.util.*;
			로 java.util 패키지의 모든 클래스를 사용할 준비를 해둔다
			import java.util.Scanner;
			==> 이 방법은 java.util 패키지 내의 Scanner 클래스만 사용할 준비
			
		2. 프로그램에 들어가서
			
			Scanner sc = new Scanner(System.in);
			
			이라는 명령을 이용해서 키보드를 통해 입력 받을 도구를 준비한다
			
		3. 키보드를 통해서 입력받을 필요가 생겼을 때
		
			변수 = sc.nextXXX();
			명령을 이용해서 데이터를 입력받으면 된다
			
			이 때 XXX는 입력받을 데이터의 종류에 따라 달라지는데
			
			문자열	- sc.nextLine();
			정수		- sc.nextInt();
			실수		- sc.nextFloat();
			
		참고]
			정수형태의 문자열을 정수로 변환시키는 방법
			Integer.parseInt(숫자형 문자열);
	  
 */
	public static void main(String[] args) {
		// 숫자를 입력받아서 입력받은 수에서 50 뺀 수를 출력하세요
		
		// 1. 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 2. 메시지 출력
		System.out.print("정수를 입력하세요 : ");
		// 3. 입력받은 데이터를 문자열변수에 담는다
		String str = sc.nextLine();
		// 입력을 받은 후 필요없으면 닫아준다 ==> sc.close();
		// 4. 문자열 데이터를 정수로 변환한다
		int num = Integer.parseInt(str);
		// 5. 변환된 정수를 계산한다
		int result = num - 50;
		// 6. 계산 결과를 출력한다
		System.out.println("입력한 수 " + num + " 에서 50을 빼면"
				+ result + " 입니다");
		System.out.println("******************");
		one(sc);
		System.out.println("###################");
		sc.close();
	}
	
	public static void one(Scanner sc1) {
		System.out.print("반지름 입력 : ");
		String str1 = sc1.nextLine();
		sc1.close();
		double PI = 3.14;
		int r = Integer.parseInt(str1);
		System.out.println("둘레 : " + 2*r*PI);
		System.out.println("넓이 : " + r*r*PI);
		
	}	
}
