package arrayPrograms;

public class SecondMaximumElementInArray {

	public static void main(String[] args) {
		
		String s="";
		
//		s.
		
		System.out.println(s.getClass());

		int[] a = { 1, 2, 3, 4, 5 };

		/*
		 * Integer.MIN_VALUE = the smallest possible integer → -2147483648
		 * 
		 * This ensures:
		 * 
		 * ✔ You can handle any array, even containing:
		 * 
		 * All negative numbers
		 * 
		 * Duplicate maximums
		 * 
		 * Random values
		 * 
		 * Sorted or unsorted data
		 * 
		 * ✔ You start from lowest possible value
		 * 
		 * So even the smallest element in array will be greater and will update
		 * correctly.
		 * 
		 * a = {5, 3, 1} Start:
		 * 
		 *  max = -2147483648 smax = -2147483648 
		 *  Iteration:
		 * 
		 * See 5 → max = 5, smax becomes -2147483648
		 * 
		 * See 3 → 3 > smax → smax = 3
		 * 
		 * See 1 → ignore
		 * 
		 * Final: max = 5 smax = 3 ✔
		 */
		int max = Integer.MIN_VALUE;// to handle negative numbers and duplicate maximums

		int smax = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {

				smax = max;

				max = a[i];
			}

			// Handling Duplicates
			else if (a[i] > smax && a[i] != max)
				smax = a[i];

		}

		System.out.println("Second Maximum element in the Array is " + smax);

	}
}
