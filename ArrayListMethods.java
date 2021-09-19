package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		
		ArrayList<String> lang =new ArrayList<String>();
		lang.add("Java");
		lang.add("Python");
		lang.add("JS");
		lang.add("PHP");
		
		
		ArrayList<String> lang1 =new ArrayList<String>();
		
		lang1.add("Developement");
		lang1.add("DevOps");
		
		//addall method
		
		//lang.addAll(lang1);
//		lang.addAll(2, lang1);
//		System.out.println(lang);//[Java, Python, Developement, DevOps, JS, PHP]
//		
//		
//		//clear method
//		
//		lang.clear();
//		System.out.println(lang);
		
		//clone method
		
		ArrayList<String> clonedList=(ArrayList<String>)lang.clone();
		System.out.println(clonedList);
		
		//contains method
		System.out.println(lang.contains("Python"));
		System.out.println(lang.contains("c"));
		
		//indexof method
		System.out.println(lang.indexOf("Python"));
		
		ArrayList<String> list =new ArrayList<String>(Arrays.asList("Prashant","Tom","Prashant","Steve","Elon","Prashant"));
		System.out.println(list);
		
		int i= list.lastIndexOf("Prashant");
		System.out.println(i);
		
		list.remove(1);
		System.out.println(list);
		
		list.remove("Steve");
		System.out.println(list);
		
		
		ArrayList<Integer> numbers =new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		numbers.removeIf(num -> num%2==0);
		System.out.println(numbers);
		
		ArrayList<String> namelist =new ArrayList<String>(Arrays.asList("Prashant","Tom","Prashant","Steve","Elon","Prashant"));
		namelist.retainAll(Collections.singleton("Prashant"));
		System.out.println(namelist);
		
		ArrayList<Integer> numbers1 =new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		ArrayList<Integer> sublist =new ArrayList<Integer>(numbers1.subList(2, 8));
		System.out.println(sublist);

	}

}
