package day07.solv;

/*
	문제 8]
회원의 이름, 전화번호, 이메일을 저장할 배열을 만들고 데이터를 입력해서
회원의 이름을 입력하면
회원의 이름과 전화번호, 이메일을 출력해주는 프로그램을 작성하세요
*/
import javax.swing.*;
public class Solv08 {
	public static void main(String[] args) {
		String[] name = {"김소영", "최두용", "정우승", "유태희", "김종형", "임서진"};
		String[] tel = {"010-1111-1111", "010-2222-2222", "010-3333-3333", 
				"010-4444-444", "010-5555-5555", "010-6666-6666"};
		String[] mail = new String[] {"peng@increpas.com", "Dragon@increpas.com", 
				"vic@increpas.com", "nobody@increpas.com", "bell@increpas.com", 
				"leem@increpas.com"};
		
		/* 만약 "임서진"이라는 이름을 입력한다면
		 임서진이 가지는 인덱스를 알아내기 위해
		 name 배열에 각 방에 저장된 데이터를 모두 꺼내서
		 임서진이라는 문자열과 비교해서
		 맞는 경우 name의 해당 인덱스를 기억시켜놓으면 될 것이다
		 이 때 인덱스를 기억할 변수는 반복문의 블럭 내부에 만들 경우
		 반복문의 블럭을 빠져나가게 되면 사용할 수 없게 되므로
		 인덱스를 기억할 변수는 반복문의 블럭 밖에 만들어둔다*/
		
		String str = JOptionPane.showInputDialog("이름 입력: ");
		
		int idx = -1;
		for(int i=0; i<name.length; i++) {
			/* name배열에서 str과 같은 문자열이 있는지 검사
			 이 떄 주의사항은, 문자열의 데이터 비고는 동등비교연산자가 아닌
			 반드시	문자열1.equals(문자열2)	로 비교할 것*/
			if(name[i].equals(str)) {
				idx = i;
				break;	// 찾는 사람 인덱스를 찾고 반복문 종료
			}
		}
		
		String msg = "없는 팀원";
		
		/* 그런데 3팀이 아닌 광호씨 이름이 입력되는 경우는 해당 인덱스를 찾지 못하고
		 이 때 역시 반복문이 모두 실행이 될 것이다
		 이 경우 idx 변수의 값은 교체되지 않고 -1로 유지가 되기 때문에
		 idx의 값이 -1인 경우는 해당 사람을 찾지 못했다는 의미가 될 것*/
		
		if(idx != -1) {// 찾은 경우
			msg = "이름 \t: " + name[idx] + 
					"\n번호 \t: " + tel[idx] +
					"\n메일 \t:" + mail[idx];
		} else {// 못 찾은 경우
			
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
