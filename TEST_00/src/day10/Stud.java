package day10;

/**
 * 이 클래스는 학생 한 명의 이름, 국어, 영어, 수학,물리, 코딩 정수를 저장할 용도의 클래스
 * @author 이명환
 *
 */
public class Stud {
	// 멤버변수 선언
	String name;
	int kor, eng, math, phys, cod;
	
	public Stud() {}
	public Stud(String name) {
		this.name = name;
		this.kor = (int)(Math.random()*41+60);
		this.eng = (int)(Math.random()*41+60);
		this.math = (int)(Math.random()*41+60);
		this.phys = (int)(Math.random()*41+60);
		this.cod = (int)(Math.random()*41+60);
	}
	
	// 총점 구하는 함수
	public int getSum() {
		return kor+eng+math+phys+cod;
	}
	
	public double getAvg() {
		return getSum()/5.;
	}
	
	public void toPrint() {
		System.out.printf("%5s : %5s\n", "이 름", name);
		System.out.printf("%5s : %5d\n", "국 어", kor);
		System.out.printf("%5s : %5d\n", "영 어", eng);
		System.out.printf("%5s : %5d\n", "수 학", math);
		System.out.printf("%5s : %5d\n", "물 리", phys);
		System.out.printf("%5s : %5d\n", "코 딩", cod);
		System.out.printf("%5s : %5d\n", "총 점", getSum());
		System.out.printf("%5s : %5.2f\n", "평 균", getAvg());
		for(int i=0; i<13; i++) System.out.print("-");
		System.out.println();
	}

}
