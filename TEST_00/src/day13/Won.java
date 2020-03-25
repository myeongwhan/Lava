package day13;

public class Won extends Figure {
	int rad;

	@Override
	public double calcArea(int... a) {
		rad = a[0];
		return 3.14*rad*rad;
	}

}
