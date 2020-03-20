package day10;

/*
 	문제 1]
	원의 반지름, 둘레, 넓이를 저장할 클래스를 만들고
	그 클래스 객체 10개를 배열로 관리할 배열을 만들어서
	각 멤버를 초기화하고 출력하세요
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
	// 반지름: 20~40

	public static void main(String[] args) {
		Ex01 ex = new Ex01();
		ex.setEx01();
		
		for(int i=0; i<ex.Ex01.length; i++) {
			System.out.println(ex.Ex01[i].ban + " | " 
							+ ex.Ex01[i].dul + " | " + ex.Ex01[i].nul);
		}

	}

}
