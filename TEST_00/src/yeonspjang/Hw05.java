package yeonspjang;

public class Hw05 {
	private String name, dept;
	private int salary;
	
	public Hw05() {
		
	}
	
	public Hw05(String name, String dept, int salary) {
		setName(name);
		setDept(dept);		
		setSalary(salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
