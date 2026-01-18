package arrayPrograms;

import java.util.Scanner;

public class PrimeNumber {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Input :");
		
		int input=sc.nextInt();
		
		sc.close();
		
		if(isPrime(input))
			System.out.println(input+" is a Prime Number.");
		
		else
			System.out.println(input+" is not a Prime Number.");
	}

	private static boolean isPrime(int input) {
		
		if(input<=1)
			return false;
		
		for(int i=2;i<input/2;i++)
		{
			if(input%i==0)
				return false;
		}
		return true;
	}
}
