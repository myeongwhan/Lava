package day06;

/*
 	���� 5]
	�Ǻ���ġ ���� 10���� ������ �迭�� �����
	�迭�� ���� �Է��ؼ� �迭�� ����� �����͸� ����ϼ���
	(���� �ΰ� ���ڸ� ���ؼ� ���� ��)
 */
import java.util.*;
public class Ex05 {

	public static void main(String[] args) {
		int[] pibo = new int[10];
		pibo[0] = 1;
		pibo[1] = 1;
		
		int jun = pibo[0];
		int hu = pibo[1];
		for(int i=2; i < 10; i++) {
			pibo[i] = jun + hu;
			jun = hu;
			hu = pibo[i];
		}
		System.out.println(Arrays.toString(pibo));

	}

}
