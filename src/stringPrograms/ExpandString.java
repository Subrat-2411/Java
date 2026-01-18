package stringPrograms;

public class ExpandString {

	
	public static void main(String[] args) {
		
		String s="a2b3a3c3";
		
		// for every 2nd character the loop will iterate
		for(int i=0;i<s.length();i+=2)
		{
			// Digit Value
			int count=s.charAt(i+1)-48;
			
			// Character Value
			char ch=s.charAt(i);
			
			for(int j=1;j<=count;j++)
			{
				// Printing the Character
				System.out.print(ch);
			}
			
			
		}
	}
}
