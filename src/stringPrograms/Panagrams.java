package stringPrograms;

import java.util.HashSet;

public class Panagrams {

	
	public static void main(String[] args) {
		
		String s="The Quick Brown Fox jumps over the lazy dog";
		
		s=s.toLowerCase();
		
		HashSet<Character> hs=new HashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			
			hs.add(s.charAt(i));
		}
		
		if(hs.size()==26)
			System.out.println(s+" is a Panagram");
		
		else
			
			System.out.println(s+" is not a Panagram");
	}
}
