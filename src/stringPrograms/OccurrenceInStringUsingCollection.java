package stringPrograms;

import java.util.LinkedHashMap;

/*Count the no of Character Occurrence in a String using Collection*/
public class OccurrenceInStringUsingCollection {

	public static void main(String[] args) {

		String s = "aabbcddffaa";

		/*
		 * Stores data in key–value pairs
		 * 
		 *  ✔ Maintains insertion order (unlike HashMap) 
		 *  
		 *  ✔Does not allow duplicate keys 
		 *   
		 *  ✔ Replaces old value if key already exists
		 */

		LinkedHashMap<Character, Integer> list = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			// if the character is present in the LinkedHashMap
			
			if (list.containsKey(ch))

				// count the Occurrence and Store it 
				list.put(ch, list.get(ch) + 1);

			else
				// count the Occurrence as 1 and Store it 
				list.put(ch, 1);
		}

		System.out.println(list);

	}
}
