package day17;

import java.util.*;
public class Test07 {
/*
 	예제]
 		랜덤한 숫자를 10개 발생하고
 		그 숫자를 학생의 성적이라고 가정한다
 		이 중 80 ~ 100 사이의 점수만 따로 뽑아서 관리하고자 한다
 		단, 중복 점수는 없는 것으로 한다
 */
	public Test07() {
		TreeSet<Integer> set = new TreeSet<Integer>();
		Random rnd = new Random();
		
		// 랜덤하게 점수 10개 입력
		while(true) {
			set.add(rnd.nextInt(101));
			if(set.size() == 20) break;
		}
		
		// 80 ~ 100 사이의 점수 따로 뽑아서 저장
		TreeSet<Integer> tScore = (TreeSet<Integer>)set.subSet(80, 100);
		// ==> subSet() 는 반환값타입이 SortedSet이므로 강제형변환해준다
		
		// ArrayList로 변환해서 출력
		ArrayList<Integer> list = new ArrayList<Integer>(tScore);
		
		for(int s : list) {
			System.out.print(s + " | ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		new Test07();
	}

}
