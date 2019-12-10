package pm.test;

import java.util.Arrays;

public class SieveOfEratosthenesPrimeNumberGenerator {
	
	//This is a very interesting problem.
	//Given an integer, we need to return list of all prime numbers upto this integer - limit
	//approach followed is a famous algorithm known as Sieve of Eratosthenes
	//what we did is:-
	// 1. made an enum called Marker which helps us tag CROSSED and UNCROSSED integers - we are only interested in UNCROSSED ones.
	// 2. first we uncross all upto our limit
	// 3. we then start crossing out multiples from the number we starting - only if it is crossed.
	// 4. finally we add the uncrossed ones into our final list
	// 5. return final list
	
	

	private enum Marker{
		CROSSED, UNCROSSED;
		//CROSSED represents the ones which won't be in our result list.
	}
	
	private static Marker[] crossedOut;
    private static int[] primes;
   
	static int[] generatePrimeNumberUpto(int limit) {
		//if the number is 0 or 1, then 0 prime number hence return empty list
		if(limit < 2)
			return new int[0];
		//otherwise the logic is as below
		//all by default in crossedOut would be null.
		//so we mark upto limit ones as uncrossed as they are now our possible finalists
		//but before getting excited that we have our finalists - 
		//we need to remove multiples of them if they are marked as UNCROSSED and mark them as CROSSED
		//put these uncrossed ones into our final set
		uncrossIntegersUpto(limit);
		crossOutMultiples();
		putUncrossedIntoPrimes();
		return primes;
	}
	
	static void uncrossIntegersUpto(int limit) {
		//simply go upto the limit and uncross the integers.
		crossedOut = new Marker[limit];
		for(int i = 2; i < limit; i++) {
			crossedOut[i] = Marker.UNCROSSED;
		}
	}
	
	static void crossOutMultiples() {
		//go only upto the square root of our crossedout length which is upto the limit.
		//if uncrossed, mark all multiples crossed.
		//dont mark itself.
		double iterationLimit = Math.sqrt(crossedOut.length);
		for(int i = 0; i <= (int) iterationLimit; i++) {
			if(crossedOut[i] == Marker.UNCROSSED)
				for(int multiple = 2*i; multiple < crossedOut.length; multiple += i)
					crossedOut[multiple] = Marker.CROSSED;
			}
			
	}
	
	static void putUncrossedIntoPrimes() {
		//simply put all uncrossed into primes
		int length = numberOfUncrossedIntegers();
		primes = new int[length];
		int j = 0;
		for(int i = 0; i < crossedOut.length; i++)
			if(crossedOut[i] == Marker.UNCROSSED)
				primes[j++] = i;
	}
	
	static int numberOfUncrossedIntegers() {
		int count = 0;
		for(int i = 2; i < crossedOut.length; i++)
			if(crossedOut[i] == Marker.UNCROSSED)
				count++;
		return count;
	}
	
	
	public static void main(String[] args) {
		int[] result = generatePrimeNumberUpto(10);
		System.out.println(Arrays.toString(result));
	}

}
