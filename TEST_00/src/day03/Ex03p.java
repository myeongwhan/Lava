package day03;
/**
 * Ex03 풀이
 */
/*
 	문제 2]
 		전기 요금을 계산하는 프로그램을 작성하세요
 		
 				코드		기본요금	사용요금
 		가정용	(1)		3800	245
 		산업용	(2)		2400	157
 		교육용	(3)		2900	169
 		상업용	(4)		3200	174
 		
 		전기요금 = 기본요금 + 사용량 * 사용요금
 		
 		사용자코드와 사용량을 입력받아서 전기요금을 계산해주는 프로그램을 작성하세요
 */
import java.util.*;
public class Ex03p {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("코드입력 : ");
		int code = sc.nextInt();
		
		// 1 ~ 4 이외의 값이 입력되면 사용량 입력의 의미가 없으므로 즉시 종료시킴
		if(!(code >= 1 && code <= 4)) {
			System.out.println("잘못 입력, 즉시 종료");
			return;
		}
		System.out.print("사용량 입력 : ");
		int used = sc.nextInt();
		
		int calc = 0;
		String yongdo = "가정용";
		
		int gibon = 3800;
		int yogm = 245;
		
		if(code == 2) {
			yongdo = "산업용";
			gibon = 2400;
			yogm = 157;
		} else if(code == 3) {
			yongdo = "교육용";
			gibon = 2900;
			yogm = 169;
		} else if(code == 4) {
			yongdo = "상업용";
			gibon = 3200;
			yogm = 174;
		} 
		
		calc = gibon + used * yogm;
		
		System.out.println("***********************");
		System.out.println("사용자 코드: " + code +
							"\n용도 : " + yongdo +
							 "\n사용량 : " + used +
							  "\n전기요금 : " + calc);

	}

}
