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
	
	// ����Լ� - Dohyung�� toPrint() Overriding
	public void toPrint() {
		System.out.printf("������: %3d\n�ѷ�: %5.2f\n����: %5.2f\n", 
							rad, arround, area);
	}

}
