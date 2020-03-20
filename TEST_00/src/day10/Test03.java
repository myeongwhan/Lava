package day10;

/*
 	Nemo 클래스를 5개 관리할 배열을 만들고
 	가로 세로는  1 ~ 29 까지 랜덤하게 만들어서 배열을 완성하자
 	
 	그리고 각 네모의 가로, 세로, 넓이를 출력해보자
 */
public class Test03 {
	// Nemo 배열변수를 만들자
	Nemo[] nemo;
	
	// Nemo 초기화 함수
	public void setNemo() {
		// 배열 초기화
		nemo = new Nemo[5];
		for(int i=0; i<nemo.length; i++) {
			// 반복문이 한 번 반복될 때마다 Nemo클래스의 인스턴스를 만들어서
			// 각 방에 넣어줘야 한다
			nemo[i] = new Nemo();
			
			/*
			Nemo 인스턴스는 만들었는데 아직 가로, 세로, 넓이는 초기화하지 않았다
			 따라서 현재 가로 세로 넓이는 0으로 세팅이 되어있다
			 이제 가로 세로 넓이를 세팅해준다. 우리는 그것의 기능을 만들어 뒀으므로
			 그 기능을 사용해보자
			*/
			// 숫자 두 개를 만든다
			int garo = (int)(Math.random()*(29-1+1)+1);
			int sero = (int)(Math.random()*(29-1+1)+1);
			nemo[i].setVal(garo, sero);
		}
	}

	public static void main(String[] args) {
		Test03 t = new Test03();	// 아직 멤버변수 nemo는 세팅되어있지 않다
		Test03 t1 = new Test03();	// 아직 멤버변수 nemo는 세팅되어있지 않다
		t.setNemo();	// nemo를 세팅해준다
		
		// 출력해준다. 우리는 멤버변수의 내용을 출력해주는 함수를 만들어 뒀으므로
		// 그것을 호출하자
		for(int i=0; i<t.nemo.length; i++) {
			t.nemo[i].toPrint();
		}
		System.out.println();
		System.out.println("##########");
		
		// t1도 시험삼아 출력한다
//		for(int i=0; i<t1.nemo.length; i++) {
//			t1.nemo[i].toPrint();
//		}
		//	==> t1의 nemo는 현재 null인 상태로 에러

	}

}
