package com.Collection.by.ArrayList;

import java.util.ArrayList;

public class CollectionbyArrayList {
public static void main(String[] args) {
	ArrayList<Integer> a=new ArrayList<Integer>();
	a.add(1);
	a.add(1);
	a.add(-2);
	a.add(-22);
	a.add(12);
	for (Integer i : a) {
		System.out.println(i);
	}
}
}
