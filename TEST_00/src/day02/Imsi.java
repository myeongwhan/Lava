/*package day02;

import java.util.*;
public class Test01 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// 숫자를 입력받아서 입력받은 수에서 50 뺀 수를 출력하세요
		
		// 1. 입력받을 준비
		
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
		one();
		System.out.println("###################");
	}
	
	public void one() {
		System.out.print("반지름 입력 : ");
		String str1 = sc.nextLine();
		sc.close();
		double PI = 3.14;
		int r = Integer.parseInt(str1);
		System.out.println("둘레 : " + 2*r*PI);
		System.out.println("넓이 : " + r*r*PI);
		
	}
	
	public static void square(Scanner sc2) {
		System.out.print("가로 : ");
		String str2 = sc2.nextLine();
		sc2.
		
	}
	
}
*/