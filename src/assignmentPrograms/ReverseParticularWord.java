package assignmentPrograms;

/*Reverse a Particular Word in a String*/
public class ReverseParticularWord {

	
	public static void main(String[] args) {
		
		
		String s="Iam from Bangalore";
		
		String word="from";
		
		String rev=reverse(word);
		
		s=s.replace(word,rev);
		
		System.out.println(s);
		
		
		
		
	}
	
	public static String reverse(String word)
	{
		return new StringBuilder(word).reverse().toString();
	}
}
