package day13;

/*
 	���� 1]
	Figure Ŭ������ ��ӹ޾Ƽ� Nemo, Semo, Won Ŭ������ �ۼ��ϼ���
	Figure Ŭ������ ������ �����ִ� �߻��Լ��� ����� ������ �ֽ��ϴ�
	
	ArrayList�� �� ������ �ν��Ͻ��� 10�� �����ϰ� ���
	������ ����ϴ� ���α׷��� �ۼ��ϼ���
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
