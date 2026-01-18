package arrayPrograms;

import java.util.Scanner;

public class PallindromeStringPracticeTest {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String Value :");
		
		String st=sc.next();
		
		sc.close();
		
		if(isPallindrome(st))
			System.out.println(st+" is a Pallindrome String.");
		
		else
			System.out.println(st+" is not a Pallindrome String");
	}
	
	public static boolean isPallindrome(String s)
	{
		s=s.toLowerCase();
		
		int length=s.length()-1;
		
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(length--))
				return false;
		}
		
		return true;
	}
}
