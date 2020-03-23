package day11;
/*
	문제 3]
		문제 1, 2번에서 만든 클래스를 객체로 만들어서
		각 생성자함수가 올바르게 작동하는지 실행하세요
*/

public class Ex01 {
	
	public Ex01() {
		// 원 10개 만들어서 저장
		Circle[] cir = new Circle[10];
		for(int i=0; i<cir.length; i++) {
			if(i < 5) {
			cir[i] = new Circle((int)(Math.random()*16 + 5));
			} else {
				cir[i] = new Circle();
			}
		}
		
		// 원 출력
		for(int i=0; i<cir.length; i++) {
			cir[i].toPrint();
		}
		
		System.out.println();
		System.out.println("***********************************");
		System.out.println();
		
		// 성적 클래스 만들기
		Score[] score = new Score[3];
		score[0] = new Score();
		score[1] = new Score("우현우");
		score[2] = new Score("팽순이", 100, 100, 100, 100, 95, 80);
		
		// 성적 출력
		for(int i=0; i<score.length; i++) {
			score[i].toPrint();
		}
		
	}
	
	public static void main(String[] args) {
		new Ex01();

	}

}
