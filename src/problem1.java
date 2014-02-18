
/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
 */

/*
 * Use 2 arithmetic progressions
 *   (n(a1+an))/2
 *   where n is the number of terms, a1 is the first multiple, and an is the last multiple
 */

public class problem1 {
	public static void main(String[] args){
		//finding multiples below 1000
		
		int sum = findSum(3,999);
		sum += findSum(5,995);
		//the problem specifies that we sum multiples of 3 or 5, but not 3 AND 5.
		//all multiples of 3 and 5 will be divisible by 15
		sum -= findSum(15,990);

		System.out.println("The sum is: " + sum);
	}
	
	/**
	 * @param i - first number in the series
	 * @param j - last number in the series
	 * @return the sum of the series
	 */
	private static int findSum(int i, int j) {
		//n is the number of terms in the series
		int n = j/i;
		return n*(i+j)/2;
	}
}
