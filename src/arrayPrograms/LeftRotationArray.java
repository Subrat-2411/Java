package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotationArray {

	
	public static void main(String[] args) {
		
		int []a= {10,20,30,40,50};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the no of iterations ");
		
		int n=sc.nextInt();// no of rotations
		
		for(int i=1;i<=n;i++)// iterate for given no of rotations
		{
			int temp=a[0];
			
			for(int j=0;j<a.length-1;j++)
			{
				
				a[j]=a[j+1];
				
			}
			
			a[a.length-1]=temp;
		}
		
		System.out.println(Arrays.toString(a));
		
		sc.close();
	}
}
