package day18;

public class Thread01 extends Thread{

	public void run() {
		for(int i = 0; i < 200; i++) {
			if((i+1) % 10 == 0) {
				System.out.println();
			}
			try {
				sleep(1000);
			} catch(InterruptedException e) {}
			System.out.print(i+1 + " | ");
		}
	}
}
