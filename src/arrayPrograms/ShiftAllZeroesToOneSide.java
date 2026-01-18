package arrayPrograms;

import java.util.Arrays;

public class ShiftAllZeroesToOneSide {

	
	public static void main(String[] args) {
		
		int[] a= {0,7,1,0,4,5,6};
		
		 
		// to store non-zero elements
		int []b=new int[a.length];
		// Bydefault zero will be there at all postions
		int index=b.length-1;
		
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]!=0)
				b[index--]=a[i];
		}
		
		System.out.println(Arrays.toString(b));
		
		
	}
}
