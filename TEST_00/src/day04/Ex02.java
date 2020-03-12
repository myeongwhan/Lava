package day04;

/*
 	문제 2]
 		두 개의 주사위를 던져서 합이 6이 되는 경우를 출력하세요
 */
public class Ex02 {

	public static void main(String[] args) {
		
		int no1 = 1;
		int no2 = 1;
		
		for(int i=1; i<=6; i++) {
			no1 = i;
			for(int j=1; j<=6; j++) {
				no2 = j;
				if(no1 + no2 == 6) {
					System.out.println(no1 + ", " + no2);
				}
			}
		}
	}
}
