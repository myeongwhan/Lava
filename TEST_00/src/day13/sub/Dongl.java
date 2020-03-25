package day13.sub;

public class Dongl implements Moyang {
	private int rad;
	private double area;
	
	public Dongl() {
		
	}
	public Dongl(int rad) {
		this.rad = rad;
		setArea();
	}
	@Override
	public void setArea() {
		area = rad*rad*3.14;
	}

	@Override
	public void toPrint() {
		System.out.printf("원 반지름: %3d, 넓이: %5.2f", rad, area);
	}

}
