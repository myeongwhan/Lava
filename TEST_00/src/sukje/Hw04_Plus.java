package sukje;

public class Hw04_Plus implements Hw04_Calc{

	public Hw04_Plus() {
		int no1 = 1;
		int no2 = 2;
		
		System.out.println(cal(no1, no2));
	}

	@Override
	public double cal(int no1, int no2) {
		return no1 + no2;
	}

	public static void main(String[] args) {
		new Hw04_Plus();
	}

}
