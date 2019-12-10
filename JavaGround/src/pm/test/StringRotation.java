package pm.test;

public class StringRotation {
	
	
	//this is the simpler one. where simply we concatenate the first string to itself 
	// s1 = bcda + bcda = bcdabcda
	//now simply check if s2 is present in s1
	static boolean isRotationWithConcatenation(String s1, String s2) {
		if(s1 == null || s2 == null)
			return false;
		if(s1.length() != s2.length())
			return false;
		s1 = s1 + s1;
		return s1.contains(s2);
	}
	
	static boolean isRotation(String s1, String s2) {
		if(s1 == null || s2 == null)
			return false;
		if(s1.length() != s2.length())
			return false;
		//s1 = 'bcda' and s2 = 'abcd'
		int index = s1.indexOf(s2.charAt(0));
		if(index > -1) {
			if(s1.equalsIgnoreCase(s2))
				return true;
			int finalPos = s1.length() - index;
			return s1.charAt(0) == s2.charAt(finalPos) 
					&& s1.substring(0,index).equals(s2.substring(finalPos));
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		String input = "abcd";
		String rotated = "bcda";
		boolean result = isRotation(rotated, input);
		System.out.println(result);
	}
}
