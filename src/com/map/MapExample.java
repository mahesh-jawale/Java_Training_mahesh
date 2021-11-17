package com.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args)
	{

		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		System.out.println(hm.put(1,"mahesh"));
		System.out.println(hm.put(88,"nilesh"));
		System.out.println(hm.put(99,"ganesh"));
		System.out.println(hm.put(44,"ramesh"));
		System.out.println(hm);
		Map m = Collections.synchronizedMap(hm);
		System.out.println(m);
		
	
		

	}

}
