package pm.test;


import java.util.Arrays;

public class SortBorderElements {
	private static int sum = 0;
	public static void sortBoundary(int[][] a) {
		int n = a.length;
		int b[] = new int[2 * n + 2 * (n - 2)];
		//take border elements - put in separate n
        int index = 0;        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1){
                    b[index++] = a[i][j];
                    sum += a[i][j];
                }
            }
        }
        
        //sort border elements
//        for(int i = 0; i < b.length; i++){ // 0 to 11
//            for(int j = 0; j < b.length - 1 - i; j++){ //0 to 11...0 to 10...0 to 9... 
//                if(b[j] > b[j + 1]){
//                    int temp = b[j];
//                    b[j] = b[j + 1];
//                    b[j + 1] = temp;
//                }
//            }   
//        }
        Arrays.sort(b);
//        System.out.println(Arrays.toString(b));
        
        //put it back
        index = 0;
        for(int i = 0; i < n; i++) //first row
            a[0][i] = b[index++];
        for(int i = 1; i < n; i++)  //right border middle two
            a[i][n - 1] = b[index++]; 
        for(int i = n - 2; i >= 0; i--) // lower row middle two
            a[n - 1][i] = b[index++];
        for(int i = n - 2; i >= 1; i--) // left border middle two
            a[i][0] = b[index++];
       
	}
	public static void main(String args[]){
        int a[][] = {{5,2,1,6},{16,4,3,8},{7,9,10,11},{13,12,15,14}};
        sortBoundary(a);
        System.out.println(Arrays.deepToString(a));
        System.out.println("Sum of boundary elements: "+sum);
      }
}

