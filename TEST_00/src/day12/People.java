package day12;

/**
 * 이 클래스는 사람의 정보를 저장할 클래스이다
 * @author 이명환
 * @since 2020.03.24
 * @version v.1.0
 * @see
 *
 */
public class People {
	// 이 클래스는 주소록에 사용할 사람의 정보를 기억할 용도의 클래스이다
	// 따라서 사람의 정보들을 기억할 변수들이 만들어져야 한다
	String name, addr, tel, mail, birthday, gen, cop;
	
	// 그런데 이 클래스가 객체가 될 때는
	// 모든 정보가 모두 준비되서 입력되면 더 할 나위없이 좋을 것이다
	// 그런데 어떤 정보는 기본정보로 세팅이 되어야 할 변수도 존재할 것이다(cop)
	
	// 생성자함수 정의
	// 기본생성자함수
	public People() {
		
	}
	
	public People(String name, String tel, String mail, String gen, String birthday, String addr) {
		this("increpas", name, tel, mail, gen, birthday, addr);
	}
	
	public People(String cop, String name, String tel, String mail, String gen, String birthday, String addr) {
		this.cop = cop;
		this.name = name;
		this.tel = tel;
		this.mail = mail;
		this.addr = addr;
		this.birthday = birthday;
		this.gen = gen;
		
	}

}
