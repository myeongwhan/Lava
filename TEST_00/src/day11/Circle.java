package day11;

/*
 	 문제 1]
 		이 클래스는 원의 정보를 저장할 클래스이다
 		이 클래스가 객체가 될 때 반지름을 입력받아서 원의 대한 정보가
 		입력이 되게 클래스를 정의하세요
 		
 		반지름이 입력이 안 될 경우는 10으로 입력되게 하세요
 */
public class Circle {
	int rad;
	double arround, area;
	
	public Circle() {	// 기본 생성자 함수
		this(10);
	}
	
	public Circle(int rad) {	// 생성자함수 오버로딩
		this.rad = rad;
		this.arround = getArround(rad);
		this.area = getArea(rad);
	}
	
	// 원의 둘레
	public double getArround(int rad) {
		return 2*3.14*rad;
	}
	
	// 원의 넓이
	public double getArea(int rad) {
		return 3.14*rad*rad;
	}
	
	// 출력
	public void toPrint() {
		System.out.printf("반지름: %5d | 둘레: %7.2f | 넓이: %7.2f\n", 
							rad, arround, area);
	}

}
