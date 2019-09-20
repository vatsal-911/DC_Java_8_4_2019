package com.Collection.by.TreeSet;

import java.util.TreeSet;

public class CollectionbyTreeSet {
public static void main(String[] args) {
	TreeSet<Integer> tree=new TreeSet<Integer>();
	tree.add(1);
	tree.add(-1);
	tree.add(-2);
	tree.add(-19);
	tree.add(76);
	tree.add(9);
	
	for (Integer i : tree) {
		System.out.println(i);
	}
}
}
