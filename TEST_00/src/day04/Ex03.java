package day04;

/*
 	문제 3]
 		2x + 4y = 10 의 방정식의 결과를 출력하세요
 		단, x와 y는 모두 0이상 10이하의 정수입니다
 */
public class Ex03 {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		
		
		for(int i=0; i<=10; i++) {	
			for(int j=0; j<=10; j++) {
				x = i;
				y = j;
				if(2*x + 4*y == 10) {
					System.out.println("x = " + x + ", y = " + y);
					
				}
				
			}
		}
		
		/*
		for(int i = 0; i < 11; i++) {
			
			for(int j = 0 ; j < 11 ; j++) {
				if(2*i + 4*j == 10) {
					System.out.println("x : " + i + " | y : " + j + " 일때 ");
					continue;
				}
			}
		}*/

	}

}
