package com.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
	
		HashSet<String> hs=new HashSet<String>();
		hs.add("Ram");
		hs.add("Sham");
		hs.add("Sita");
		hs.add("Hanumaan");
		hs.add("Ram");
		System.out.println(hs);
		System.out.println(hs.contains("Ram"));
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs.remove("Sham");
		System.out.println(hs);
		
		//Iterator
		Iterator<String> i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	

	}

}
