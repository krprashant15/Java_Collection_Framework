package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		
		ArrayList<String> stdnames =new ArrayList<String>();
		stdnames.add("Jerry");//0
		stdnames.add("Tom");//1
		stdnames.add("Prashant");//2
		stdnames.add("Kumar");//3
		
		//For Loop
		for(int i=0; i<stdnames.size();i++) {
			System.out.println(stdnames.get(i));
		}
		
		
		System.out.println("#########################");
		//For each loop
		
		for(String s: stdnames) {
			System.out.println(s);

		}
		
		System.out.println("#########################");
		//JDK-8 stream with Lambda 
		stdnames.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("#########################");
		//Iterator
		Iterator<String>itr= stdnames.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
