package day14;

public class Samgak {
	private int mit, nop;
	
	public Samgak(int mit) {
		this.mit = mit;
		getMit();
		getNop();
	}

	public int getMit() {
		return mit;
	}

	public void setMit(int mit) {
		this.mit = mit;
	}

	public int getNop() {
		return nop;
	}

	public void setNop(int nop) {
		this.nop = nop;
	}
	
	public boolean equals(Object obj) {
		// ��ȯ�� ���� ���� ���� �� �ʱ�ȭ
		boolean bool = false;
		
		Samgak s1 = (Samgak) obj;
		
		bool = (this.mit == s1.mit);
		
		// ��� ��ȯ
		return bool;
	}
	
	public String toString() {
		String str = "";
		
		Samgak s1 = (Samgak) null;		
		
		return str;
	}
	
}
