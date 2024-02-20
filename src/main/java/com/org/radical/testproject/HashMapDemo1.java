package com.org.radical.testproject;
/**
 * 
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * 
 */
public class HashMapDemo1 {

	/**
	 * Int
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();

		map.put(100, "Ritika");
		map.put(1, "ABC");
		map.put(2, "pqr");

		System.out.println(map.containsValue("Ritikka"));

		Map<Integer, String> linkedmap = new LinkedHashMap<>();

		linkedmap.put(100, "Ritika");
		linkedmap.put(1, "ABC");
		linkedmap.put(2, "pqr");

		System.out.println(linkedmap.containsKey(100));
		System.out.println(linkedmap.get(100));
		// Retrive the keys
		Set<Integer> setmap = linkedmap.keySet();
		for (Integer integer : setmap) {
			System.out.println(linkedmap.get(integer));

		}
		System.out.println(linkedmap.getOrDefault(100, "azr"));

//		for(int i=0;i<linkedmap.size();i++) {
//			System.out.println();
//		}
	}

}
