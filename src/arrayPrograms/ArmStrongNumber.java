package arrayPrograms;

import java.util.Scanner;

public class ArmStrongNumber {

	
	/*An Armstrong number (also called a Narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.*/
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the int Number -------------------- ");
		
		int num=sc.nextInt();
		
		sc.close();
		
		if(isArmstrong(num))
			
			System.out.println(num+" is an armstrong number");
		
		else
			
			System.out.println(num+" is not an armstrong number");
	}
	
	public static boolean isArmstrong(int n)
	{
		
		int tempNum=n;
		
		int digits=0;
		
		int res=0;
		
		
		while(n>0)
		{
			@SuppressWarnings("unused")
			int temp=n%10;
			
			digits++;
			
			n=n/10;
		}
		n=tempNum;
		
		while(n>0)
		{
			int temp=n%10;
			
			int sq=(int)Math.pow(temp, digits);
			
			res+=sq;
			
			n/=10;
			
		}
		
		return tempNum==res;
	}
}
