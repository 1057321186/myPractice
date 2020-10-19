package com.project.collection;

import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		Map<String,String> map = new HashMap<String,String>();
		Set set = new HashSet<>();
		list.add(0, "a");
		list.add(1, "b");
		list.add(2, "c");
		list.add(3, "d");
		/*
		 * 遍历
		 */
		for (Object list2 : list) {
			System.out.println(list2);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String sg = iterator.next();
			if (sg.contains("c")) {
				iterator.remove();
			}
		}
		System.out.println("------------map-------------");
		map.put("key1", "a");
		map.put("key2", "b");
		map.put("key3", "c");
		map.put("key4", "d");
		for(Object object:map.keySet()){
			System.out.println(map.get(object));
		}
	
		for(Entry<String, String> entry:map.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		for(Iterator<Entry<String, String>> iterator=map.entrySet().iterator();iterator.hasNext();){
			//System.out.println(iterator.next().getKey()+":"+iterator.next().getValue());
			System.out.println(iterator.next());
		}
		
		
		System.out.println("------------set-------------");
		
		
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		
		for(Object object:set){
			System.out.println(object);
		}
		for(Iterator<String> sIterator=set.iterator();sIterator.hasNext();){
			System.out.println(sIterator.next());
		}
	}
}
