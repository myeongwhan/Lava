package day14;

public class DonglTest {
	
	public DonglTest() {
		// Dongl ��ü �� ���� ����� ���غ���
		Dongl d1 = new Dongl(5);
		Dongl d2 = new Dongl(5);
		
		System.out.println("d1.area: " + d1.getArea());
		System.out.println("d2.area: " + d2.getArea());
		
		// �� ���� ������ ���غ���
		System.out.println("d1�� d2�� " + 
							((d1.equals(d2))?("���� ��"):("�ٸ� ��")));
	}

	public static void main(String[] args) {
		new DonglTest();
	}

}