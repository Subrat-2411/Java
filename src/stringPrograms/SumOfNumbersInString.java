package stringPrograms;

public class SumOfNumbersInString {

	
	public static void main(String[] args) {
		
		
		String s="subrat@124";
		
		int sum=0;
		
		for(int i=0;i<s.length();i++)
		{
			
			char ch=s.charAt(i);
			
			if(Character.isDigit(ch))
			
			sum+=ch-48;
			
			
		}
		
		System.out.println("Sum of Numbers in String :"+sum);
	}
}
