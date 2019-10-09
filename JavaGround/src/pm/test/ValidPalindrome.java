package pm.test;

public class ValidPalindrome {
	public static boolean isPalindrome(String s) {
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		boolean reverse = returnBooleanPalindrome(s);
		return reverse;
	}
	
	public static String returnPalindrome(String s) {
		s.toLowerCase();
		String reverse = "";
		for(int i = s.length()-1; i>=0; i--)
			reverse = reverse + s.charAt(i);
		return reverse;
	}
	
	public static boolean returnBooleanPalindrome(String s) {
		if(s.isEmpty()) return true;
		s = s.toLowerCase();
		for(int i = 0; i<=s.length()/2; i++)
			if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
		return true;
		
	}

	public static void main(String[] args) {
		String s = "";
		boolean result = isPalindrome(s);
		System.out.println(result);
	}
}
