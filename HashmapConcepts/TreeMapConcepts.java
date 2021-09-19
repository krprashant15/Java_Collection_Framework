package HashmapConcepts;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcepts {

	public static void main(String[] args) {
		
		
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(2000, "Tom");
		map.put(1500, "Peter");
		map.put(3000, "Steve");
		map.put(6000, "Jerry");
		map.put(7000, "Kumar");
		
		System.out.println(map);
		
		map.forEach((k,v) -> System.out.println("key = " + k + " value = " +v));
		
		System.out.println(map.lastKey());
		
		Set<Integer>keylessthan6k=map.headMap(6000).keySet();
		System.out.println(keylessthan6k);
		
		Set<Integer>keygrtrthan6k=map.tailMap(6000).keySet();
		System.out.println(keygrtrthan6k);
		
		System.out.println("#####################");
		
		TreeMap<String, Integer > map1 = new TreeMap<>();
		map1.put( "Tom",100);
		map1.put("Peter",200);
		map1.put( "Steve",400);
		map1.put( "Jerry",600);
		map1.put( "Kumar",700);
		map1.put( "Brad",900);
		
		map1.forEach((k,v) -> System.out.println("key = " + k + " value = " +v));
		
		
		System.out.println("#####################");
		
		TreeMap<Integer, String> map3 = new TreeMap<>(Comparator.reverseOrder());
		map3.put(2000, "Tom");
		map3.put(1500, "Peter");
		map3.put(3000, "Steve");
		map3.put(6000, "Jerry");
		map3.put(7000, "Kumar");
		
		System.out.println(map3);
	}

}
