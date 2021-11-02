package hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class OrderedMap {

	public static void main(String[] args) {
		// HashSet, LinkedHashSet, TreeSet 순서없음, 순서있음, 정렬됨
		// HashMap, LinkedHashMap, TreeMap 순서없음, 순서있음, 정렬됨

		Map<Integer, String> months1 = new LinkedHashMap<>();

		months1.put(1, "1월");
		months1.put(3, "3월");
		months1.put(6, "6월");
		
		// 링크드 해시맵은 입력순으로 출력됨
		months1.forEach((k, v) -> System.out.println(k + ": " + v));

	}

}
