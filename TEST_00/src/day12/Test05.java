package day12;

public class Test05 {
	public Test05() {
		Emp e1 = new Emp();
//		e1.sal = 10000;	// X. 변수의 접근지정자가 private 이기 때문
		e1.setEmpno(10000);
		int eno = e1.getEmpno();
	}

	public static void main(String[] args) {
		new Test05();
	}

}
