package HashmapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapBasics {

	public static void main(String[] args) {

		 //no ordered- no indexing
		//stores value ==Key- Value <k,v>
		//key cant be duplicate
		//can store n no of null value but only one null key
		//hashmap is not thread safe -unsynchronized
		
		HashMap<String, String> map1= new HashMap<String, String>();
		map1.put("India", "NewDelhi");
		map1.put("USA", "Washington DC");
		map1.put("UK", "London");
		map1.put("UK", "London11");
		map1.put(null, "Berlin");
		map1.put(null, "LA");
		
		map1.put("Russia",null);
		map1.put("Srilanka",null);
		
		System.out.println(map1.get("USA"));
		System.out.println(map1.get("Germany"));//as we dont have Germany as key so will get--null
		
		System.out.println(map1.get("UK"));// key is duplicate over here but it will give you the latest value 
		
		System.out.println(map1.get(null));
		
		System.out.println(map1.get("Srilanka"));//null
		
		System.out.println("########################");
		
		
		//Iterator over the key: by usng keyset()
		Iterator<String>it= map1.keySet().iterator();
		while(it.hasNext()) {
			String key= it.next();
			String value= map1.get(key);
			System.out.println("key = " + key + " value = " + value);
		}
		System.out.println("########################");
		//Iterator over the set (pair): by usng entryset()
		Iterator<Entry<String, String>> it1=map1.entrySet().iterator();
		
		while(it1.hasNext()) {
			Entry<String, String>entry= it1.next();
			System.out.println("key ="+ entry.getKey() + " and Value = " +entry.getValue());
			
		}
		
		//iterate hashmap using java8 for each and  lambda
		System.out.println("########################");
		map1.forEach((k,v) -> System.out.println("key = "+ k +" and value = "+ v));
		
		
		
		
		
		
		
		
		
	}

}
