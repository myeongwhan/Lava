package day03;
/**
 * day02 - Ex01 문제풀이
 */
/*
 	문제 4]
 		소수점이 있는 숫자를 입력한 후
 		소수점 이하 셋째 자리에서 반올림한 결과를 출력하세요
 		
 			원리]
 				+0.005를 하면 셋째 자리에서 변화가 일어날 것이고
 				여기에 x100 해주면 둘째 자리까지 정수부에 들어갈 것이고
 				이것을 정수로 바꾸면 원숫자의 셋째 자리 이하는 버릴 것이고
 				다시 /100 해주면 원 소수점 형태로 변환될 것이다
 */
import java.util.*;
public class Hw04 {

	public Hw04() {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수를 입력하세요 : ");
		double num = sc.nextDouble();
		// 함수 변수데이터 넘겨주면서 실행하고 데이터 받기
		double result = banolim(num);
		System.out.println("입력받은 실수 : " + num + "\n반올림한 실수 : " + result);
	}
	
	// 실수를 소수 둘째 자리에서 반올림해주는 함수
	public double banolim(double no){
		// 반환값 담을 변수 만들기
		double result = 0.;
		// 입력받은 데이터 반올림(소수 셋째 자리)
		int no1 = (int)(no * 1000);		//==>	123456
		no1 += 5;						//==>	123461
		result = (no1 / 10) / 100.;		//==>	123.46
		// 데이터 반환
		return result;
	}
	public static void main(String[] args) {
		new Hw04();
	}

}
