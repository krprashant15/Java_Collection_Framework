package HashmapConcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSynchronization {

	public static void main(String[] args) {
		
		//synchronizedMap method of collections class.
		
		Map<String, String> map1= new HashMap<String, String>();
		map1.put("1", "Kumar");
		map1.put("2", "Tom");
		map1.put("3", "Lisa");
		//Now its not thread safe 
		//create synchronizedMap
		
		Map<String, String> syncMap=Collections.synchronizedMap(map1);
		
		System.out.println(syncMap);

		//concurrentHashmap--it doesnt throw any ConcurrentModificationException
		
		ConcurrentHashMap<String, String> concurMap= new ConcurrentHashMap<>();
		concurMap.put("A", "Java");
		concurMap.put("B", "Python");
		concurMap.put("C", "PHP");
		
		System.out.println(concurMap.get("B"));
		
		
		
	}

}
