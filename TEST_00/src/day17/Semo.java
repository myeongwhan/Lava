package day17;

public class Semo {
	private int mit, nop;
	private double area;

	public Semo() {}
	public Semo(int mit, int nop) {
		this.mit = mit;
		this.nop = nop;
		setArea();
	}

	public int getMit() {
		return mit;
	}

	public void setMit(int mit) {
		this.mit = mit;
	}

	public int getNop() {
		return nop;
	}

	public void setNop(int nop) {
		this.nop = nop;
	}

	public double getArea() {
		return area;
	}

	public void setArea() {
		this.area = mit * nop * 0.5;
	}
	public void setArea(double area) {
		this.area = area;
	}
	

}
