package day18;

import java.io.*;
import java.util.*;
public class Test01 {
/*
 	Sample.txt ������ �о Map���� �����غ���
 */
	public Test01() {
		// Properties ���� �����
		Properties prop = new Properties();
		// �ܺ� ���ϰ� ������ �����̴�
		// �� �۾��� IO���� ��Ȯ�� ��������
		FileInputStream fin = null;	// ������ ���� ��� ���ܰ� �߻��� ���̱� ������ 
									// �ϴ� null�� �ʱ�ȭ�ϰ� try������ ������ ������ ����
		try {
			fin = new FileInputStream("src/day18/Sample_ko.txt");
			// ��δ� ���� ��θ� ����ؼ� �츮�� ���� �۾��ϴ� ������ 
			// (d:\class\Java\git\Lava\Test_00\src\day18\Sample.txt)�� �����ص� �����ϴ�
			// ��Ŭ���� �ȿ� �����͸� ����� �̰��� ��Ŭ���� �ڽ��� ��θ� ���Ӱ� ���ؼ� ó���ϹǷ�
			// ���� ���ó�� ������Ʈ ������ ��θ� ã���ָ� �ȴ�
			
			// ���� �� ������ ������ Properties�� �е��� �Ѵ�
			prop.load(fin);
			// load �Լ��� ����Ǵ� ���� ������ ������ �о Map���� ó���� �� ���Ҵ�
		} catch(Exception e){
			e.printStackTrace();
		}
		
		// �������ʹ� ��ġ HashMap�� �����Ͱ� ����� ��ó�� ����ϸ� �ȴ�
		// Properties ������ ���� ������ = �� ��������
		// ������ Ű��, �������� �����Ͱ� �ȴ�
		// 		id=increpas-cls2	��� �ϸ� 
		// map.put("id", "increpas-cls2") ��� �Է��� �Ͱ� ���� ����̴�
		String name = (String)prop.get("name");
		System.out.println("������ ¦�� �̸�: " + name);
		System.out.println("������ ¦�� ����: " + prop.get("age"));
		System.out.println("������ ¦�� ����ó: " + prop.get("tel"));
		System.out.println("������ ¦�� �ּ�: " + prop.get("addr"));
		// �ѱ��� ���ڵ�����ߵ�. cmd â�� src\day18����
		// native2ascii Sample.txt Sample_ko.txt ��������
		// Sample_ko.txt ���� ����, ���� fin ��κ���
	}

	public static void main(String[] args) {
		new Test01();
	}

}
