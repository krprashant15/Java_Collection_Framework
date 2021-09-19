package Questions;

public class PalindromeNumber {
	
	//151 454 34543 161 78987
	
	public static void isPalindromeNumber(int num) {
		System.out.println("Given number is "+ num);
		int rem=0;
		int sum=0;
		int temp;
		
		temp=num;
		
		while(num>0) {
			rem=num % 10; //to get the reminder
			sum=(sum*10)+rem;
			num=num/10;
		}
		
		if(temp==sum) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not a Palindrome number");
		}
		
	}
	
	
	public static void main(String[] args) {
		isPalindromeNumber(151);
		isPalindromeNumber(150);
	

	}

}
