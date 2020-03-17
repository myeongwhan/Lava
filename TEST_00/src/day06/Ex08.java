package day06;

/*
 	문제 8]
	회원의 이름, 전화번호, 이메일을 저장할 배열을 만들고 데이터를 입력해서
	회원의 이름을 입력하면
	회원의 이름과 전화번호, 이메일을 출력해주는 프로그램을 작성하세요
 */
import java.util.*;
public class Ex08 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[5];
		String[] tel = new String[5];
		String[] email = new String[5];
		
		for(int i=0; i<5; i++) {
			
			System.out.print("이름 : ");
			String pname = sc.nextLine();
			name[i] = pname;
			System.out.print("전화번호 : ");
			String ptel = sc.nextLine();
			tel[i] = ptel;
			System.out.print("이메일 : ");
			String pemail = sc.nextLine();	
			email[i] = pemail;
		
		}
		
		System.out.println();
		
		System.out.print("검색할 이름 : ");
		String search = sc.nextLine();
		for(int i=0; i<5; i++) {
			if(search.equals(name[i])) {
				System.out.println(name[i] + ", "+tel[i] +", "+ email[i]);
				break;
			}
		}
		sc.close();

	}

}
