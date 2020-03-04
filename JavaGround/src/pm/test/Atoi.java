package pm.test;

public class Atoi {
	
	public static int myAtoi(String str) {
		 int sign = 1, total = 0;
		 if(str.length() == 0) return 0;
		 str = str.trim();
		 int index = 0;
		 char first = str.charAt(index);
		 if(first == '+' || first == '-')
		 {
			 sign = (first == '+') ? 1 : -1;
			 index++;
		 }
		 while(index < str.length()) {
			 int digit = str.charAt(index) - '0';
			 if(digit < 0 || digit > 9) break;
			 
			 //checking overflow
			 if((Integer.MAX_VALUE-digit)/10 < total)
				 return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			 
			 total = total * 10 + digit;
			 index++;		 
		 }
			return total * sign;
	 }
	
	public static void main(String[] args) {
		String str = "   42";
		int result = myAtoi(str);
		System.out.println(result);
	}
}
