package stringPrograms;

public class ReverseSequenceOfWordsInString {

	
	public static void main(String[] args) {
		
		String s="I am Sohan";
		
		System.out.println("Original String :"+s);
		
		String[] str=s.split(" ");
		
		
		
		for(int i=str.length-1;i>=0;i--)
		{
			
			System.out.print(str[i]+" ");
		}
	}
}
