package com.Collection.by.LinkedHashSet;

import java.util.LinkedHashSet;

public class CollectionbyLHS {
public static void main(String[] args) {
	LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>();
	linkedHashSet.add(100);
	linkedHashSet.add(-1);
	linkedHashSet.add(-45);
	linkedHashSet.add(645);
	linkedHashSet.add(1);
	for(Integer i:linkedHashSet) {
		System.out.println(i);
	}
}
}
