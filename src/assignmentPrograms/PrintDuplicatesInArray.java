package assignmentPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintDuplicatesInArray {

	
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
		
		System.out.print("Duplicated Numbers are ");
		// Entry is an Interface present in Map Interface.
		
		for(Entry<Integer,Integer> map:hash.entrySet())
		{
			
			// Checking if occurrence is more than 1, then print the Number
			if(map.getValue()>1)
				
				System.out.print(map.getKey()+" ");
		}
	}
}
