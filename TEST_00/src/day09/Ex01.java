package day09;

/*
 	문제 1]
	반지름을 랜덤하게 발생해서 그 반지름을 입력하면,
	원의 넓이를 구해주는 함수와 원의 둘레를 구해주는 함수를 제작하고
	실행해서 출력하세요
 */
public class Ex01 {
	// 반지름: 1~100, 파이:3.14
	double r = (int)(Math.random()*(100-1+1)+1);
	
	public Ex01() {
		System.out.println("둘레 : " + dul(r));
		System.out.println("넓이 : " + nul(r));
	}
	
	public double dul(double a) {
		double result = 2*a*3.14;
		return result;
	}
	
	public double nul(double a) {
		double result = a*a*3.14;
		return result;
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
