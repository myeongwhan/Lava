package day04;

/*
 	while 명령
 	
 		for 명령문처럼 반복실행할 수 있는 명령문
 		for 명령문과의 차이점은 반복을 할 횟수를 지정하는 
 		카운터변수와 증감식이 명령문 내부에 없다는 것
 		
 		형식]
 			(1)
 			while(조건식 -(2)){
 				(3)
 			}
 			-(4)
 			순서: 1 -> 2 -> 3 -> 2 -> 3 -> ...(조건식이 false일 때까지)
 				-> (4)
 				
 */
public class Test05 {

	// 구구단 출력
	public static void main(String[] args) {
	
		int dan = 2;
		
		while(dan < 10) {
			System.out.println("----------------");
			int gop = 1;
			while(gop < 10) {
				System.out.println(dan + " x " + gop + " = " + (dan*gop));
				gop++;
			}
			dan++;
		}

	}

}
