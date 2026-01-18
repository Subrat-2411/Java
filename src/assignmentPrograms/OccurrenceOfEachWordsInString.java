package assignmentPrograms;

import java.util.LinkedHashMap;

public class OccurrenceOfEachWordsInString {

	
	public static void main(String[] args) {
		
		String s="My name is my name is Sumanth";
		
		s=s.toLowerCase();
		
		String[] a=s.split(" ");
		
		LinkedHashMap<String,Integer> hash=new LinkedHashMap<String, Integer>();
		
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
