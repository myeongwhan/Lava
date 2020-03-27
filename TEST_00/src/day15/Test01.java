package day15;

public class Test01 {
	
	public Test01() {
		Member hw = new Member();
		setMembData(hw);
		System.out.println(hw);	// ==> toString() 자동 호출
	}
	
	// Member의 데이터 체워주는 함수
	public void setMembData(Member m) {
		m.setMno(1242);
		m.setName("우현우");
		m.setId("whw");
		m.setMail("whw@increpas.com");
	}

	public static void main(String[] args) {
		new Test01();
	}

}
