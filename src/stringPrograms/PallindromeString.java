package stringPrograms;

// A String and its reverse are equal, then the String is called a Pallindrome String.
public class PallindromeString {

	
	public static void main(String[] args) {
		
		String s="ABba";
		
		s=s.toLowerCase();
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(rev.equals(s))
			
			System.out.println(s+" is a Pallindrome String.");
		
		else 
			
			System.out.println(s+" is not a Pallindrome String.");
			
		
	}
}
