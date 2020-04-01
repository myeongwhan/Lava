package day18;

/*
	문제 2]
		학생의 이름, 번호, 반, 국어, 영어, 수학, 총점, 평균
		을 저장할 VO 클래스를 만들고
		
		5학생의 데이터를 입력해서 관리할 Set을 만들어서
		이름 순으로 출력하세요
*/
public class Ex02_ban {

	private String name;
	private int number, ban, kor, eng, math, sum;
	private double avg;
	
	public Ex02_ban() {
		
	}
	public Ex02_ban(String name, int number, int ban, int kor, int eng, int math) {
		this.name = name;
		this.number = number;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setSum();
		setAvg();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	public void setSum() {
		this.sum = kor + eng + math;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void setAvg() {
		this.avg = sum/3.;
	}
	
	

}
