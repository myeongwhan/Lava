package day10;

/*
 	Nemo Ŭ������ 5�� ������ �迭�� �����
 	���� ���δ�  1 ~ 29 ���� �����ϰ� ���� �迭�� �ϼ�����
 	
 	�׸��� �� �׸��� ����, ����, ���̸� ����غ���
 */
public class Test03 {
	// Nemo �迭������ ������
	Nemo[] nemo;
	
	// Nemo �ʱ�ȭ �Լ�
	public void setNemo() {
		// �迭 �ʱ�ȭ
		nemo = new Nemo[5];
		for(int i=0; i<nemo.length; i++) {
			// �ݺ����� �� �� �ݺ��� ������ NemoŬ������ �ν��Ͻ��� ����
			// �� �濡 �־���� �Ѵ�
			nemo[i] = new Nemo();
			
			/*
			Nemo �ν��Ͻ��� ������µ� ���� ����, ����, ���̴� �ʱ�ȭ���� �ʾҴ�
			 ���� ���� ���� ���� ���̴� 0���� ������ �Ǿ��ִ�
			 ���� ���� ���� ���̸� �������ش�. �츮�� �װ��� ����� ����� �����Ƿ�
			 �� ����� ����غ���
			*/
			// ���� �� ���� �����
			int garo = (int)(Math.random()*(29-1+1)+1);
			int sero = (int)(Math.random()*(29-1+1)+1);
			nemo[i].setVal(garo, sero);
		}
	}

	public static void main(String[] args) {
		Test03 t = new Test03();	// ���� ������� nemo�� ���õǾ����� �ʴ�
		Test03 t1 = new Test03();	// ���� ������� nemo�� ���õǾ����� �ʴ�
		t.setNemo();	// nemo�� �������ش�
		
		// ������ش�. �츮�� ��������� ������ ������ִ� �Լ��� ����� �����Ƿ�
		// �װ��� ȣ������
		for(int i=0; i<t.nemo.length; i++) {
			t.nemo[i].toPrint();
		}
		System.out.println();
		System.out.println("##########");
		
		// t1�� ������ ����Ѵ�
//		for(int i=0; i<t1.nemo.length; i++) {
//			t1.nemo[i].toPrint();
//		}
		//	==> t1�� nemo�� ���� null�� ���·� ����

	}

}
