package pm.test;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstringWithNoDuplicates {

	
	static int lengthOfLongestSubstring(String s) {
		int ans = 0;
		int n = s.length();
		Map<Character,Integer> mp = new HashMap<>();
		for(int j = 0, i = 0; j < n; j++) {
			if(mp.containsKey(s.charAt(j)))
				//if duplicate found
				//ignore all upto j elements and set i to either j + 1 or let it remain
				i = Math.max(mp.get(s.charAt(j)), i);
			else {
				ans = Math.max(ans, j - i + 1);
				mp.put(s.charAt(j), j + 1);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String s = "abcdbadc";
		System.out.println(lengthOfLongestSubstring(s));
	}
} 
