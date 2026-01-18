package arrayPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class NthMaximumAndMinimumElementInArray {

	
	public static void main(String[] args) {
		
		int []a= {10,20,30,10,40,50,56};
		
		int n=2;
		
		a=removeduplicate(a);
		
		Arrays.sort(a);
		
		System.out.println(n+" th maximum element in array is "+a[a.length-n]);
		
		System.out.println(n+" th smallest element in the array is "+a[n-1]);
	}

	private static int[] removeduplicate(int[] a) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		
		int []b=new int[hs.size()];
		
		int in=0;
		
		for(int ele:hs)
		{
			b[in]=ele;
			
			in++;
		}
		return b;
	}
}
