package day14;

public class Test01 {
	int age;
	String name;
	
	public Test01() {}
	public Test01(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public String toString() {
		// Override	(Object가 가지고 있는 toString() 을 오버라이드한 것))
		return name + " 님의 나이는 " + age + " 입니다.";
	}

}
