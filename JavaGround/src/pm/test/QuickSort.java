package pm.test;


//Java program for implementation of QuickSort 
class QuickSort 
{ 
 /* This function takes last element as pivot, 
    places the pivot element at its correct 
    position in sorted array, and places all 
    smaller (smaller than pivot) to left of 
    pivot and all greater elements to right 
    of pivot */
 int partition(int arr[], int low, int high) 
 { 
     int pivot = arr[high];  
     int i = (low-1); // index of smaller element 
     for (int j=low; j<high; j++) 
     { 
         // If current element is smaller than the pivot, 
    	 //then we increment i as the swap will now happen
         if (arr[j] < pivot) 
         { 
             i++; 

             // swap arr[i] and arr[j] 
             int temp = arr[i]; 
             arr[i] = arr[j]; 
             arr[j] = temp; 
         } 
     } 

     // swap arr[i+1] and arr[high] (or pivot) and place in correct position
     int temp = arr[i+1]; 
     arr[i+1] = arr[high]; 
     arr[high] = temp; 

     return i+1; 
 } 


 /* The main function that implements QuickSort() 
   arr[] --> Array to be sorted, 
   low  --> Starting index, 
   high  --> Ending index */
 void sort(int arr[], int low, int high) 
 { 
     if (low < high) 
     { 
         /* pi is partitioning index, arr[pi] is  
           now at right place */
         int pi = partition(arr, low, high); 

         // Recursively sort elements before 
         // partition and after partition 
         sort(arr, low, pi-1); 
         sort(arr, pi+1, high); 
     } 
 }
 
 
 void sortIterative(int a[], int low, int high) {
	 int[] stack = new int[high - low + 1];
	 int top = -1;
	 
	 //push low high in stack
	 stack[++top] = low;
	 stack[++top] = high;
	 
	 //while stack has elements
	 while(top > -1) {
		 
		 high = stack[top--];
		 low = stack[top--];
		 
		 //get the right partition with elements smaller on left of partition and 
		 //greater on right of partition
		 int p = partition(a, low, high);
		 
		 //push all left side elements to stack
		 if(p - 1 > low) {
			 stack[++top] = low;
			 stack[++top] = p - 1;
		 }
		 
		 //push all elements of right side to stack
		 
		 if(p + 1 < high) {
			 stack[++top] = p + 1;
			 stack[++top] = high;
		 }
	 }
 }

 /* A utility function to print array of size n */
 static void printArray(int arr[]) 
 { 
     int n = arr.length; 
     for (int i=0; i<n; ++i) 
         System.out.print(arr[i]+" "); 
     System.out.println(); 
 } 

 // Driver program 
 public static void main(String args[]) 
 { 
     int arr[] = {7,9,10,8,3,4,5}; 
     int n = arr.length; 

     QuickSort ob = new QuickSort(); 
     ob.sortIterative(arr, 0, n-1); 

     System.out.println("sorted array"); 
     printArray(arr); 
 } 
} 