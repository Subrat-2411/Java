package arrayPrograms;

public class MaximumAndMinimumElementInArray {

	
	public static void main(String[] args) {
		
		int []a= {10,20,30,40,50};
		
		int max=a[0];
		
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			
			else if(a[i]<min)
				min=a[i];
		}
		
		System.out.println("Maximum element in the array is "+max);
		
		System.out.println("Minimum element in the array is "+min);
	}
	
}

// india - I  + ndia n-1== India
