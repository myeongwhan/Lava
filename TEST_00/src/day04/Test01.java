package day04;

/*
 	4자리 숫자로 된 년도를 입력받아서 그 해가 윤년인지 아닌지 판별하세요
 */
import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		// 0. 필요한 변수 선언
		Scanner sc;
		int year;
		String hae = "평년";
		
		// 1. 입력받을 준비
		sc = new Scanner(System.in);
		// 2. 메시지 출력
		System.out.print("년도입력 : ");
		// 3. 년도 꺼내서 변수에 담기
		year = sc.nextInt();
		// 조건처리해서 판단
		if(year % 400 == 0) {
			// 400으로 나누어 떨어지는 수
			// 이 블럭이 실행되면 전체 조건문 자체를 종료함
			hae = "윤년";
		} /*else if(year % 100 == 0) {
			// 400으로 나누어 떨어지지 않는 수 중에 100으로 나누어 떨어지는 수
			hae = "평년";
		}*/ else if(year % 4 == 0) {
			// 400과 100 둘다 나누어 떨어지지 않는 수 중에 4로 나누어 떨어지는 수
			hae = "윤년";
		} /*else {
			hae = "평년";
		}*/
		
		System.out.println("입력한 해 [" + year + "] 는 [ " + hae + " ] 입니다");
	}

}
