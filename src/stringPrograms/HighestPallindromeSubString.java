package stringPrograms;

public class HighestPallindromeSubString {

	
	public static void main(String[] args) {
		
		
		String s="aravishu";
		
		int highestLength=0;
		
		String highPallindromeString="";
		
		for(int i=0;i<s.length();i++)
		{
			
			for(int j=i+1;j<=s.length();j++)
			{
				String s1=s.substring(i, j);
				
				String rev=new StringBuffer(s1).reverse().toString();
				
				if(rev.equals(s1) && s1.length()>highestLength)
				{
					highestLength=s1.length();
					
					highPallindromeString=s1;
				}
				
			}
		}
		
		System.out.println("Highest Pallindrome SubString is "+highPallindromeString+" of length "+highestLength);
	}
}
