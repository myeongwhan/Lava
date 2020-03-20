package day10;

public class One {
	double ban;	// 반지름
	double pi = 3.14;	// 파이
	double dul;	// 둘레
	double nul;	// 넓이
	
	
	public void setVal(double ji, double pa2) {
		ban = ji;
		pi = pa2;
		dul = 2*pa2*ji;
		nul = pa2*ji*ji;
	}

}
