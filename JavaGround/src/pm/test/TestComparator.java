package pm.test;

import java.util.*;

public class TestComparator {

    public static void main(String args[]) {

        int[][] twoDim = { {1, 2}, {3, 7}, {8, 9}, {4, 2}, {5, 3} };

        Arrays.sort(twoDim, (a,b) -> a[0]-b[0]);
        System.out.println(Arrays.deepToString(twoDim));
        Arrays.sort(twoDim, (a,b) -> b[0]-a[0]);
        System.out.println(Arrays.deepToString(twoDim));
        Arrays.sort(twoDim, (a,b) -> a[1]-b[1]);
        System.out.println(Arrays.deepToString(twoDim));
        Arrays.sort(twoDim, (a,b) -> b[1]-a[1]);
        System.out.println(Arrays.deepToString(twoDim));
    }
}