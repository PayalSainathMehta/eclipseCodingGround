package pm.test;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinations {
	
	public static List<String> letterCombinations(String digits){
		LinkedList<String> result = new LinkedList<String>();
		if(digits.isEmpty())
			return result;
		String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		result.add("");
		for(int i = 0; i < digits.length(); i++) {
			int x = Character.getNumericValue(digits.charAt(i));
			//System.out.println(x);
			while(result.peek().length() == i) {
				String temp = result.remove();
				for(char s: mapping[x].toCharArray())
					result.add(temp+s);
				
			}
		}	
		return result;
	}
	
	
	public static void main(String[] args) {
		String digits = "23";
		List<String> result = letterCombinations(digits);
		System.out.println(result.toString());
	}
}
