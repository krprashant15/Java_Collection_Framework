package Questions;

public class ReverseString {

	public static void main(String[] args) {
		
		
		String s = "Prashant"; //string is immutable so reverse function is not available.
		
		//using for loop
		
		int len=s.length(); //----8
		String rev="";
		//System.out.println(len);
		
		for(int i= len-1; i>=0; i--) {
			rev= rev+ s.charAt(i);//tnahsarP
			
		}
		
		System.out.println(rev);
		
		//using StringBuffer class
		StringBuffer sf = new StringBuffer(s);// StringBuffer is mutable
		System.out.println(sf.reverse());

	}

}
