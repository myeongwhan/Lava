package day03;
/**
 * day02 - Ex01 문제풀이
 */
/*
 	문제 5]
 		10 ~ 99 사이의 랜덤한 숫자를 발생시킨 후
 		그 숫자가 가까운 10의 배수의 차를 출력하는 프로그램을 작성하세요
 			예]
 			45는 50과의 차가 5가 난다
 			53은 50과의 차가 3이 난다
 */
public class Hw05 {
	
	public Hw05(){
		solv();		
	}
	
	public void solv() {
		// 랜덤숫자
		int num = (int)(Math.random()*(99 - 10 + 1)) + 10;
		// 가까운 10의 배수
		int nmj = num%10;
		int sip = (nmj >= 5) ? (num/10*10 + 10) : (num/10*10);
		// 나머지가 5보다 크거나 같은 경우는 sip에서 num을, 5보다 작으면 num에서 sip을 뺌
		int cha = (nmj >= 5) ? (sip - num) : (num - sip);
		
		System.out.println("랜덤숫자 : " + num + "\n 가까운 십의 배수 : " + sip
							+ "\n가까운 십의 배수와의 차 : " + cha
				);
	}
	public static void main(String[] args) {
		new Hw05();
	}
	
	public void abc() {
		System.out.println("************");
	}

}
