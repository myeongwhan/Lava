package day13;

/*
 	문제 1]
	Figure 클래스를 상속받아서 Nemo, Semo, Won 클래스를 작성하세요
	Figure 클래스는 면적을 구해주는 추상함수만 멤버로 가지고 있습니다
	
	ArrayList에 각 도형의 인스턴스를 10개 랜덤하게 담고
	꺼내서 출력하는 프로그램을 작성하세요
 */
import java.util.ArrayList;
public class Ex01 {
	
	public Ex01() {
		ArrayList list = new ArrayList();
		
//		for(int i=0; i<list.size(); i++) {
//			Figure f = (Figure)list.get(i);
//		}
		ArrayList list2 = new ArrayList();
		
		Figure f;
		
		for(int i=0; i<10; i++) {
			int no = (int)(Math.random()*3+1);
			if(no == 1) {
				list.add(new Nemo());
			} else if(no == 2) {
				list.add(new Semo());
			} else {
				list.add(new Won());
			}
		}
		
		list2.add(new int[] {(int)(Math.random()*10+1),(int)(Math.random()*10+1)});
		
		for(int i=0; i<list.size(); i++) {
			f = (Figure)list.get(i);
			for(int j=0; j<list2.size(); j++) {
				int[] arr = (int[])list2.get(j);
				System.out.println(f.calcArea(arr));
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
