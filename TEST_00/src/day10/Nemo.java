package day10;

/**
 * �� Ŭ������ �簢���� ���ο� ����, �׸��� ���̸� ����� Ŭ����
 * 
 * @author 	�̸�ȯ
 * @since	2020.03.20
 * @version	v.1.0
 * @see
 */
public class Nemo {
	// �� Ŭ������ ���ο� ����, �׸��� ���̸� ����ϰ� �־�� �Ǵ� Ŭ�����̴�.
	// ���� �����͸� ����� ������ ����� �ش�.
	
	int width;	// ����
	int height;	// ����
	int area;	// ����
	
	/* 	
	 	�׷��� ���ο� ���θ� �Է��ϸ� �� ������ �����͸� ����Ű�� 
	 	���̵� ����ؼ� �������ִ� ����� �ʿ��ϴ�
	 	���� �� ����� ����� �Լ��� ������ش�
	*/
	public void setVal(int garo, int sero) {
		width = garo;
		height = sero;
		area = garo*sero;
	}
	
	public void toPrint() {
		System.out.printf("���� : %3d,\n���� : %3d,\n���� : %4d\n%10s\n", 
							width, height, area, "----------");
	}

}
