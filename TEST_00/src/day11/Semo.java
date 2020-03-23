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
	
	// 출력함수 - Dohyung의 toPrint() Overriding
	public void toPrint() {
		System.out.printf("밑변: %3d\n높이: %3d\n넓이: %4.2f\n", 
							mitbyun, nopi, area);
	}

}
