package collectionPrograms;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionPracticeProgram1 {

	
	public static void main(String[] args) {
		
		Collection col=new ArrayList();
		
		col.add("SOhan");
		
		col.add(12);
		
		col.add(true);
		
		col.add(34.5);
		
		col.add(null);
		
		
		System.out.println("Before removing data, Collection is :"+col);
		
		col.remove(null);
		
		System.out.println("------------------------------------------------");
		
		System.out.println("After removing Data, Collection is "+col);
		
		System.out.println("Size of Collection is "+col.size()+".");
		
		System.out.println("The elements present in the Collection are ");
		
		for(Object obj:col)
		{
			System.out.println(obj);
		}
	}
}
