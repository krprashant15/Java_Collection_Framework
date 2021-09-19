package Questions;

public class PrimeNumber {
	
	//2 is the lowest prime no
	//3
	//num=20 i mean between 1 to 20 how many prime numbers are there
	
	public static boolean isPrimeNumber(int num) {
		//edge/ corner case
		if(num<=1) {
			return false;
			
		}
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void getPrimeNumbers(int num){
		for(int i=2;i<=num;i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i +" ");
			}
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("2 is prime number: "+ isPrimeNumber(2));
		System.out.println("3 is prime number: "+ isPrimeNumber(3));
		System.out.println("10 is prime number: "+ isPrimeNumber(10));
		System.out.println("17 is prime number: "+ isPrimeNumber(17));
		
		System.out.println("0 is prime number: "+ isPrimeNumber(0));
		System.out.println("1 is prime number: "+ isPrimeNumber(1));
		System.out.println("-2 is prime number: "+ isPrimeNumber(-2));
		System.out.println("-3 is prime number: "+ isPrimeNumber(-3));
		
		getPrimeNumbers(20);
		
	}

}
