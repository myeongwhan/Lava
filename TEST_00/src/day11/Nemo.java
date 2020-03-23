package day11;

public class Nemo extends Dohyung {
	int garo;
	int sero;
	
	public Nemo() {
		this(1,2);
	}
	
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
//		toPrint();
	}
	
	public void setArea() {
		area = garo*sero;
	}
	
	// 출력함수 - Dohyung의 toPrint() Overriding
	public void toPrint() {
		System.out.printf("가로: %3d\n세로: %3d\n넓이: %3.1f\n", 
							garo, sero, area);
	}

}
