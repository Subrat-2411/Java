package arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAndSortArray {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the Array");
		
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the elements of the Array");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		sc.close();
		
		a=reverseAndSort(a);
		
		System.out.println(Arrays.toString(a));
	}

	private static int[] reverseAndSort(int[] a) {
		
		
		int start=0;
		
		int end=a.length-1;
		
		
		while(start<end)
		{
			int temp=a[start];
			
			a[start]=a[end];
			
			a[end]=temp;
			
			start++;
			end--;
		}
		
		Arrays.sort(a);
		
		return a;
	}
}
