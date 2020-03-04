package pm.test;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Pairs {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++){
            int ele = ar[i];
            if(mp.containsKey(ele)){
                mp.put(ele,mp.get(ele) + 1);
            }
            else
                mp.put(ele,1);
        }
        int count = 0;
        for(int key: mp.keySet()) {
        	int curr = mp.get(key);
        	System.out.println("Key: "+ key + " Count: " + curr);
        	if(curr >= 2) {
        		count = count + curr/2;
        	}
        }
        
//        System.out.println(mp.toString());
        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       int ar[] = {10,20,20,10,10,30,50,10,20};
       System.out.println(sockMerchant(ar.length, ar));
    }
}

