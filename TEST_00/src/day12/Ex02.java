package day12;

/*
 	���� 2]
	�л��� �̸�, java, db, html, js, css, ����, ���
	�� ������ Ŭ������ �����
	5�л��� �����͸� �Է��ؼ� ����ϼ���.
	��, ������ ����ȭ��Ű����.
 */

public class Ex02 {
	public Ex02() {
		String[] name = {"��", "��", "��", "��", "��"};
		Student[] ban = new Student[5];
		ban = setArr(ban, name);
		
		for(int i=0; i<ban.length; i++) {
			ban[i].toPrint();
		}
	}
	
	public Student[] setArr(Student[] s, String...name) {
		for(int i=0; i<name.length; i++) {
			s[i] = new Student();
		}
		return s;
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

}
