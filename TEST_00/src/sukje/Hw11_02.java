package sukje;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hw11_02 {

	public Hw11_02() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("�̸�", "ȫ�浿");
		map.put("����", "24");
		map.put("����", "����");
		
		Set<Map.Entry<String, String>> set = map.entrySet();
		
		Iterator<Map.Entry<String, String>> itor = set.iterator();
		
		while(itor.hasNext()) {
			Map.Entry<String, String> ent = itor.next();
			String k = ent.getKey();
			
			System.out.println(k + " - " + map.get(k));
		}
	}

	public static void main(String[] args) {
		new Hw11_02();
	}

}
