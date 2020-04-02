package day19;

/*
 	예제 2] FileInputStream
 		day19.etc 패키지에 있는 sample.txt 파일을 읽어보자
 */
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Test02 {

	public Test02() {
		// 먼저 파일에 연결할 타겟스트림(기본스트림)을 준비한다
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day19/etc/sample.txt");
			/*
			// 1. 한 글자만 읽어보자
			int ch = fin.read();
			System.out.println("읽은 문자: " + (char)ch);
			
			// 2. 여러 글자를 읽어보자
			// 이 스트림은 바이트 기반의 스트림이고, 데이터처리를 바이트로 처리한다
			// 따라서 한 문자는 바이트데이터 한 개이고, 여러 문자는 바이트데이터 여러 개가 될 것이다
			// 이것을 하나의 변수에서 관리를 하려면 바이트 배열이 필요하겠다
			byte[] buff = new byte[1024];	// 1KByte
			int len = fin.read(buff);
			// 문자열로 변환
			String str = new String(buff, 0, len);
			// 출력
			System.out.println("######읽은 결과#####");
			System.out.println(str);
			 */
			
			// 3. 문서 전체를 읽어보자
			byte[] buff = new byte[1024];
			// 이렇게 하면 1kbyte 만 읽을 것이고 파일에는 그 이상에 데이터가 있을 수 있다
			// 따라서 반복해서 꺼내는 방법으로 처리해보자
			while(true) {
				Arrays.fill(buff, (byte)0);
				// 읽는 작업이 언제 끝날지 모르므로 계속해서 반복시킨다
				int len = fin.read(buff);
				if(len == -1) {
					// 더 이상 읽을 데이터가 없으면 반복을 중지한다
					// 이때 read()는 읽은 데이터가 없으면 -1을 반환해준다
					break;
				}
				// 읽은 데이터 문자열로 변환시키고
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
