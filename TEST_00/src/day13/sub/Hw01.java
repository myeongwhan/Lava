package day13.sub;

/*
 	HomeWork]
	day13.sub.Moyang 인터페이스를 
	같은 패키지 내에서 구현한 사각형, 동그라미 클래스를 만들고
	추상함수 문제처럼 ArrayList에 랜덤하게 10개를 담아서
	내용을 출력하는 프로그램을 작성하세요
 */
import java.util.*;
public class Hw01 {
	public Hw01() {
		
		// 랜덤 인스턴스
		ArrayList list = new ArrayList();
		for(int i=0; i<10; i++) {
			int no = (int)(Math.random()*3+1);
			if(no == 1) {
				list.add(new Dongl((int)(Math.random()*10+1)));
			} else if(no == 2) {
				list.add(new Sagak((int)(Math.random()*10+1),(int)(Math.random()*10+1)));
			} else {
				list.add(new Samgak((int)(Math.random()*10+1),(int)(Math.random()*10+1)));
			}
		}
		
		Moyang mm;
		for(int i=0; i<list.size(); i++) {
			mm = (Moyang)list.get(i);
			mm.toPrint();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Hw01();
	}

}
