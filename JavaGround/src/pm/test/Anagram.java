package pm.test;

import java.util.Arrays;

public class Anagram {

	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length())
			return false;
		int[] counter = new int[26];
		for(int i = 0; i < s.length(); i++) {
			counter[s.charAt(i)-'a']++;
			counter[t.charAt(i)-'a']--;
		}
		System.out.println(Arrays.toString(counter));
		for(int count: counter) {
			if(count!=0)
				return false;
		}
		return true;
		
	}
	public static void main(String args[]) {
		String s = "anagram";
		String t = "nagaram";
		boolean res = isAnagram(s,t);
		System.out.println(res);
	}
}
