package Array_Assignments;

public class RemoveNonPalindrome {

	public static void main(String[] args) {
		String[] a = { "cbbc", "abc", "mkkm", "abab", "dam" };

		for (int i = 0; i < a.length; i++) {
			if (a[i].equalsIgnoreCase(isPalindrome(a[i]))) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public static String isPalindrome(String reverse) {
		String temp = reverse;

		String rev = "";

		for (int i = temp.length() - 1; i >= 0; i--) {

			rev = rev + temp.charAt(i);
		}
		return rev;
	}

}
