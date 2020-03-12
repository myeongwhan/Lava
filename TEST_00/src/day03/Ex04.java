package day03;

/*
 	문제 3]
 		부서번호를 입력하면 부서이름을 출력해주는 프로그램을 작성하세요
 			10 - 총무부
 			20 - 회계부
 			30 - 영업부
 			40 - 기술부
 			기타 - 다음기회에
 */
import java.util.*;
public class Ex04 {
	
	public Ex04() {
		Scanner sc = new Scanner(System.in);
		System.out.print("부서번호 입력 : ");
		int dno = sc.nextInt();
		
		String cho = "총무부";
		String hwo = "회계부";
		String yeo = "영업부";
		String gi = "기술부";
		
		if(dno == 10) {
			System.out.println("부서이름 : " + cho);
		} else if(dno == 20) {
			System.out.println("부서이름 : " + hwo);
		} else if(dno == 30) {
			System.out.println("부서이름 : " + yeo);
		} else if(dno == 40) {
			System.out.println("부서이름 : " + gi);
		} else {
			System.out.println("다음기회에");
		}
	}

	public static void main(String[] args) {
		new Ex04();

	}

}
