package com.project.collection;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;

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
		for (Object key : map.keySet()) {
			System.out.print(map.get(key) + " ");
		}
		System.out.println("\n------------------------------");
		// Entry
		for (Entry<Object, Object> mEntry : map.entrySet()) {
			System.out.println(mEntry.getKey() + ":" + mEntry.getValue());
		}
		System.out.println("\n------------------------------");

		// 迭代器
		for (Iterator<Entry<Object, Object>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
			System.out.print(iterator.next().getValue());
		}

		// 引入guava
		HashMap<Object, Object> objectObjectHashMap = Maps.newHashMap();


	}

}
