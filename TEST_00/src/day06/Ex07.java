package day06;

/*
 	문제 7]
	문자열을 입력받아서
	문자배열에 문자열을 이루는 문자를 순차적으로 저장하세요
	
	"hong"
	
	-----------------
	|'h'|'o'|'n'|'g'|
	-----------------
	
	참고]
		문자열의 특정위치의 문자를 추출해주는 함수
			문자열.charAt(위치값);
			
		문자열의 길이를 반환해주는 함수
			문자열.length();
			==> 반환값이 정수
 */
import java.util.*;
public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		char[] ch = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			ch[i]=str.charAt(i);
		}
		System.out.println(Arrays.toString(ch));

	}

}
