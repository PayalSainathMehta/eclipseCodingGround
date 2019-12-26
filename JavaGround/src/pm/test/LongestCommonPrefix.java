package pm.test;

import java.util.List;

public class LongestCommonPrefix {
	
	
	//return empty string if length of list passed is 0 or null strings are passed.
	public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        //else pass complete list to recursive function.
        else return longestCommonPrefix(strs, 0, strs.length-1);
        
    }
	
	public static String longestCommonPrefix(String[]strs, int l, int r) {
		//I am a recursive function. I check the left and right passed to me and if they are same, I return either of them.
		if(l == r)
			return strs[l];
		//If they are not, i calculate the mid of the list 
		int mid = (l+r)/2;
		//I then recursively call myself on left and right parts.
		String left = longestCommonPrefix(strs, l, mid); //flower
		String right = longestCommonPrefix(strs,mid+1,r); //flow
		//Finally i return the common prefix of my child nodes.
		return commonPrefix(left,right);
		
	}
	
	public static String commonPrefix(String left, String right) {
		//I find out the smallest of the strings passed to me and then traverse till that position in both strings and once i find something 
		//that does not match, i stop and return upto that length.
		int minLength = Math.min(left.length(), right.length()); //4
		for(int i = 0; i < minLength; i++) //0 to 3
			if(left.charAt(i) != right.charAt(i))
				return left.substring(0, i);
	    return left.substring(0, minLength);

	}
	

	public static void main(String[] args) {
		String[] input = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(input));
	}
}
