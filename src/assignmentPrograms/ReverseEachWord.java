package assignmentPrograms;

/*Reverse Each Word in A String*/



public class ReverseEachWord {

	
	public static void main(String[] args) {
		
		String s="My name is Sumanth";
		
		/*Spliting Wherever space is Present*/
		String[] words=s.split(" ");
		
		String rev="";
		
		for(int i=0;i<words.length;i++)
		{
			
			
			rev+=reverse(words[i])+" ";
		}
		
		System.out.println(rev);
		
		
		
	}
	
	public static String reverse(String word)
	{
		
		return new StringBuilder(word).reverse().toString();
	}
}
