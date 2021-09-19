package ArrayListConcepts;

import java.util.ArrayList;

public class VirtualCapacityConcept {

	public static void main(String[] args) {
		
		ArrayList<Object> ar =new ArrayList<Object>(20); //VC=10, PC=0
		
		System.out.println(ar.size());// Physical Capacity=0
		
		ar.add(100);
		
		System.out.println(ar.size());// Physical Capacity=1
		
		ar.add(200);
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());// Physical Capacity=4
	}

}
