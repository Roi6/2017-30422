public class LargestPalindrom {

	public static void main(String args[]) {
		LargestPalindrom Palindrom = new LargestPalindrom(); // used so I can have a non-static method isPalindrome.
		int nr1, nr2;
		outerloop: for (nr1 = 999; nr1 > 100; nr1--) {
			for (nr2 = 999; nr2 > 100; nr2--) {
				if (Palindrom.isPalindrome(nr1 * nr2)) {
					System.out.println(nr1 + " " + nr2);
					break outerloop;
				}
			}
		}

	}

	public boolean isPalindrome(int nr) {
		
		String inv = Integer.toString(nr);
		
		if (inv.equals(new StringBuilder(inv).reverse().toString()))
			return true;
		else
			return false;

	}
}
