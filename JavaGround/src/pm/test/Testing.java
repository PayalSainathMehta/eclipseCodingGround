package pm.test;


public class Testing {
	public static void main(String[] args) {
		int[] count = new int[256];
		String s = "aabbad ad n";
		for(int i = 0; i < s.length(); i++)
			count[s.charAt(i)]++;
		char c = ' ';
		for(int i = 0; i < count.length; i++) {
			if(count[i] > 0) {
				c = (char)i; 
				System.out.println("Frequency of "+c+" is "+count[i]);
			}
		}
}
}
