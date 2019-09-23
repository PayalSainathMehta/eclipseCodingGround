package pm.test;

interface Multiplication{
	int multiply(int a, int b);
	
	default int square(int a){
		return multiply(a,a);
	}
	
	default int cube(int a) {
		return multiply(multiply(a,a),a);
	}
}
public class DefaultMethodImplementationWithAnonymousClass{
	
	public static void main(String args[]) {
		
		Multiplication mult = new Multiplication() {
			
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