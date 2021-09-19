package HashmapConcepts;

import java.util.HashMap;
import java.util.Map;

public class HashmapConcept {

	public static void main(String[] args) {

		//Hashing- hashcode()---> hashing 
		
		Map<String, Integer> marks= new HashMap<String, Integer>();
		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peeter", 400);
		marks.put("Robby", 600);
		
		marks.put(null, 500);
		
		System.out.println(marks.get("Lisa"));
		//hashcode of Lisa-210678
		//index =15
		//.equals to check key name 
		//returns value
	}

}
