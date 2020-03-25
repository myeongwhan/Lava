package yeonspjang;

public class Samgak extends Figure{
	double nulbe;
	
	public Samgak() {
		setNulbe();
	}

	public double getNulbe() {
		return nulbe;
	}

	public void setNulbe(double nulbe) {
		this.nulbe = nulbe;
	}
	
	public void setNulbe() {
		nulbe = garo*sero/2.;
	}
}
