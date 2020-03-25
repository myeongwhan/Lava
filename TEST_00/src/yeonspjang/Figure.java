package yeonspjang;

/*
 	문제 3]
	Figure 클래스를 정의하고
	상속받아서 삼각형, 사각형, 원의 클래스를 정의한 후
	1 ~ 3 까지의 정수를 랜덤하게 10개 만들어서
	1의 경우 삼각형
	2의 경우 사각형
	3의 경우 원
	을 배열에 넣어서	출력하세요
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
