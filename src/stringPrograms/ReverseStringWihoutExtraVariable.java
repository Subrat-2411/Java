package stringPrograms;

/*This class contains code to Reverse the String without the help of an extra variable.*/

public class ReverseStringWihoutExtraVariable {

	
	public static void main(String[] args) {
		
		String s="Sohan";
		
		System.out.println("Original String is "+s);
		
		System.out.print("Reverse String is ");
		
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			
			System.out.print(ch);
			
		}
		
		
		
		
	}
}
