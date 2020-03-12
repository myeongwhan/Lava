package day04;

/*
 	두 사람이 등산을 하는데, 한 사람은 이제 등산을 0.54m/s 시작하고
 	다른 사람은 정상에서 1.07m/s 내려오기 시작했다
 	
 	산의 높이가 7564m라고 가정하고
 	두 사람이 만나는 시간은 몇 분 몇 초 후인지와 높이를 출력해주는 프로그램을 작성하세요
 */
public class Hw04 {

	public static void main(String[] args) {
		double p1 = 0.54;
		double p2 = 1.07;
		
		int mount = 7564;
		double ex1 = 7564/p1;
		double ex2 = 7564/p2;
		
		ti:
		for(int j = mount; p2*j >= 0;j--) {
			for(int i = 1; p1*i <= mount;i++) {
				if(p2*j == p1*i) {
					break ti;
				}
			}
			System.out.println("초: " + j);
		}

	}

}
