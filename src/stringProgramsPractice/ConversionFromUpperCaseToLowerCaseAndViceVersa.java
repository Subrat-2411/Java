package stringProgramsPractice;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
class ConversionFromUpperCaseToLowerCaseAndViceVersa {
	public static void main(String[] args) {
		String s = "AbCd%";

		 String st="";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

//			if (Character.isUpperCase(ch))
//				ch = Character.toLowerCase(ch);
//
//			else if (Character.isLowerCase(ch))
//				ch = Character.toUpperCase(ch)

			if(ch>='a'&&ch<='z')
				ch=(char) (ch-32);
			
			else
				ch=(char) (ch+32);

			st += ch;

		}

		System.out.println("After Conversion :" + st);
	}
}

