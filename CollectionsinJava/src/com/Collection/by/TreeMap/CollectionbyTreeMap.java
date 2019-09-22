package com.Collection.by.TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class CollectionbyTreeMap {
public static void main(String[] args) {
 
	TreeMap<Integer, String> treeMap=new TreeMap<Integer, String>();
    
	treeMap.put(-2, "hello");
    treeMap.put(1, "world");
    treeMap.put(0, null);
    
    Set<Integer> all=treeMap.keySet();
    
    for (Integer i : all) {
		System.out.println("The key is "+i);
		System.out.println("The value is -"+treeMap.get(i));
	}
}
}
