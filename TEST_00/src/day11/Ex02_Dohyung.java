package day11;

public class Ex02_Dohyung {
//	public Ex02_Dohyung() {
//		new Dongl();
//		System.out.println();
//		new Nemo();
//		System.out.println();
//		new Semo();
//	}

	public static void main(String[] args) {
		Dohyung[] d1 = new Dohyung[3];
		d1[0] = new Dongl(10);
		d1[1] = new Semo(5, 10);
		d1[2] = new Nemo(2, 5);
		
		for(int i=0; i<d1.length; i++) {
			d1[i].toPrint();
		}
		
//		new Ex02_Dohyung();

	}

}
