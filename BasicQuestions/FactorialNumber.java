package Questions;

public class FactorialNumber {
	
	//factorial of 3 =3*2*1=6
	//factorial of 4= 4*3*2*1=24
	//factorial of 1 = 1
	//factorial of 0 = 1
	
	//1 without recursion -- for loop
	
	public static int factorial(int num) {
		int fact=1;
		if(num==0) 
			return 1;
		
		for(int i=1;i<=num;i++) {
			fact= fact*i;
		}
		return fact;
	}
	
	//with recursive function
	
	public static int fact(int num) {
		if(num==0) 
			return 1;
		
		else
			return(num * fact(num-1));
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("The factorial of 4 is " +factorial(4));
		System.out.println("The factorial of 1 is " +factorial(1));
		System.out.println("The factorial of 0 is " +factorial(0));
		System.out.println("The factorial of 5 is " +factorial(5));
		
		System.out.println("The factorial of 3 is " +fact(3));
		System.out.println("The factorial of 5 is " +fact(5));
		System.out.println("The factorial of 10 is " +fact(10));
		System.out.println("The factorial of 1 is " +fact(1));
		System.out.println("The factorial of 0 is " +fact(0));
		
	}

}
