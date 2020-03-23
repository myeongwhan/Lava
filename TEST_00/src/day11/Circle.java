package day11;

/*
 	 ���� 1]
 		�� Ŭ������ ���� ������ ������ Ŭ�����̴�
 		�� Ŭ������ ��ü�� �� �� �������� �Է¹޾Ƽ� ���� ���� ������
 		�Է��� �ǰ� Ŭ������ �����ϼ���
 		
 		�������� �Է��� �� �� ���� 10���� �Էµǰ� �ϼ���
 */
public class Circle {
	int rad;
	double arround, area;
	
	public Circle() {	// �⺻ ������ �Լ�
		this(10);
	}
	
	public Circle(int rad) {	// �������Լ� �����ε�
		this.rad = rad;
		this.arround = getArround(rad);
		this.area = getArea(rad);
	}
	
	// ���� �ѷ�
	public double getArround(int rad) {
		return 2*3.14*rad;
	}
	
	// ���� ����
	public double getArea(int rad) {
		return 3.14*rad*rad;
	}
	
	// ���
	public void toPrint() {
		System.out.printf("������: %5d | �ѷ�: %7.2f | ����: %7.2f\n", 
							rad, arround, area);
	}

}
