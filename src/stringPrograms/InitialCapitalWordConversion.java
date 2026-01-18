package stringPrograms;

import java.util.Arrays;

public class InitialCapitalWordConversion {

	
	public static void main(String[] args) {
		
		String s="Iam playing football";
		
		String[] str=s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			String s1=str[i];
			
			System.out.print(Character.toUpperCase(s1.charAt(0))+s1.substring(1)+" ");
		}
	}
}

// Alternative

/**
   class InitCapitalWordConversionAlternative
  {
   	public static void main(String[] args)
   	{
   		String s="Iam playing football";
   
  		char[] ch=s.toCharArray();
  		
  		for(int i=0;i<ch.length;i++)
  		{
  			if(i==0 && ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')	
  			{
  				if(Character.isLowerCase(ch[i]))
  					Character.isUpperCase(ch[i]);
  				
  			}
  			else {
  				
  				if(Character.isUpperCase(ch[i]))
  					Character.isLowerCase(ch[i]);
  			}
  		}
  		
  		System.out.println(Arrays.toString(ch));
 	
   	}
  }*/
