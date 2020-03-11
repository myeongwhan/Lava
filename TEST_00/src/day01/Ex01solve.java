package day01;

public class Ex01solve {
	public static void main(String[] args) {
		double data = 365.2426;
		// 1. 날짜 계산
		int day = (int)data; // data - (data % 1)
		// 2. 떨어지는 날짜 이외의 데이터를 초로 환산
		int sec = (int)((data % 1) * 24 * 60 * 60);
		// 0.2426일 ==> 0.2426 * 24(시간)
//						0.2426 * 24 * 60(분)
//						0.2426 * 24 * 60 * 60(초)
		int hour = sec / 3600;
		sec %= 3600;
		int min = sec / 60;
		
		System.out.println("일년은 " + day + " 일, " + hour + " 시간" + 
							min + " 분 " + sec + " 초 입니다"
							);
	}
}
