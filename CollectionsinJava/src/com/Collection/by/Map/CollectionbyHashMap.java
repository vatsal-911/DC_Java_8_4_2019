package com.Collection.by.Map;

import java.util.HashMap;
import java.util.Set;

public class CollectionbyHashMap {
public static void main(String[] args) {
	
	HashMap<Integer, String> hash=new HashMap<Integer, String>();
	
	hash.put(0, "my");
	hash.put(1, "name");
	hash.put(2, "is");
	hash.put(3, "Vatsal");
	hash.put(4, "tewari");
	
	Set<Integer> set_hm= hash.keySet();
	for (Integer i : set_hm) {
		System.out.println("Key is "+i); //prints keys
		System.out.println(hash.get(i)); //prints values
		
	}
}
}
