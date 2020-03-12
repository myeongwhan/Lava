package day04;

/*
 	do ~ while 명령
 		: for와 while 명령은 선조건처리 명령이고 조건에 따라서 한 번도 실행이 안 될 수 있지만,
 			do ~ while 명령은 후조건처리 명령이고 조건에 관계없이
 			무조건 한 번 이상 실행을 한다
 			
 		형식]
 			(1)
 			do{
 				(2)
 			} while(조건식 -(3));
 			-(4)
 			순서: 1 -> 2-> 3-> 2 -> 3 -> ...(조건식이 false일 때까지)
 				-> 4
 */
public class Test06 {

	public static void main(String[] args) {
		int no = 10; // while조건에 맞지 않아도 do를 한 번 읽음
		
		do {
			System.out.println("no : " +no);
		} while(no++ < 10);

	}

}
