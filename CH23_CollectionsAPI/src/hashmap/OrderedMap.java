package hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class OrderedMap {

	public static void main(String[] args) {
		// HashSet, LinkedHashSet, TreeSet ��������, ��������, ���ĵ�
		// HashMap, LinkedHashMap, TreeMap ��������, ��������, ���ĵ�

		Map<Integer, String> months1 = new LinkedHashMap<>();

		months1.put(1, "1��");
		months1.put(3, "3��");
		months1.put(6, "6��");
		
		// ��ũ�� �ؽø��� �Է¼����� ��µ�
		months1.forEach((k, v) -> System.out.println(k + ": " + v));

	}

}
