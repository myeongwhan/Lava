package day09;

/*
 	���� 1]
	�������� �����ϰ� �߻��ؼ� �� �������� �Է��ϸ�,
	���� ���̸� �����ִ� �Լ��� ���� �ѷ��� �����ִ� �Լ��� �����ϰ�
	�����ؼ� ����ϼ���
 */
public class Ex01 {
	// ������: 1~100, ����:3.14
	double r = (int)(Math.random()*(100-1+1)+1);
	
	public Ex01() {
		System.out.println("�ѷ� : " + dul(r));
		System.out.println("���� : " + nul(r));
	}
	
	public double dul(double a) {
		double result = 2*a*3.14;
		return result;
	}
	
	public double nul(double a) {
		double result = a*a*3.14;
		return result;
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
