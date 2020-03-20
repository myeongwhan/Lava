package day10;

/**
 * �� Ŭ������ �л� �� ���� �̸�, ����, ����, ����,����, �ڵ� ������ ������ �뵵�� Ŭ����
 * @author �̸�ȯ
 *
 */
public class Stud {
	// ������� ����
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
	
	// ���� ���ϴ� �Լ�
	public int getSum() {
		return kor+eng+math+phys+cod;
	}
	
	public double getAvg() {
		return getSum()/5.;
	}
	
	public void toPrint() {
		System.out.printf("%5s : %5s\n", "�� ��", name);
		System.out.printf("%5s : %5d\n", "�� ��", kor);
		System.out.printf("%5s : %5d\n", "�� ��", eng);
		System.out.printf("%5s : %5d\n", "�� ��", math);
		System.out.printf("%5s : %5d\n", "�� ��", phys);
		System.out.printf("%5s : %5d\n", "�� ��", cod);
		System.out.printf("%5s : %5d\n", "�� ��", getSum());
		System.out.printf("%5s : %5.2f\n", "�� ��", getAvg());
		for(int i=0; i<13; i++) System.out.print("-");
		System.out.println();
	}

}
