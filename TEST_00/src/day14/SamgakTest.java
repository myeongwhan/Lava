package day14;

/*
 	문제 2]
	삼각형 클래스를 작성하고
	삼각형 클래스의 밑변과 높이를 입력해서 객체를 만들도록 작성하고
	만약 밑변이 같으면 같은 삼각형이 되도록
	equals 함수, toString() 를 오버라이드하고 테스트하세요
	
	입력은 JOptionPane 소속의 함수로 처리, 출력도 같은 소속의 함수로 처리하세요
	추가로 예외처리도 해주세요
 */
import javax.swing.JOptionPane;

public class SamgakTest {
	
	public SamgakTest() {
		int str1 = Integer.parseInt(JOptionPane.showInputDialog("첫 번째 삼각형 밑변: "));
		int str2 = Integer.parseInt(JOptionPane.showInputDialog("두 번째 삼각형 밑변: "));
		
//		try {
//			
//		} catch(Exception e) {
//			
//		}
		
		Samgak s1 = new Samgak(str1);
		Samgak s2 = new Samgak(str2);
		
		System.out.println("첫 번째 밑변: " + s1.getMit());
		System.out.println("두 번째 밑변: " + s2.getMit());
		
		System.out.println("같음? : " + ((s1.equals(s2))? "같음" : "다름"));
	}

	public static void main(String[] args) {
		new SamgakTest();
	}

}
