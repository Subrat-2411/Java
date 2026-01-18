package arrayPrograms;

import java.util.Arrays;

public class SumOfTwoArrays {

	
	public static void main(String[] args) {
		
		int[] a= {10,20,30,40,50,60};
		
		int[] b= {10,20,30,40,50,60};
		
		int max=Math.max(a.length,b.length);
		
		int[] sum=new int[max];
		
		for(int i=0;i<max;i++)
		{
			if(i<a.length)
				sum[i]+=a[i];
			
			if(i<b.length)
				sum[i]+=b[i];
		}
		
		System.out.println(Arrays.toString(sum));
	}
}
