package day11;

public class Dongl extends Dohyung {
	int rad;
	double arround;
	
	public Dongl() {
		this(1);
	}
	
	public Dongl(int rad) {
		this.rad = rad;
		setArround();
		setArea();
//		toPrint();
	}
	
	public void setArround() {
		arround = 2*3.14*rad;
	}
	
	public void setArea() {
		area = 3.14*rad*rad;
	}
	
	// 출력함수 - Dohyung의 toPrint() Overriding
	public void toPrint() {
		System.out.printf("반지름: %3d\n둘레: %5.2f\n넓이: %5.2f\n", 
							rad, arround, area);
	}

}
