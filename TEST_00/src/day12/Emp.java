package day12;
/* **************** VO class. 데이터를 담고만 있고 필요할 때 데이터 부르는 클래스
 	alt+shift+s	- generate getters and setters
 	
 	반드시 getter와 setter가 세트로 있어야 한다
 	
 */
public class Emp {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private String hiredate;
	private double sal;
	private double comm;
	private int deptno;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	/*
	// 데이터 대입해주는 함수
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	// 데이터 반환해주는 함수
	public int getEmpno() {
		return empno;
	}
	*/
	
}
