package day19;

/*
 	DataOutputStream 으로 저장한 친구의 정보를 읽어보자
 */
import java.io.*;
import javax.swing.*;
public class Test08_01 {

	public Test08_01() {
		// 타겟스트림 준비
		FileInputStream fin = null;
		// 보조스트림 준비
		DataInputStream din = null;
		
		try {
			// 스트림 초기화
			fin = new FileInputStream("src/day19/etc/DataStream_test.txt");
			din = new DataInputStream(fin);
			
			// 주의할 점은 파일을 저장할 때 
			// 이름, 나이, 신장, 성별, 전화, 메일 의 순서로 저장했기 때문에
			// 읽을 때도 이 순서대로 읽어야 한다
			String name = din.readUTF();
			int age = din.readInt();
			float height = din.readFloat();
			char gen = din.readChar();
			String tel = din.readUTF();
			String mail = din.readUTF();
			
			// 출력
			String msg = "이름: " + name + "\n나이: " + age + "\n신장: " + 
						height + "\n성별: " + gen + "\n전화: " + tel + "\n메일: " + mail;
			JOptionPane.showMessageDialog(null, msg);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				din.close();
				fin.close();
			} catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test08_01();
	}

}
