package day04;

/*	(중첩된 반복문으로 처리)
 	2 ~ 100 까지의 수 중 소수만 출력해주는 프로그램을 작성하세요
 	
 	소수: 1과 자기자신으로만 나눌 수 있는 수
 */
public class Hw03 {

	public static void main(String[] args) {
		
		t1:
		for(int i=2; i<=100; i++) {
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					continue t1;
				} 
			}
			System.out.println(i);
		}

	}

}
