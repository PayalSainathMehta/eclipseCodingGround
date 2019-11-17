package pm.test;

public class EncodeNumber {
	 public static String encode(int num) {
	      if(num == 0)
	    	  return "";
	      if(num % 2 == 0)
	    	  return encode((num-1)/2) + 1;
	      return encode((num-1)/2) + 0;
	  }
	 
	 public static void main(String args[]) {
		 int n = 10;
		 String res = encode(n);
		 System.out.println(res);
	 }
}
