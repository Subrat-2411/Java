package stringPrograms;

import java.util.Arrays;

public class SwapFirstAndLastWordInSentence {

	
	public static void main(String[] args) {
		
		String s="I am Sohan";
		
		String[] atr=s.split(" ");
		
		String temp=atr[atr.length-1];
		
		atr[atr.length-1]=atr[0];
		
		atr[0]=temp;
		
		System.out.println(Arrays.toString(atr));
	}
}
