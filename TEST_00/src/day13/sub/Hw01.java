package day13.sub;

/*
 	HomeWork]
	day13.sub.Moyang �������̽��� 
	���� ��Ű�� ������ ������ �簢��, ���׶�� Ŭ������ �����
	�߻��Լ� ����ó�� ArrayList�� �����ϰ� 10���� ��Ƽ�
	������ ����ϴ� ���α׷��� �ۼ��ϼ���
 */
import java.util.*;
public class Hw01 {
	public Hw01() {
		
		// ���� �ν��Ͻ�
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
