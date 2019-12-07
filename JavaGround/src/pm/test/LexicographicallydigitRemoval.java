package pm.test;

public class LexicographicallydigitRemoval {
	
	public static int removeDigit(String s1, String s2) {
		int res = 0;
		StringBuilder sb = new StringBuilder(s1);
		for(int i = 0; i < sb.length(); i++) {
			if(Character.isDigit(sb.charAt(i))) {
				char c = sb.charAt(i);
				sb.deleteCharAt(i);
				if(sb.toString().compareTo(s2) < 0)
					res++;
				sb.insert(i,c);
			}
		}	
		sb = new StringBuilder(s2);
		for(int i = 0; i < sb.length(); i++) {
			if(Character.isDigit(sb.charAt(i))) {
				char c = sb.charAt(i);
				sb.deleteCharAt(i);
				if(sb.toString().compareTo(s1) > 0)
					res++;
				sb.insert(i,c);
			}
	  }
		return res;
	}
	
	public static void main(String args[]) {
		String s1 = "123ab";
		String s2 = "1ab";
		System.out.println(removeDigit(s1, s2));
	}
}
