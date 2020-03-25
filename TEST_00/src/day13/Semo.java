package day13;

public class Semo extends Figure {
	int mit;
	int nop;

	@Override
	public double calcArea(int... a) {
		mit = a[0];
		nop = a[1];
		return mit*nop*0.5;
	}

}
