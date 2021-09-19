package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
		//1.Collections.synchronizedList
		
		List<String> namelist= Collections.synchronizedList(new ArrayList<String>());
		namelist.add("Java");
		namelist.add("C");
		namelist.add("Python");
		namelist.add("PHP");
		
		
		//add, remove- we dont need explicit synchronization.
		//to fetchthe value from the List we need to use explicit synchronization.
		
		synchronized (namelist) {
			Iterator<String> it=namelist.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		}
		
		//2.copyOnWriteArrayList-- class --ThreadSafe--synchronized already
		CopyOnWriteArrayList<String> empname= new CopyOnWriteArrayList<String>();
		
		empname.add("Tom");
		empname.add("Jerry");
		empname.add("Elice");
		
		System.out.println("#######################");
		
		//Here we dont need any explicit synchronization for any operation: add,remove,traverse
		
		Iterator<String> itr=empname.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
