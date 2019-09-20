package com.Collection.by.LinkedList;

import java.util.LinkedList;

public class CollectionbyLinkedList {
public static void main(String[] args) {
	LinkedList<Integer> linkedlist=new LinkedList<Integer>();
	linkedlist.add(1);
	linkedlist.add(1);
	linkedlist.add(-2);
	linkedlist.add(-22);
	linkedlist.add(12);
	for (Integer i : linkedlist) {
		System.out.println(i);
	}
}
}
