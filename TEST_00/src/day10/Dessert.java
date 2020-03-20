package day10;

/*
 	디저트]
	최근 5년 동안의 기온을 배열에 담아서 관리하려고 한다
		int[][] gion = new int[5][2];
	로 만들고
	첫 번째 방에는 기온을 -20 ~ 40까지 랜덤하게 임렵하고
	두 번째 방에는 순위를 1 ~ 5까지 인덱스증가값으로 체워넣으세요
 */
import java.util.Arrays;

public class Dessert {

	public static void main(String[] args) {
		int[][] gion = new int[5][2];
		for(int i=0; i<gion.length; i++) {
			gion[i][0] = (int)(Math.random()*61-20);
//			gion[i][1] = i+1;
		}
		
		for(int[] g : gion) {
			System.out.println(Arrays.toString(g));
		}
		
		for(int i=0; i<gion.length; i++) {
			for(int j=i+1; j<gion.length; j++) {
				if(gion[i][0]>gion[j][0]) {
					int[] tmp = gion[i];
					gion[i] = gion[j];
					gion[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<gion.length; i++) {
			gion[i][1] = i+1;
		}
		
		System.out.println();
		for(int[] g : gion) {
			System.out.println(Arrays.toString(g));
		}

	}

}
