/*
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class problem2 {
	public static void main(String[] args){
		int x = 1, x2, y = 1;
		int sum = 0;
		//as it turns out, every 3rd number in the fib seq. is even
		while (sum < 4000000){
			sum += x + y;
			x2 = x + 2 * y;
			y = 2 * x + 3 * y;
			x=x2;
		}
		System.out.println(sum);
	}
}
