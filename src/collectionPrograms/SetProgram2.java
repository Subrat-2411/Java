package collectionPrograms;

import java.util.*;

public class SetProgram2 {

	public static void main(String[] args) {
		
		LinkedHashSet set=new LinkedHashSet();
		
		set.add(true);
		
		set.add(34);
		
		set.add("String");
		
		
		System.out.println(set);
		
		
		System.out.println(set.getFirst());
		
		System.out.println(set.getLast());
		
		
	}
}
