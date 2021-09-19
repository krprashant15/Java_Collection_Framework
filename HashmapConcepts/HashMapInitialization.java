package HashmapConcepts;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {
	
	public static Map<String, Integer> marksMap;
	
	static {
		marksMap= new HashMap<>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
	}

	public static void main(String[] args) {
		
		//1 using hashmap class
		
		HashMap<String, String> map1= new HashMap<>();
		Map<String, String> map2= new HashMap<>();
		
		//2 Static way : static hashmap
		
		System.out.println(HashMapInitialization.marksMap.get("A"));//java.lang.NullPointerException
		//why bcz we havent initialized marksMap.
		
		//3 immutablemap using one single entry
		 Map<String, Integer> map3=Collections.singletonMap("test", 100); //this singletonMap will have only one entry
		 System.out.println(map3.get("test"));
		// map3.put("abc", 200);//Exception in thread "main" java.lang.UnsupportedOperationException
		 
		 //4 jdk 8
		 //creating one 2d string array using stream and collecting inn the form of map
		 Map<String, String> map4= Stream.of(new String [][] {
			 {"Tom","A Grade"},
			 {"Kumar","A+ Grade"},
		 }).collect(Collectors.toMap(data -> data[0], data -> data[1]));
			 
		 System.out.println(map4.get("Tom"));
		 map4.put("Lisa", "A++ Grade");
		 System.out.println(map4.get("Lisa"));
		 
		 //using simple entry: Imutable map
		 
		 Map<String, String> map5= Stream.of(
				 new AbstractMap.SimpleEntry<>("Naveen", "Java"),
				 new AbstractMap.SimpleEntry<>("Kumar", "Python")
				 
		).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue ));
		 
		 System.out.println(map5.get("Kumar"));
		 
		 //jdk 1.9
		 //empty map
//		 Map<String, String>emptyMap= Map.of();
//		 emptyMap.put("TOm", "Python");
//		 System.out.println(map5.get("TOm"));
		 
//		 Map<String, String>singletonMap= Map.of("k1","v1");
//		 System.out.println(singletonMap.get("k1"));
//		 System.out.println(singletonMap.put("k2","v2"));////Exception in thread "main" java.lang.UnsupportedOperationException
		 
		//multi valuemap--max 10 key value pairs support
		 
//		 Map<String, String>multiMap= Map.of("k1","v1","k2","v2","k3","v3");
//		 System.out.println(multiMap.get("k3"));
		 
		 //maps using google Guava library
		 //Map<String, String>titleMap=ImmutableMap.of("Google","Google","Amazon","Amazon Shopping");
		 //System.out.println(titleMap.get("Amazon"));
		 
		 
		 }
	}


