package yeonspjang;

import java.util.*;

public class wd {

	public wd() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("�̸�", "ȫ�浿");
		map.put("����", "24");
		map.put("����", "����");
		
		Set<String> key = map.keySet();
		
		ArrayList<String> kList = new ArrayList<String>(key);
		
		for(String k : kList) {
			System.out.println(k + " - " + map.get(k));
		}
		
//		for(int i=0; i<kList.size(); i++) {
//			System.out.println(kList.get(i) + " - " + map.get(kList.get(i)));
//		}
	}

	public static void main(String[] args) {
		new wd();
	}

}
