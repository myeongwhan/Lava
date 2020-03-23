package day11;

/*
 	���� 2]
 		�� Ŭ������ �л� �� ����
 		�̸�, java, oracle, html, javascript, jsp, spring �� ������ �����
 		�� Ŭ������ ��ü�� �� �� �����͸� �Է¹޾Ƽ� �� ������ ����� �ǰ�
 		Ŭ������ �����ϼ���
 		
 		��, �����Ͱ� �Է��� �� �� ��� �̸��� "�ڱ�ȣ" �� �ϰ� 
 		������ �����ϰ� ���ǰ� �ϼ���
 */
public class Score {
	String name;
	int java, oracle, html, javascript, jsp, spring, total;
	double avg;
	
	public Score() {
		this("�ڱ�ȣ");
	}
	
//	public Score(String name) {
//		this.name = name;
//		setScore();
//		setTotal();
//		setAvg();
//	}
	
//	public void setScore() {
//		java = (int)(Math.random()*(100-60+1)+60);
//		oracle = (int)(Math.random()*(100-60+1)+60);
//		html = (int)(Math.random()*(100-60+1)+60);
//		javascript = (int)(Math.random()*(100-60+1)+60);
//		jsp = (int)(Math.random()*(100-60+1)+60);
//		spring = (int)(Math.random()*(100-60+1)+60);
//	}
	
	public void setTotal() {
		this.total = java + oracle + html + javascript + jsp + spring;
	}
	
	public void setAvg() {
		this.avg = this.total/6.;
	}
	
	public void toPrint() {
		System.out.printf("%4s : %3d | %3d | %3d | %3d | %3d | %3d | %4d | %5.3f\n", 
						name, java, oracle, html, javascript, jsp, spring, total, avg);
	}
	
	
	public Score(String name) {
		this(name, getJumsoo(), getJumsoo()
				, getJumsoo(), getJumsoo()
				, getJumsoo(), getJumsoo()
			);
		/*
		 	getJumsoo() �Լ��� �� Ŭ������ ����̰�
		 	�� �Լ��� ����� �� �ִ� ������
		 	�� Ŭ������ ��ü�� �� ���Ŀ� ��� �����ϴ�
		 	
		 	���� �� �Լ��� ���ٸ� �Ӽ� ���� �����ϰ� �Ǹ�
		 	���� �޸𸮿� �÷����� ���� �����̰�
		 	�������Լ����� ȣ���� �� ���� �����̱� ������ ����� �� ����
		 	
		 	�� �Լ��� ���� ����ؾ߰ڴٸ�
		 	�� �Լ��� �̸� �޸𸮿� �÷��ָ� �� ���̴�
		 	�� �� ����� �� �ִ� �Ӽ���
		 		static
		 	�Ӽ��̴�
		 */
	}
	
	public Score(String name, int java, int oracle, int html, int javascript, int jsp, int spring) {
		this.name = name;
		this.java = java;
		this.oracle = oracle;
		this.html = html;
		this.javascript = javascript;
		this.jsp = jsp;
		this.spring = spring;
		setTotal();
		setAvg();
	}
	
	public static int getJumsoo() {
		return (int)(Math.random()*(100-60+1)+60);
	}
	
}
