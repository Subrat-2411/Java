package hackerRankRoundRazorPay;

import java.util.Scanner;

public class EmployeeProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of working days ");//7
		

		int N = sc.nextInt();

		int workload[] = new int[N];

		System.out.println("Enter the number of working hours for " + N + " days");

		for (int i = 0; i < workload.length; i++) {
			
			workload[i] = sc.nextInt();// [9,8,7,6,5,4,3,9,7]
		}

		sc.close();

		int peakWorkingOutput = consecutiveMaximum(N, workload);

		System.out.println("Peak Working Output is " + peakWorkingOutput);

	}

	static int consecutiveMaximum(int N, int[] workload) {

		// [9,8,6,5,4,3,9]

		/* To count Consecutive Peak Working days */
		int refCount = 0;

		/* To count Maximum Consecutive Peak Working days */
		int finalCount = 0;

		for (int i = 0; i < workload.length; i++) {

			if (workload[i] > 6)// (9>6[T],8>6[T],6>6[F],)
			{
				refCount++;//1 
			}
			else if (finalCount < refCount)
			{
				finalCount = refCount;//2
				refCount = 0;
			}

			else 
			{
				refCount = 0;
			}

		}

		if (finalCount > refCount)
			return finalCount;
		else
			return refCount;

	}
}
