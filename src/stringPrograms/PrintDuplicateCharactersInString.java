package stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintDuplicateCharactersInString {

	public static void main(String[] args) {

		String s = "aabachgty";

		LinkedHashMap<Character, Integer> hash = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);

			if (hash.containsKey(ch))

				hash.put(ch, hash.get(ch) + 1);
			
			else
				
				hash.put(ch, 1);

		}
		
		//a set view of the mappings contained in this map : entrySet() method 
		
		for(Entry<Character,Integer> map:hash.entrySet())
		{
			
			if(map.getValue()>1)
				
			System.out.println(map.getKey());
		}
	}

}
