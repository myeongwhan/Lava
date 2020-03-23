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
	
	// ����Լ� - Dohyung�� toPrint() Overriding
	public void toPrint() {
		System.out.printf("����: %3d\n����: %3d\n����: %3.1f\n", 
							garo, sero, area);
	}

}
