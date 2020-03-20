package day10;

/**
 * 이 클래스는 사각형의 가로와 세로, 그리고 넓이를 기억할 클래스
 * 
 * @author 	이명환
 * @since	2020.03.20
 * @version	v.1.0
 * @see
 */
public class Nemo {
	// 이 클래스는 가로와 세로, 그리고 넓이를 기억하고 있어야 되는 클래스이다.
	// 따라서 데이터를 기억할 변수를 만들어 준다.
	
	int width;	// 가로
	int height;	// 세로
	int area;	// 면적
	
	/* 	
	 	그런데 가로와 세로를 입력하면 각 변수에 데이터를 기억시키고 
	 	넓이도 계산해서 기억시켜주는 기능이 필요하다
	 	따라서 그 기능을 담당할 함수를 만들어준다
	*/
	public void setVal(int garo, int sero) {
		width = garo;
		height = sero;
		area = garo*sero;
	}
	
	public void toPrint() {
		System.out.printf("가로 : %3d,\n세로 : %3d,\n넓이 : %4d\n%10s\n", 
							width, height, area, "----------");
	}

}
