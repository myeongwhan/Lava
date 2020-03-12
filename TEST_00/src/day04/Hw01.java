package day04;

/*
 	두 수를 입력받은 후, 두 수의 최대공약수를 구해서 출력해주는 프로그램을 작성하세요
 	
 	최대공약수: 두 수를 나눌 수 있는 가장 큰 수
 */
import java.util.*;
public class Hw01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수 입력: ");
		int no1 = sc.nextInt();
		System.out.print("두 번째 수 입력: ");
		int no2 = sc.nextInt();
		
		// 두 수 중 작은 수 찾기
		int val = (no2 > no1)? no1 : no2;
		
		for(int i=val; i>=1 ;i--) {
			if(no1%i==0 && no2%i==0) {	// ==> i 는 no1과 no2를 나눌 수 있는 수
				System.out.println("최대공약수 : " + val);
				break;
			}
			
		}
		
		
	}

}
