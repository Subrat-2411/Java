package stringPrograms;

/*Count the no of Character Occurrence in a String wihout using Collection*/
public class OccurrenceInString {

	
	public static void main(String[] args) {
		
		String s="aabbaaccc";
		
		String res="";
		
		char[] a = s.toCharArray();
		
		int count=1;
		
		for(int i=0;i<s.length()-1;i++)
		{
			
			if(a[i]==a[i+1])
				count++;
			
			else
			{
				res=a[i]+""+count;
				
				System.out.print(res);
				
				count=1;
			}
			
		}
		
		System.out.println(a[a.length-1]+""+count);//a2b2a2c3
	}
	
	
}
