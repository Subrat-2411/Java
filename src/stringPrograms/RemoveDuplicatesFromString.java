package stringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {

	
	public static void main(String[] args) {
		
		String s="aabbabac";
		
		
		
		LinkedHashSet<Character> hash=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			
			hash.add(s.charAt(i));
		}
		
		System.out.println("Original String :"+s);
		
		System.out.println("After removing Duplicates, the String is "+hash);
		
		
	}
}
