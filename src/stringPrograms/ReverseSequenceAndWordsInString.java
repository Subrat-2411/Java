package stringPrograms;

public class ReverseSequenceAndWordsInString {

	public static void main(String[] args) {
		
		String s="I am Sohan";
		
		String[] atr=s.split(" ");
		
		atr[0]=new StringBuffer(atr[0]).reverse().toString();
		
		atr[atr.length-1]=new StringBuffer(atr[atr.length-1]).reverse().toString();
		
		for(int i=0;i<atr.length;i++)
		{
			
		   
		   System.out.print(atr[i]+" ");
		
		}
	}
}
