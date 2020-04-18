package sukje;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hw11 {

	public Hw11() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("이름", "홍길동");
		map.put("이름", "홍길동");
		map.put("이름", "홍길동");
		
		Set<String> key = map.keySet();
		
		Iterator itor = key.iterator();
		
		while(itor.hasNext()) {
			String kStr = (String)itor.next();
			System.out.println(kStr + " - " + map.get(kStr));
		}
	}

	public static void main(String[] args) {
		new Hw11();
	}

}
