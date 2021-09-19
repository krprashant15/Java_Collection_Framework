package HashmapConcepts;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) {
		
		HashMap<String, Integer> compMap= new HashMap<String, Integer>();
		
		compMap.put("Google", 10000);
		compMap.put("Google", 11000);
		compMap.put("Facebook", 20000);
		compMap.put("Amazon", 30000);
		compMap.put("Cisco", 25000);
		compMap.put("Walmart", 15000);
		
		System.out.println("compMap size ="+ compMap.size());
		
		Iterator itr= compMap.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry pairs= (Map.Entry) itr.next();
			System.out.println(pairs.getKey()+ " " + pairs.getValue());
			
		}
		
		//using lambda
		
		System.out.println("################");
		compMap.forEach((k,v) -> System.out.println("key = " + k + " value = " +v));
		
		
		
		System.out.println("################");
		//convert hashmapkeys into arraylist
		java.util.List<String> compNamesList= new ArrayList<String>(compMap.keySet());
		System.out.println(compNamesList);
		for(String t: compNamesList) {
			System.out.println(t);
		}
		
		//convert hashmapValue into arraylist
		System.out.println("################");
		java.util.List<Integer> compEmpCountList= new ArrayList<Integer>(compMap.values());
		System.out.println(compEmpCountList);
		for(Integer t1: compEmpCountList) {
			System.out.println(t1);
		}
		
	}

}
