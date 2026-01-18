package arrayPrograms;

import java.util.Scanner;

public class CompileTimePolymorphism {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the int amount ");
		
		int num=sc.nextInt();
		
		System.out.println("Enter the double amount ");
		
		double d=sc.nextDouble();
		
	     payment(num);
		
		 payment(d);
		
		
	}
	
	public static void payment(int amount)
	{
		String mode="Cash";
		
		System.out.println("Payment of "+amount+" is done using "+mode);
	}
	
	
	public static void payment(double amount)
	{
		String mode="UPI";
		
		System.out.println("Payment "+amount+" is done using "+mode);
	}
	
	
}
