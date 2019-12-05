package pm.test;


public class CircularListPetrolPump {
	public static int returnStartIndex(int[][] a) {
		//length of array
		int n = a.length;
		//distance between first and second
		int current = a[0][0] - a[0][1];
		int i = 0, j = 1;
		while(i != j || current < 0) {
			//first and second not same then check for distance
			while(i != j && current < 0) {
				current -= a[i][0] - a[i][1];
				i = (i + 1) % n;
				
				if(i == 0)
					return -1;
			}
		current += a[j][0] - a[j][1];
		j = (j + 1) % n;
	}		
		return i;
	}
	
	public static void main(String[] args) {
		int[][]a  = {{4, 6}, {5, 6}, {7, 3},{5, 3},{2,9},{24,12}};
		System.out.println(returnStartIndex(a));
	}
	

}
