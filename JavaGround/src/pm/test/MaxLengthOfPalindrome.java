package pm.test;

import java.util.Scanner;

public class MaxLengthOfPalindrome {

	private int lo, maxlen;
	
	public String longestPalindrome(String s) {
		int len = s.length();
		if (len < 2)
			return s;
		for(int i = 0; i < len-1; i++) {
			expandAroundCenter(s,i,i);
			expandAroundCenter(s,i,i+1);
		}
		
		return s.substring(lo,lo+maxlen);
	}
	
	public void expandAroundCenter(String s, int j, int k) {
		while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
			j--;
			k++;
		}
		if (maxlen < k - j -1){
			maxlen = k - j - 1;
			lo = j + 1;
		}
	}
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		MaxLengthOfPalindrome obj = new MaxLengthOfPalindrome();
		String res = obj.longestPalindrome(s);
		System.out.println(res);
		
	}
}
