package day14;

public class Dongl {
	private int rad;
	private double arround, area;
	
	public Dongl(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	
	// �ѷ� �����ִ� �Լ�
	public void setArround() {
		arround = 2*3.14*rad;
	}
	
	// ���� �����ִ� �Լ�
	public void setArea() {
		area = 3.14*rad*rad;
	}
	
	// area�� ���������ڰ� private �̰� �̰��� Ŭ������������ ������ �����ϹǷ�
	// �Լ��� ���� �����͸� ��ȯ���ֵ��� ����
	public double getArea() {
		return area;
	}
	
	// ���� ������ ������ ���� ������ �Ǵܵǵ��� equals �Լ��� �������̵��غ���
	public boolean equals(Object obj) {
		// ��ȯ�� ���� ���� ���� �� �ʱ�ȭ
		boolean bool = false;
		
		// �ԷµǴ� Dongl �ν��Ͻ��� ObjectŸ������ �ڵ�����ȯ�Ǿ� ����� �� ���̹Ƿ�
		// DonglŸ������ ��������ȯ�� ���Ѽ� ����� ����ؾ߰ڴ�
		Dongl d1 = (Dongl) obj;
		
		// Ÿ���� ��ȯ�� �ư� ���� ������ ������ ���غ���
		// �񱳴� ����� �� ���� �ʿ��ѵ� �ϳ��� �Ű������� �Է¹޾Ҵ�.
//		bool = (this.area == d1.area) ? true : false;
		
		// ��� ��ȯ
		return (this.area == d1.area);
	}
	
}
