package day04;

/*
 	4자리 숫자로 된 년도를 입력받아서 윤년인지 평년인지 판단해서 출력하세요
 	단, switch ~ case 구문으로
 */
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도입력 : ");
		int year = sc.nextInt();
		String hae;
		int code = 0;
		
		if(year % 400 == 0) {
			code = 3;
		} else if(year % 100 ==0) {
			code = 2;
		} else if(year % 4 == 0) {
			code = 1;
		}
		
		// switch ~ case 조건처리
		switch(code) {
		case 3:
			hae = "윤년";
			break;
		case 2:
			hae = "평년";
			break;
		case 1:
			hae = "윤년";
			break;
		default:
			hae = "평년";
		}
		
		System.out.println(hae);

	}

}
