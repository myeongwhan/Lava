package day10;

public class Calc {
	int sum = 0;
	double avg = 0;
//	int[] cls = new int[10];
	
//	public void setSum(int[] qwe) {
//		int i = 0;
//		for(i=0; i<qwe.length; i++) {
//			if(i == qwe.length-1) {
//				qwe[i] += qwe[i+1];
//				break;
//			}
//			qwe[i] += qwe[i+1];
//		}
//		sum = qwe[i];
//	}
	
	public void setVal(int[] qwe) {
		
		for(int i=0; i<qwe.length; i++) {
		sum += qwe[i];
		}
		avg = sum/qwe.length;
	}
	public void showAll() {
		
	}
	

}
