package com.project.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {

		Map<Object, Object> map = new HashMap<>();
		map.put("a", "1");
		map.put("b", "2");
		map.put("c", "3");
		map.put("d", "4");
		// 遍历Map
		for (Object object : map.keySet()) {
			System.out.print(map.get(object) + " ");
		}

		// Entry
		for (Entry<Object, Object> mEntry : map.entrySet()) {
			System.out.println(mEntry.getKey() + ":" + mEntry.getValue());
		}
		// 迭代器
		for (Iterator<Entry<Object, Object>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
			System.out.print(iterator.next().getValue());
		}

	

	}

}
