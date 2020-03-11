package day03;
/**
 * day02 - Ex01 문제풀이
 */

import java.util.*;
public class Hw01 {

/*
 	조건 명령문
 		: 조건을 주고 조건이 맞는 경우와 맞지 않는 경우를 구분해서 처리해주는 명령문
 		
 		종류]
 			1. if
 				==> 조건을 제시하고 그 조건에 맞는 경우에만 처리하는 조건문
 				형식]
 					if(조건식){
 						실행문...
 					}
 					==> 조건식이 맞는 경우에만 실행문을 실행하고
 						맞지 않는 경우에는 조건문을 건너뜀
 						
 			2. if ~ else
 				==> 조건을 제시하고 그 조건에 맞는 경우와 맞지 않는 경우 두 가지를 처리하는 조건문
 				형식]
 					if(조건식){
 						실행문1
 					} else {
 						실행문2
 					}
 					==> 조건식이 맞는경우 실행문1을 실행, 맞지 않는 경우 실행문2를 실행
 					
 			3. if ~ else if ~ else
 				==> 두 개 이상의 조건을 제시하고 각 조건에 맞는 경우를 처리하는 조건문
 				형식]
 					if(조건식1){
 						실행문1
 					} else if(조건식2){
 						실행문2
 					} else if(조건식3){
 						실행문3
 					}
 					...{
 						...
 					} else {
 						실행문n
 					}
 					==> 여러 개의 조건식을 제시해서 그 조건문에 맞는 실행문을 실행
 					
 			4. switch ~ case
 				==> 조건을 처리하는데 데이터를 여러 개를 제시하고
 					그 데이터에 맞는 경우 처리해주는 방법
 				형식]
 					switch(변수){
 					case 데이터1:
 						실행문1;
 						break;
 					case 데이터2:
 						실행문2;
 						break;
 					case 데이터3:
 						실행문3;
 						break;
 					...
 					
 					default:
 						실행문n;
 					}
 					==> 변수의 값이 일치하는 case 문의 실행문을 실행
 */
	
/*
 	문제 1]
 		3자리로 구성된 숫자 하나를 입력받은 후 또는 랜덤하게 만든 후
 		백자리 이하를 버린 숫자를 만들어서 출력하세요
 			예]
 			456 --> 400
 */
	public Hw01() {
		Scanner sc = new Scanner(System.in);
		System.out.print
		("### 입력받아 처리할 경우 1, 랜덤하게 만들어서 처리할 경우 2를 입력하세요 : ");
		int num = sc.nextInt();
		if(num == 1) {
			iFloor(sc);
		} else {
			rFloor();
		}


	}
	
	// 입력받아서 처리하는 함수
	public void iFloor(Scanner sc) {
		System.out.print("세 자리 정수를 입력하세요 : ");
		int no = sc.nextInt();
		
		System.out.print("입력한 수 : " + no);
		// 십의 자리 이하 버리기
		// 첫 번째 방법
		no = no / 100 * 100;
		System.out.println(" , 십의 자리에서 버린 수 : " + no);
	}
	
	// 랜덤하게 만든 후 처리하는 방법
	public void rFloor() {
		// 랜덤숫자만들기
		int no = (int)(Math.random()*(999 - 100 + 1)) + 100;
		System.out.print("랜덤숫자 : " + no);
		// 두 번째 방법
		no = no - (no % 100);
		System.out.println(" , 십의 자리에서 버린 수 : " + no);
		
	}
	public static void main(String[] args) {
		new Hw01();
	}
}
