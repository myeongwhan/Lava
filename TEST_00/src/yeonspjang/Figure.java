package yeonspjang;

/*
 	���� 3]
	Figure Ŭ������ �����ϰ�
	��ӹ޾Ƽ� �ﰢ��, �簢��, ���� Ŭ������ ������ ��
	1 ~ 3 ������ ������ �����ϰ� 10�� ����
	1�� ��� �ﰢ��
	2�� ��� �簢��
	3�� ��� ��
	�� �迭�� �־	����ϼ���
 */
public class Figure {
	int garo;
	int sero;
	int rad;
	int random = (int)(Math.random()*10+1);
	final double PI = 3.14;
	
	public Figure() {
		setGaro(random);
		setSero(random);
		setRad(random);
	}
	
	public int getGaro() {
		return garo;
	}
	public void setGaro(int garo) {
		this.garo = garo;
	}
	public int getSero() {
		return sero;
	}
	public void setSero(int sero) {
		this.sero = sero;
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	
	
}
