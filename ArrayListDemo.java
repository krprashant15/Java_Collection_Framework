package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {


		//dynamic array
		
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);//0
		ar.add(200);//1
		ar.add("ArrayList");//2
		ar.add('P');//3
		ar.add(100.50);//4
		ar.add(true);//5
		
		System.out.println(ar);
		//System.out.println(ar.get(6)); //java.lang.IndexOutOfBoundsException
		
		System.out.println(ar.size());
		System.out.println("LOwest Index= " + 0);
		System.out.println("Highest Index= " + (ar.size()-1));
		
		ar.add(1000);//6
		ar.add(3000);//7
		System.out.println(ar.size());
		
		//List with other collection
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40)); 
		System.out.println(numbers);
	}

}
