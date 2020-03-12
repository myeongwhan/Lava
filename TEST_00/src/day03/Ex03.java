package day03;

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
public class Ex03 {
	
	public Ex03(){
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자코드 : ");
		int code = sc.nextInt();
		System.out.print("사용량 : ");
		int time = sc.nextInt();
		
		int one = 3800;
		int two = 2400;
		int three = 2900;
		int four = 3200;
		
		int uone = 245;
		int utwo = 157;
		int uthree = 169;
		int ufour = 174;
		
		if(code == 1) {
			System.out.println("요금 : " + ((int)one + time*uone));
		} else if(code == 2) {
			System.out.println("요금 : " + ((int)two + time*utwo));
		} else if(code == 3) {
			System.out.println("요금 : " + ((int)three + time*uthree));
		} else if(code == 4) {
			System.out.println("요금 : " + ((int)four + time*ufour));
		} else {
			System.out.println("잘못입력");
		}
		
	}

	public static void main(String[] args) {
		new Ex03();

	}

}
