package day12;

/**
 * �� Ŭ������ ����� ������ ������ Ŭ�����̴�
 * @author �̸�ȯ
 * @since 2020.03.24
 * @version v.1.0
 * @see
 *
 */
public class People {
	// �� Ŭ������ �ּҷϿ� ����� ����� ������ ����� �뵵�� Ŭ�����̴�
	// ���� ����� �������� ����� �������� ��������� �Ѵ�
	String name, addr, tel, mail, birthday, gen, cop;
	
	// �׷��� �� Ŭ������ ��ü�� �� ����
	// ��� ������ ��� �غ�Ǽ� �ԷµǸ� �� �� �������� ���� ���̴�
	// �׷��� � ������ �⺻������ ������ �Ǿ�� �� ������ ������ ���̴�(cop)
	
	// �������Լ� ����
	// �⺻�������Լ�
	public People() {
		
	}
	
	public People(String name, String tel, String mail, String gen, String birthday, String addr) {
		this("increpas", name, tel, mail, gen, birthday, addr);
	}
	
	public People(String cop, String name, String tel, String mail, String gen, String birthday, String addr) {
		this.cop = cop;
		this.name = name;
		this.tel = tel;
		this.mail = mail;
		this.addr = addr;
		this.birthday = birthday;
		this.gen = gen;
		
	}

}