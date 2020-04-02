package day18;

import java.util.Comparator;

public class Ex02_Comp implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Ex02_ban name1 = (Ex02_ban) o1;
		Ex02_ban name2 = (Ex02_ban) o2;
		
		int tmp1 = Integer.parseInt(name1.getName());
		int tmp2 = Integer.parseInt(name2.getName());
		
		return tmp1 - tmp2;
	}

}
