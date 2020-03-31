package day17;

import java.util.Comparator;

public class Ex00_Sort02 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Semo s1 = (Semo)o1;
		Semo s2 = (Semo)o2;
		int result = s2.getMit() - s1.getMit();
		return result;
	}

}
