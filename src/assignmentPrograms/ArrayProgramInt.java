package assignmentPrograms;

import java.util.Arrays;
import java.util.TreeSet;

public class ArrayProgramInt {
	
	

	
	public static void main(String[] args) {
		
		int a[]= {10,30,40,56,60,30,40};
		
		System.out.println(Arrays.toString(a));
		
		TreeSet<Integer> set=new TreeSet<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>10)
			{
				a[i]*=2;
				
//				System.out.println(" a[i]: "+a[i]);
				
				set.add(a[i]);
				
			}
		}
		
		
		for(int ele:set)
		{
			System.out.print(ele+" ");
		}
		
	}
}
