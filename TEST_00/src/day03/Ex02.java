package day03;

/*
 	문제 1]
 		게시판에 글을 한 페이지에 15개 표시할 수 있다
 		게시물의 개수를 랜덤하게(0 ~ 100) 발생한 후
 		필요한 페이지 수를 계산해서 출력해주는 프로그램을 작성하세요
 		단, 게시물 수가 0인 경우는 1페이지가 필요한 것으로
 */
public class Ex02 {
	
	public Ex02() {
		int no = (int)(Math.random()*(100-0+1));
		
		System.out.println("게시물 개수: " + no);
		int page = 0;
		if(no == 0) {
			page = 1;
		} else {
			if(no%15 == 0) {
				page = no/15;
			} else {
				page = no/15 + 1;
			}
		}
		
		System.out.println("필요한 페이지 수 : " + page);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
