package com.altafjava.main;

import java.util.ArrayList;
import com.altafjava.cal.AltafArrayList;

public class Test {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList<>();
		AltafArrayList list = new AltafArrayList();
		
		System.out.println(list);// []
		list.add("hello");
		list.add(78.65);
		list.add(true);
		list.add('A');
		list.add(25);
		list.add(56.5f);
		System.out.println(list);// [hello, 78.65, true, A, 25, 56.5]
		list.remove(5);
		list.remove("hello");

		System.out.println(list);// [78.65, true, A, 25]

	}
}
