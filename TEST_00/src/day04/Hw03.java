package day04;

/*	(중첩된 반복문으로 처리)
 	2 ~ 100 까지의 수 중 소수만 출력해주는 프로그램을 작성하세요
 	
 	소수: 1과 자기자신으로만 나눌 수 있는 수
 	
 	comm ]
 		위 문제의 결과로 찾아낸 소수의 개수를 맨 마지막에 출력하세요
 */
public class Hw03 {

	public static void main(String[] args) {
		
		int count = 0;
		
		t1:
		for(int i=2; i<=100; i++) {
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					count += 1;
					continue t1;
				} 
			}
			String mk = ", ";
			if(i == 2) {
				mk = "";
			}
			System.out.println(mk +i);
		}

		System.out.println();
		System.out.println("개수 : " + (99 - count));
	}

}
