package com.project.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		
		//Hashset 它不保证集合的迭代顺序；特别是它不保证该顺序恒久不变。
		//LinkedHashSet定义了迭代顺序，即按照将元素插入到集合中的顺序（插入顺序）进行迭代		
		
		Set<String> set=new HashSet<String>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		
		//遍历
		for(String string:set){
			System.out.print(string+" ");
		}
		//遍历
		for(Iterator<String> iterator=set.iterator();iterator.hasNext();){
			System.out.print(iterator.next()+" ");
		}
		Set<String> set2=new LinkedHashSet<>();
		set2.add("a");
		set2.add("b");
		set2.add("c");
		set2.add("d");
		for(String strin:set2){
			System.out.print(strin+" ");
		}
		
	}
	
}
