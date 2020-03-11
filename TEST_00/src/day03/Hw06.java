package day03;
/**
 * day02 - Ex01 문제풀이
 */
/*
 	문제 6]
		임의의 년도를 입력받아서
		해당 년도가 윤년인지 평년인지 판별해서 출력해주는 프로그램을 작성하세요
		단, 삼항연산자를 사용해서 처리하세요
			윤년의 정의]
				4로 나누어 떨어지고 100으로 나누어 떨어지지 않으며,
				400으로 나누어 떨어지는 해를 윤년이라 한다
 */
import java.util.*;
public class Hw06 {
	public Hw06() {
		solv();
	}
	
	// 윤년 판별하는 함수
	public void solv() {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		String result = (year % 4 != 0) ? ("평년") : 
							(year % 100 != 0) ? ("윤년") :(
							(year % 400 == 0) ? "윤년":"평년"
							);
		
		System.out.println("입력한 해 [" + year + "] 는 [" + result +"] 입니다");
	}
	public static void main(String[] args) {
		new Hw06();
	}

}
