package stringProgramsPractice;

public class CheckingVowels {

	public static void main(String[] args) {
		String s = "Technology";
		
		s=s.toLowerCase();
		
//		System.out.println(s.valueOf(0));
				
		if(!getUniqueVowels(s).isEmpty())
			System.out.println(getUniqueVowels(s));
		else
			System.out.println("not present");


	}
	
	public static String getUniqueVowels(String s) {

	    String result = "";

	    for (int i = 0; i < s.length(); i++) {

	        char ch = s.charAt(i);
	        
//	        System.out.println(s.indexOf(ch));

	        if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
	                && result.indexOf(ch) == -1) {

	            result += ch;
	        }
	    }
	    return result;
	}

	
	

}
