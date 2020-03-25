package yeonspjang;

/*
 	»ï°¢Çü
 */
public class Circle extends Figure{
	double dulle;
	double nulbe;
	
	public Circle() {
		setDulle();
		setNulbe();
	}
	
	public double getDulle() {
		return dulle;
	}
	public void setDulle(double dulle) {
		this.dulle = dulle;
	}
	public double getNulbe() {
		return nulbe;
	}
	public void setNulbe(double nulbe) {
		this.nulbe = nulbe;
	}
	
	public void setDulle() {
		dulle = 2*PI*rad;
	}
	
	public void setNulbe() {
		nulbe = PI*rad*rad;
	}
}
