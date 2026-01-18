package stringPrograms;

public class ParticularLengthSubString {

	
	public static void main(String[] args) {
		
		String s="Sohan";
		
		int length=2;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				String s1=s.substring(i, j);
				
				if(s1.length()==length)
					System.out.println(s1);
			}
		}
	}
}
