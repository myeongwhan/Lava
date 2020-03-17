package day04;

/*
 	반복문을 사용해서 다음 모양을 출력하세요
 	
 		1.
 			*
 			**
 			***
 			****
 			*****
 		
 		2.	    *
 			   **
 			  ***
 			 ****
 			*****
 			
 		3.	*****
 			****
 			***
 			**
 			*
 		
 		4.	*****
 			 ****
 			  ***
 			   **
 			    *
 			    
 		5.		*
 			   ***
 			  *****
 			 *******
 			*********
 			 *******
 			  *****
 			   ***
 			    *
 		
 		7-0.
 				12345
 				12345
 				12345
 				12345
 		
 		7-1.
 				1 2 3 4 5
 				6 7 8 9 10
 				11 12 13 14 15
 				16 17 18 19 20
 				21 22 23 242 5
 				
 		7.	1
 			12
 			123
 			1234
 			12345
 			
 		8.		1
 			   12
 			  123
 			 1234
 			12345
 		
 		9.	12345
 			1234
 			123
 			12
 			1
 			
 		10.	1
 			2  3
 			4  5  6
 			7  8  9  10
 			11 12 13 14 15
 		
 */
public class Hw99 {

	public static void main(String[] args) {
		
		
		// 1.
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				if(j <= i) {
				System.out.print("*");
				}
			}
			System.out.println();
		}
		
		// 2.
		for(int i = 0; i<6; i++) {
			for(int j = 5; j>0; j--) {
				if(j <= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");					
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 3.
		for(int i = 5; i>0; i--) {
			for(int j = 0; j<5; j++) {
				if(j < i) {
					System.out.print("*");
				} else {
					System.out.print(" ");					
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 4.
		for(int i = 5; i>=0; i--) {
			for(int j=5; j>=0; j--) {
				if(j<i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// 5.
		for(int i=5; i>0; i--) {
			for(int j=0; j<10; j++) {
				
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 7-0.
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		
		System.out.println();
		
		// 0.
		for(int i = 1; i<6; i++) {
			for(int j = 1; j<6; j++) {
				System.out.print(i);
			}
			System.out.println();
		} 
		
		System.out.println();
		
		for(int i = 1; i<6; i++) {
			for(int j = 5; j>0; j--) {
				if(j <= i) {
					System.out.print(i+1);
				} else {
					System.out.print(i);					
				}
			}
			System.out.println();
		}
		
		System.out.println();
		// 14.
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
				System.out.print(i+(j-1)*5 + " ");
			}
			System.out.println();
		}
		
	}

}
