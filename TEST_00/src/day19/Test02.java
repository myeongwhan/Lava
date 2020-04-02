package day19;

/*
 	���� 2] FileInputStream
 		day19.etc ��Ű���� �ִ� sample.txt ������ �о��
 */
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Test02 {

	public Test02() {
		// ���� ���Ͽ� ������ Ÿ�ٽ�Ʈ��(�⺻��Ʈ��)�� �غ��Ѵ�
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day19/etc/sample.txt");
			/*
			// 1. �� ���ڸ� �о��
			int ch = fin.read();
			System.out.println("���� ����: " + (char)ch);
			
			// 2. ���� ���ڸ� �о��
			// �� ��Ʈ���� ����Ʈ ����� ��Ʈ���̰�, ������ó���� ����Ʈ�� ó���Ѵ�
			// ���� �� ���ڴ� ����Ʈ������ �� ���̰�, ���� ���ڴ� ����Ʈ������ ���� ���� �� ���̴�
			// �̰��� �ϳ��� �������� ������ �Ϸ��� ����Ʈ �迭�� �ʿ��ϰڴ�
			byte[] buff = new byte[1024];	// 1KByte
			int len = fin.read(buff);
			// ���ڿ��� ��ȯ
			String str = new String(buff, 0, len);
			// ���
			System.out.println("######���� ���#####");
			System.out.println(str);
			 */
			
			// 3. ���� ��ü�� �о��
			byte[] buff = new byte[1024];
			// �̷��� �ϸ� 1kbyte �� ���� ���̰� ���Ͽ��� �� �̻� �����Ͱ� ���� �� �ִ�
			// ���� �ݺ��ؼ� ������ ������� ó���غ���
			while(true) {
				Arrays.fill(buff, (byte)0);
				// �д� �۾��� ���� ������ �𸣹Ƿ� ����ؼ� �ݺ���Ų��
				int len = fin.read(buff);
				if(len == -1) {
					// �� �̻� ���� �����Ͱ� ������ �ݺ��� �����Ѵ�
					// �̶� read()�� ���� �����Ͱ� ������ -1�� ��ȯ���ش�
					break;
				}
				// ���� ������ ���ڿ��� ��ȯ��Ű��
				String str = new String(buff, 0, len);
				System.out.println(str);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
