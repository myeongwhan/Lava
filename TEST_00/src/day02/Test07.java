package day02;

public class Test07 {
/*
 	콘솔창에 출력하는 기능을 가진 함수
 		1. println(내용)	- 내용을 출력해준 후 줄바꿈해주는 함수
 		2. print(내용)	- 내용을 출력해주는 함수
 		3. printf(형식, 내용, 내용, ...) - 내용을 형식에 맞게 출력해주는 함수
 */
	public Test07() {
		System.out.println("##############");
		System.out.println("##############");
		
		System.out.print("##############");
		System.out.print("##############\n");
		System.out.println("\t**************");
		System.out.println("########\t######");
		
		System.out.println("---------------------------------");
		
		System.out.printf("-----%5d-----", 10); // 정수 10을 5자리로 출력
		System.out.printf("*****%5.2f*****%n", 3.141592); // 5자리, 소수 둘째자리로 출력
		System.out.printf("%5s",  "홍길동");
	}
	public static void main(String[] args) {
		new Test07();
	}
}
