package Questions;

public class ArmstrongNumber {
	
	//153
	//cubes of every digit i.e 1*1*1, 5*5*5,3*3*3
	//1+125+27=153
	
	//407 == 164+0+363=407
	
	public static void isArmstrongNumber(int num){
		System.out.println("The Given number is " + num);
		int cube=0;
		int rem;
		int temp;
		
		temp=num;
		
		while(num>0) {
			rem=num % 10;
			num=num / 10;
			cube = cube +(rem*rem*rem);
		}
		
		if(temp==cube) {
			System.out.println("This is Armstrong number");
		}
		else {
			System.out.println("This is not Armstrong number");
			
		}
		
	}
	
	public static void main(String[] args) {
		isArmstrongNumber(153);
		isArmstrongNumber(407);
		isArmstrongNumber(111);
		isArmstrongNumber(0);
	}

}
