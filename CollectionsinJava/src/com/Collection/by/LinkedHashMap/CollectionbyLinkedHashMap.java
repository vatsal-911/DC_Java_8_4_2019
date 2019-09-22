package com.Collection.by.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

public class CollectionbyLinkedHashMap {
public static void main(String[] args) {
	
	LinkedHashMap<Integer, Character> linked_hm=new LinkedHashMap<Integer, Character>();
	
	linked_hm.put(1, 'a');
	linked_hm.put(2, 's');
	linked_hm.put(3, 'g');
	linked_hm.put(4, 'a');
	linked_hm.put(5, 'r');
	linked_hm.put(6, 'd');
	
	Set<Integer> all=linked_hm.keySet();
	
	for (Integer i : all) {
		System.out.println("The key is "+i);
		System.out.println("The value is -" +linked_hm.get(i));
	}
}
}
