package pm.test;

interface Multiplication2{
	int multiply(int a, int b);
	
	default int square(int a){
		return multiply(a,a);
	}
	
	default int cube(int a) {
		return multiply(multiply(a,a),a);
	}
}
public class DefaultMethodImplementation implements Multiplication2{
	
	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String args[]) {
		
		Multiplication2 mult = new Multiplication2() {
			
			@Override
			public int multiply(int a, int b) {
				// TODO Auto-generated method stub
				return a * b;
			}
		};
		
			
		int cuberes = mult.cube(3);
		System.out.println("Cube: "+ cuberes);	
	}
}	
