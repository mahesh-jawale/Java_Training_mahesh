package com.arraylist;

import java.util.ArrayList;

public class ArrayListExample
{

	public static void main(String[] args)
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Ram");
		a.add("Sham");
		a.add("Ravan");
		a.add("Ravan");
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.add(1, "Sita");
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.indexOf("Sita"));
		System.out.println(a.contains("Hanuman"));
		System.out.println(a.get(0));
		System.out.println(a.isEmpty());
		a.add("Hanuman");
		System.out.println(a);
		
		

	}

}


