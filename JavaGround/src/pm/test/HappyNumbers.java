package pm.test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumbers {
	
	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();
		set.add(n);
		return isHappyHelper(n, set);
	}
	
	public boolean isHappyHelper(int n, Set set) {
		if(n == 1) return true;
		int val = 0;
		while(n > 0) {
			val = (int) (val + Math.pow(n%10,2));
			n = n / 10;
		}
		System.out.println(val);
		if (set.contains(val)) return false;
		set.add(val);
		return isHappyHelper(val, set);
		
	}
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		//Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		HappyNumbers num =  new HappyNumbers();
		boolean res = num.isHappy(41);
		System.out.println(res);
	}

}
