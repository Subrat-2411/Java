package collectionPrograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionPracticeListProgram {

	
	public static void main(String[] args) {
		
		
		List list1=new LinkedList();
		
		list1.add("Sohan");
		
		
		list1.add(null);
		
//		list.addFirst("hui");
		
		System.out.println(list1.size());
		
		
		System.out.println(list1);
		
		List list2=new ArrayList();
		
		list2.add("Ramesh");
		
		list1.addAll(list2);
		
		System.out.println("After adding the Collection :"+list1);
		
		System.out.println(list1.get(1));
	}
}
