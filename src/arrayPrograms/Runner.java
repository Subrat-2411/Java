package arrayPrograms;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input");
		String str=sc.next();
		sc.close();
		  System.out.println(reverse(str));
	}
	
	public static String reverse(String s)
	{
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		
		return rev;
	}
}
