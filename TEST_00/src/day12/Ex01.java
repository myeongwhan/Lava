package day12;

import java.util.Arrays;

/*
 	문제 1]
 		학생의 java, db, html, javascript, spring, sum, avg
 		점수를 관리할 배열을 만들고
 		총점과 평균을 구해서 출력하세요
 		
 		단, 과목별 총점과 평균도 같이 배열에서 관리하세요 (5명)
 		
 		java	db	html	javascript	spring	sum	avg
 		--------------------------------------------
 		100		95	100			100		90		총점	평균
 		...
 	
 과목총점	450		480  
 과목평균	90.00	96.00
 
 		의 형태로 만들어서 배열에 데이터를 채우고 출력하세요
 		배열은
 			double[][] score = new double[7][7];
 */
public class Ex01 {

	public Ex01(){
//		setScore();
		
		double[][] score = new double[7][7];
		
		for(int i=0; i<score.length-2; i++) {
			for(int j=0; j<score[i].length-2; j++) {
				score[i][j] = (int)(Math.random()*(100-60+1)+60);
			}
		}
		
		// sum
		for(int i=0; i<score.length-2; i++) {
			for(int j=0; j<score[i].length-2; j++) {
				score[i][5] += score[i][j];
			}
		}
		
		// avg
		for(int i=0; i<score.length; i++) {
			score[i][6] = score[i][5]/5;
		}
		
		// 과목총점
		for(int j=0; j<score.length-2; j++) {
			for(int i=0; i<score[j].length-2; i++) {
				score[5][i] += score[j][i];
			}
		}
		
		// 과목평균
		for(int j=0; j<score.length; j++) {
			score[6][j] = score[5][j]/5;
		}
		
		// 출력
		System.out.println("java, db, html, javascript, spring, sum, avg");
		System.out.println("----------------------------------------------");
		for(int i=0; i<score.length; i++) {
			System.out.println(Arrays.toString(score[i]));
		}
	}
	
	public static void main(String[] args) {
		new Ex01();

	}
	
//	public void setScore() {
//		int java = (int)(Math.random()*(100-60+1)+60);
//		int db = (int)(Math.random()*(100-60+1)+60);
//		int html = (int)(Math.random()*(100-60+1)+60);
//		int javascript = (int)(Math.random()*(100-60+1)+60);
//		int spring = (int)(Math.random()*(100-60+1)+60);
//	}

}
