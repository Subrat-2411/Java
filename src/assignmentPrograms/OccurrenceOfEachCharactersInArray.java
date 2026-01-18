package assignmentPrograms;


import java.util.LinkedHashMap;

public class OccurrenceOfEachCharactersInArray {

	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,1,2,3,4};
		
		LinkedHashMap<Integer,Integer> hash=new LinkedHashMap<Integer, Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			
			if(hash.containsKey(a[i]))
				
				hash.put(a[i],hash.get(a[i])+1);
			
			else
				
				hash.put(a[i],1);
			
		}
		
		
		System.out.println(hash);
	}
}
