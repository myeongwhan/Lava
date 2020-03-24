package day12;

/**
 * 이 클래스는 학생들 점수 입력할 클래스
 * @author class02
 *
 */
public class Student {
	private String name;
	private int java;
	private int db;
	private int html;
	private int js;
	private int css;
	private int sum;
	private double avg;
	
	public Student() {
		setJumSu();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getJs() {
		return js;
	}
	public void setJs(int js) {
		this.js = js;
	}
	public int getCss() {
		return css;
	}
	public void setCss(int css) {
		this.css = css;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public void setSum() {
		this.sum = java+db+html+js+css;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void setAvg() {
		this.avg = sum/5;
	}
	
	public void toPrint() {
		System.out.printf("%4s : %3d | %3d | %3d | %3d | %3d | %4d | %5.3f\n", 
						name, java, db, html, js, css, getSum(), getAvg());
	}
	
	public void setJumSu() {
		java = (int)(Math.random()*41+60);
		db = (int)(Math.random()*41+60);
		html = (int)(Math.random()*41+60);
		js = (int)(Math.random()*41+60);
		css = (int)(Math.random()*41+60);
	}
	
	
}
