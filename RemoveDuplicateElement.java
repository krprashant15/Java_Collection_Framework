package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,7));
		
		//1 LinkedHashSet
		
		LinkedHashSet<Integer> linkedHashset= new LinkedHashSet<Integer>(numbers);
		System.out.println(linkedHashset);
		ArrayList<Integer> withoutDuplicatenumbers= new ArrayList<Integer>(linkedHashset);
		System.out.println(withoutDuplicatenumbers);
		
		
		//2. JDK8- Streams
		
		System.out.println("################################");
		
		ArrayList<Integer> marksList= new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,7));
		List<Integer>result= marksList.stream().distinct().collect(Collectors.toList());
		
		System.out.println(result);
		

	}

}
