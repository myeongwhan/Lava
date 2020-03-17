package day07;

import java.util.Arrays;

import javax.swing.JOptionPane;

/*
 	문제 3]
	회원의 이름, 전화번호, 이메일을 저장할 배열을 만들고
	데이터를 입력해놓고
	
	이름을 입력하면
	그 사람의 데이터를 모두 저장할 배열을 만들어서
	데이터를 넣고 출력하세요
 */
public class Ex03 {

	public static void main(String[] args) {
		String name[] = {"김", "이", "박"};
		String tel[] = {"02", "010", "070"};
		String mail[] = {"gmail", "naver", "increpas"};
		
		String info[] = new String[3];
		
		String str = JOptionPane.showInputDialog("이름 입력: ");
		// 이름에 맞는 위치값을 찾아준다.
		int index = -1 ;
		for(int i = 0 ; i < name.length ; i++ ) {
			if(str.equals(name[i])) {
				index = i;
				info[0] = name[i];
				info[1] = tel[i];
				info[2] = mail[i];
				break;
			}
		}
		String msg = "찾는 사람 : " + str + "\n" + Arrays.toString(info);
		if(index == -1) {
			msg = "없는 사람입니다!";
		}
		JOptionPane.showMessageDialog(null, msg);
		
		/*
		for(int i=0; i<3; i++) {
			if(str.equals(name[i])) {
				info[0] = name[i];
				info[1] = tel[i];
				info[2] = mail[i];
				String msg = Arrays.toString(info);
				JOptionPane.showMessageDialog(null, msg);
				break;
			} else {
				
			}
		}
		*/
		
	}

}
