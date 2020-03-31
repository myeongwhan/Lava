package day17;

import java.util.*;

public class Test09 {

	public Test09() {
		// HashMap
		// 친구이름을 키값으로 하고 전화번호를 데이터로 하는 맵을 만들어서 사용해보자
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("큰손", "010-9999-9999");
		map.put("작은손", "010-3333-3333");
		map.put("진로", "010-5555-5555");
		map.put("늘보", "010-2222-2222");
		
		// 키값만 추출하자. keySet()
		Set<String> key = map.keySet();
		
		// ArrayList 로 변환해서 뽑아보자. Iterator로 변환해서 사용해도 된다
		ArrayList<String> kList = new ArrayList<String>(key);
		for(String k : kList) {
			// 출력
			System.out.println(k + ": " + map.get(k));
		}
		System.out.println();
		
		// Map.Entry 를 사용해서 키와 밸류를 출력해보자
		
		Set<Map.Entry<String, String>> set = map.entrySet();
		
		// 이제 데이터는 모두 변환이 되었으니 꺼내서 출력해보자
		Iterator<Map.Entry<String, String>> itor = set.iterator();
		
		// 이제 하나씩 꺼낸다
		while(itor.hasNext()) {
			Map.Entry<String, String> ent = itor.next();
			String k = ent.getKey();
			String val = ent.getValue();
			
			System.out.println(k + ": " + val);
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
