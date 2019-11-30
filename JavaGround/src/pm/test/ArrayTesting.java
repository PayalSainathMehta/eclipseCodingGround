package pm.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTesting {
	public static void main(String[] args) {
		int[][] a = {{0,1},{0,2},{1,2}};
		int[] b = {1,2,3};
		List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(3);
		lst.add(6);
		List<List<Integer>> lst2 = new ArrayList<>();
		lst2.add(lst);
		lst2.add(new ArrayList<>(lst));
		System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(lst.toString());
		System.out.println(lst2.toString());
	}
}
