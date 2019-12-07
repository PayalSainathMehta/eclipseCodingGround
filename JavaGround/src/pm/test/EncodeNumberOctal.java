package pm.test;

public class EncodeNumberOctal {
	 public static String encodeWithBinary(int num) {
		
		 if(num == 0)
			 return "";
		 return Integer.toBinaryString(num + 1).substring(1);
	  }
	 
	 public static void main(String args[]) {
		 int n = 29;
		 String res = encodeWithBinary(n);
		 System.out.println(res);
	 }
}

