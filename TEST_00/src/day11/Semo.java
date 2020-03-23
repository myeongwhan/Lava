package day11;

public class Semo extends Dohyung {
	int mitbyun;
	int nopi;
	
	public Semo() {
		this(1,2);
	}
	
	public Semo(int mit, int nop) {
		mitbyun = mit;
		nopi = nop;
		setArea();
//		toPrint();
	}
	
	public void setArea() {
		area = mitbyun*nopi/2;
	}
	
	// ����Լ� - Dohyung�� toPrint() Overriding
	public void toPrint() {
		System.out.printf("�غ�: %3d\n����: %3d\n����: %4.2f\n", 
							mitbyun, nopi, area);
	}

}
