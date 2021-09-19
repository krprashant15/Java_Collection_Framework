package ArrayListConcepts;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> markslist =new ArrayList<Integer>();
		markslist.add(100);
		System.out.println(markslist);
		
		ArrayList<Double> doub =new ArrayList<Double>();
		doub.add(100.50);
		System.out.println(doub);
		
		ArrayList<String> stdnames =new ArrayList<String>();
		stdnames.add("Jerry");
		System.out.println(stdnames);

	}

}
