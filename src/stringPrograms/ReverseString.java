package stringPrograms;

/*This class contains code to Reverse the String with the help of an extra variable.*/

public class ReverseString {

	
	public static void main(String[] args) {
		
		String s="Sohan";
		
		String rev="";//Extra Variable to store reverse String value
		
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			
			rev+=ch; 
			
		}
		
		
		
				System.out.println("Before Reversing :"+s);
				
				
				System.out.println("After Reversing  :"+rev);
		
		
		
		
	}
}
