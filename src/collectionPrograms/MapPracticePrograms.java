package collectionPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapPracticePrograms {

	
	public static void main(String[] args) {
		
		Map<Object,Object> map=new HashMap<Object,Object>();
		
		map.put("java", 1);
		
		map.put("Selenium", 7);
		
		map.put("Testng", 18);
		
		map.put("API", 45);
		
		map.put("*", 56);
		
		map.put(12, "RestAssured");
		
		System.out.println("Size of Map is "+map.size());
		
		System.out.println("Keys present in map are "+map.keySet());
		
		System.out.println("Values present in map are "+map.values());
		
		System.out.println("Check key java is present? "+map.containsKey("java"));
		
		System.out.println("Check value 56 is present? "+map.containsValue(56));
		
		System.out.println("Value of key java is "+map.get("java"));
		
		for(Entry<Object,Object> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+"            ---->            "+entry.getValue());
		}


	}
}
