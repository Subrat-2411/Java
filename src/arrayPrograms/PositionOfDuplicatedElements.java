package arrayPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PositionOfDuplicatedElements {

	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,20,60,10};
		
		
		LinkedHashMap<Integer,ArrayList<Integer>> hash=new LinkedHashMap<Integer, ArrayList<Integer>>();
		
		
		for(int i=0;i<a.length;i++)
		{
			
			// Checking key(number) is present or not 
			if(hash.containsKey(a[i]))
				
				// Adding the index for that key
				hash.get(a[i]).add(i);
			
			else
				
				// Adding the element into the LinkedHashMap 
				
				//new ArrayList() creates a brand-new empty list so you can store the first index of that specific number.
				/*10 → [0, 6]
				 * 
				20 → [1, 4]
				
				30 → [2]*/
				
				hash.put(a[i],new ArrayList<Integer>());
		}
		
		for(Entry<Integer,ArrayList<Integer>> map:hash.entrySet())
		{
			
			if(map.getValue().size()>0)
				
				System.out.println(map.getKey()+" -> "+map.getValue());
		}
		
		
	}
}
