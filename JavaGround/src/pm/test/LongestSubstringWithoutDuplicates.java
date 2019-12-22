package pm.test;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutDuplicates {
	
	
	public static int getLongestSubstringLength(String s) {
		int result = 0;
		int j = 0;
		Map<Character,Integer> mp = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			if(mp.containsKey(s.charAt(i)))
				j = Math.max(j, mp.get(s.charAt(i))+ 1);
			mp.put(s.charAt(i), i);
			result = Math.max(result, i - j + 1);
			System.out.println(mp);
		}
		
		
		
		
		
		return result;
		
	}
	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(getLongestSubstringLength(s));
	}
}
