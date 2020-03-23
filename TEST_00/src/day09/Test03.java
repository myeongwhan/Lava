package day09;

/*
 	1���� �迭�� 'A' ~ 'E' ���� �ʱ�ȭ���ִ� �Լ��� �����ؼ�
 	�������� ch �� �ʱ�ȭ�� ���ְ�
 	
 	�빮�ڸ� �Է��ϸ� �ҹ��ڷ� ��ȯ���ִ� �Լ��� ����
 	ch�� ���ڸ� �ҹ��ڷ� ��� �����ϼ���
 	
 	
 	��ȭ�н�]
 		���ڹ迭�� �Է��ϸ� ���ڹ迭�� 'A' ~ 'E'���� �ʱ�ȭ���ִ�
 		����� ���� �Լ��� �ۼ��ϰ� �����ؼ� ����ϼ���
 */
public class Test03 {
	char[] ch;
	
	public Test03() {
		setCh();
		
		for(char c : ch) {
			System.out.printf("%2c | ", c);
		}
		
		// �迭�� ��� ������ �ҹ��ڷ� ����
		for(int i=0; i<ch.length; i++) {
			char d = ch[i];
			ch[i] = toSo(d);
		}
		
		System.out.println();
		
		for(char c : ch) {
			System.out.printf("%2c | ", c);
		}
		
		System.out.println();
		
	}
	
	// ���ڹ迭 �ʱ�ȭ��Ű�� ����� �Լ�
	public void setCh() {
		ch = new char[5];
//		for(int i='A'; i<'E' + 1; i++) {
//			ch[i - 'A'] = (char)i;
//		}
		for(int i=0; i<5; i++) {
			ch[i] = (char)('A' + i);
		}
	}
	
	// �빮�ڸ� �ҹ��ڷ� ��ȯ���ִ� �Լ�
	public char toSo(char d) {
		char result = (char)(d + ('a' - 'A'));
		return result;
	}

	public static void main(String[] args) {
		new Test03();
		
//		setCh();		//	X
						//	static ���, �Ǵ� �޸�(��)�� �÷��� ����� ���� �� ����
	}

}