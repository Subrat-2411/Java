package hackerRankRoundRazorPay;

import java.util.Arrays;
import java.util.Scanner;

public class BaggageAirportProblem {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of Bags ");
		
		int N=sc.nextInt();
		
		System.out.println("Enter the no of bag storages");
		
		int M=sc.nextInt();
		
		
		int result[]=solution(N,M);
		
		System.out.println(Arrays.toString(result));
		
		sc.close();
		
	}
	public static int[] solution(int N, int M)
	{
		
		int result[]=new int[M];
		
		int count=1;
		
		while(N>0)
		{
			for(int i=0;i<result.length;i++)
			{
				
				if(N>count)
				{
					result[i]=result[i]+count;
					N=N-count;
					count++;
				}
				else {
					result[i]=result[i]+N;
					N=0;
				}
			}
		}
		
		return result;
	}
}
