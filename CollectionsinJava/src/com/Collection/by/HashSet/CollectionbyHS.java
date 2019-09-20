package com.Collection.by.HashSet;

import java.util.HashSet;

public class CollectionbyHS {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>(); //Declaration :This HashSet will now store the Integer class objects only
		hs.add(12);
		hs.add(1);
		hs.add(12);  //Note : duplicate object stored
		hs.add(-122);
		for(Integer i:hs) {   //for each i, get Integer objects from hs
			System.out.println(i); //print each Integer object
		}
	}

}
