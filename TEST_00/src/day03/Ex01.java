package day03;

public class Ex01 {
/*
 	1 ~ 100������ ���� �� ���� �����ϰ� ����
 	�� ���� ū ������ ���ʷ� ��µǰ� �ϼ���
 	��, ������ 4���� �ѱ��� ������
 */
	public Ex01(){
		
		
		int max = (int)(Math.random()*(100 - 1 + 1))+1;
		int mid = (int)(Math.random()*(100 - 1 + 1))+1;
		int min = (int)(Math.random()*(100 - 1 + 1))+1;
		
		int tmp = 0;
		if(max >= mid) {	// max > mid > min
			if(mid >= min) {
				//
			} else { // min > mid
				if(max >= min) { // max > min > mid
					tmp = mid;
					mid = min;
					min = tmp;
				} else { // min > max > mid
					tmp = max;
					max = min;
					min = tmp;
					
					tmp = mid;
					mid = min;
					min = tmp;
				}
			}
		} else {
			// mid >max
			if(mid >= min) {
				if(max > min) { // mid > max > min
					tmp = max;
					max = mid;
					mid = tmp;
				} else { // mid > min > max
					tmp = max;
					max = mid;
					mid = tmp;
					
					tmp = mid;
					mid = min;
					min = tmp;
				}
			} else { // min > mid > max
				tmp = max;
				max = min;
				min = tmp;
			}
		}
		
		System.out.println("max : " + max);
		System.out.println("mid : " + mid);
		System.out.println("min : " + min);
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
