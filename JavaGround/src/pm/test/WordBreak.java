package pm.test;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
	//In dynamic programming you should always be able to define a particular cell's work.
	//If you can do that, then you are good to go!
	
	
	//For this problem, the cell f[i] represents whether a substring(0,i) can be segmented into words of dictionary.
	
	 public static boolean wordBreak(String s, List<String> wordDict) {
	    boolean[] f = new boolean[s.length() + 1];
	    f[0] = true; // as one character will always be present in worddict
	    for(int i = 1; i <= s.length(); i++) {
	    	for(int j = 0; j < i; j++) {
	    		if(f[j] && wordDict.contains(s.substring(j,i))) {
	    			f[i] = true;
	    			break;
	    		}
	    	}
	    }
	    
	    
	    
	    return f[s.length()];
	 }
	 
	 
	public static void main(String[] args) {
		String s = "catsanddog";
		List<String> wordDict = new ArrayList<>();
		wordDict.add("cats");
		wordDict.add("dog");
		wordDict.add("sand");
		wordDict.add("and");
		wordDict.add("cat");
		System.out.println(wordBreak(s,wordDict));

	}
}
