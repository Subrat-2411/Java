package stringPrograms;

public class HighestLengthSubString {

	
	public static void main(String[] args) {
		
		String s="Sohan";
		
		int highestLength=0;
		
		String highString="";
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				if(s.substring(i, j).length()>highestLength) {
					highestLength=s.substring(i, j).length();
					
					highString=s.substring(i, j);
					
				}
			}
		}
		
		System.out.println("Highest Substring is "+highString+" of length "+highestLength);
	}
}
