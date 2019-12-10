package pm.test;

import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class InsertionSortt {
  
  static void insertionSort(int[] a){
    
      int n = a.length;
      for(int i = 1; i < n; i++){
       int numberToInsert = a[i];
       int compareIndex = i;
       while(compareIndex > 0 && a[compareIndex - 1] > numberToInsert){
        a[compareIndex] = a[compareIndex - 1]; 
        compareIndex--;
       }
       a[compareIndex] = numberToInsert;
        
      }
  }
  public static void main(String[] args) {
      int[] a = {10,3,2,1,4,5};
      insertionSort(a);
      System.out.println(Arrays.toString(a));
    }
  }

