package stringPrograms;

public class PrintConsecutiveNonDuplicateCharacters {

	public static void main(String[] args) {

		String s = "abccba";

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				s = s.substring(0, i - 1) + s.substring(i + 1);/* 1st time :abba 2nd time:aa 3rd time:blank */

				System.out.println(s);

				/* Reinitialized i value as zero */
				i = 0;
				/**
				 * Next time i value starts from 1 It will consider the current s value
				 */
			}
		}
	}
}
