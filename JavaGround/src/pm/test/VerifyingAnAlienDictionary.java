package pm.test;

import java.util.Arrays;

public class VerifyingAnAlienDictionary {
	public boolean isAlienSorted(String[] words, String order) {
        int index[] = new int[26];
        for(int i = 0; i < order.length(); i++) {
        	index[order.charAt(i) - 'a'] = i;
        }
        //index = [5, 6, 7, 4, 8, 9, 10, 11, 12, 13, 14, 3, 15, 16, 1, 17, 18, 2, 19, 20, 21, 22, 0, 23, 24, 25]
        //System.out.println(Arrays.toString(index));
        search:
        	for(int i = 0; i < words.length-1; i++) 
        	{
	        	String word1 = words[i];
	        	String word2 = words[i + 1];
	        	for(int k = 0; k < Math.min(word1.length(), word2.length()); k++)
	        		{
	        			if(word1.charAt(k) != word2.charAt(k)) {
	        				if(index[word1.charAt(k) - 'a'] > index[word2.charAt(k) - 'a'])
	            				return false;
	            			continue search;
	        			}
	        		}
	        	if(word1.length() > word2.length())
	        		return false;
        	}
        return true;
    }
	
	
	
	 public static void main(String args[]) { 
	    	String[] words = {"word","world","row"};
	    	String order = "worldabcefghijkmnpqstuvxyz";
	    	VerifyingAnAlienDictionary obj = new VerifyingAnAlienDictionary();
	    	boolean result = obj.isAlienSorted(words, order);
	    	System.out.println(result);
	    }

}
