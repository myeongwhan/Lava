package day10;

/*
 	���� 1]
	���� ������, �ѷ�, ���̸� ������ Ŭ������ �����
	�� Ŭ���� ��ü 10���� �迭�� ������ �迭�� ����
	�� ����� �ʱ�ȭ�ϰ� ����ϼ���
 */
public class Ex01 {
	One[] Ex01;
	
	public void setEx01() {
		Ex01 = new One[10];
		for(int i=0; i<Ex01.length; i++) {
			Ex01[i] = new One();
			double ji = (int)(Math.random()*(40-20+1)+20);
			double pa2 = 3.14;
			Ex01[i].setVal(ji, pa2);
		}
	}
	// ������: 20~40

	public static void main(String[] args) {
		Ex01 ex = new Ex01();
		ex.setEx01();
		
		for(int i=0; i<ex.Ex01.length; i++) {
			System.out.println(ex.Ex01[i].ban + " | " 
							+ ex.Ex01[i].dul + " | " + ex.Ex01[i].nul);
		}

	}

}
