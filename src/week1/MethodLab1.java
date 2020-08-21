package week1;

public class MethodLab1 {

	public static void main(String[] args) {
		// Task: Write a method called "max3" that computes the max value of 3 ints

		int max = max3(10,30,19);
		int max2 = max3(99, 10, 105);
		
		System.out.println("The max for series 1 is " + max);
		System.out.println("The max for series 2 is " + max2);
		
		// Task: Write a method called "min3" that computes the min value of 3 ints
		
		int min = min3(100, 150, 130);
		int min2 = min3(302, 301, 300);
		int min3 = min3(100, 50, 200);
		
		System.out.println("The min for series 1 is " + min);
		System.out.println("The min for series 2 is " + min2);
		System.out.println("The min for series 3 is " + min3);
		
		// Task: Write a method called "median3" that computes median for 3 ints
		
		int median = median3(100, 150, 200);
		int median2 = median3(26,85,14);
		int median3 = median3(100, 200, 150);
		
		System.out.println("The median for series 1 is "+ median);
		System.out.println("The median for series 2 is "+ median2);
		System.out.println("The median for series 3 is "+ median3);
		
		/* Task: Write a method called "xor" to return a value if either 
		 * statement is true, but not BOTH statments. (Exclusive OR)
		 * */
		
		System.out.println(xor(10 > 1, 15 < 1));
		System.out.println(xor(20 < 10, 25 > 10));
		System.out.println(xor(10 > 1, 11 > 1));
		System.out.println(xor(10 < 1, 11 < 1));
		
		/* Task: Write a method called "isFactor" to return a value
		 * IF AND ONLY IF "k" is a factor of "n"
		 */
		
		System.out.println("5 is a factor of 10: " + isFactor(5,10));
		System.out.println("3 is a factor of 10: " + isFactor(3,10));
		System.out.println("100 is a factor of 10: " + isFactor(100,10));
		System.out.println("11 is a factor of 88: " + isFactor(11,88));
		
		/* Task: Write a method called "isPerfect" to return true
		 * if the provided int is a perfect number
		 */
		
		System.out.println("Is 6 a perfect number? " + isPerfect(6));
		System.out.println("Is 9 a perfect number? " + isPerfect(9));
		System.out.println("Is 28 a perfect number? " + isPerfect(28));
		
		/* Task: Write a method called "isPrime" to return true
		 * if the provided int is a prime number
		 */
		
		System.out.println("Is 14 a prime number? " + isPrime(14));
		System.out.println("Is 169 a prime number? " + isPrime(169));
		System.out.println("Is 21 a prime number? " + isPrime(21));
		System.out.println("Is 2 a prime number? " + isPrime(2));
		System.out.println("Is the number 4 a square = " + isSquare(4));
		System.out.println("Is the number 10 a square = " + isSquare(10));
		
		// IsPrime2 tests follow
		System.out.println("Is 14 a prime number? " + isPrime2(14));
		System.out.println("Is 169 a prime number? " + isPrime2(169));
		System.out.println("Is 47 a prime number? " + isPrime2(47));
	}
	
	//isPrime is below
	public static boolean isPrime(int y) {
		if(y == 2 || y == 5 || y == 3) {
			return true;
		}
		if(isFactor(2, y) == true) {
			return false;
		}
		if(isFactor(3, y) == true) {
			return false;
		}
		if(isSquare(y) == true) {
			return false;
		}
		else {
			return true;
		}
	}
	
	//isPrime2 is below
	public static boolean isPrime2(int number) {
		for(int i = 2; i < number; i++) {
			boolean factor = isFactor(i, number);
			if(factor) {
				return false;
			}
		}
		return true;
	}
	
	//isSquare is below
	public static boolean isSquare(int x) {
		int n = 0;
		do {
			if(n < x) {
				n++;				
			}
		} while (((n * n) != x) && n < x);
		if((n * n) == x) {
			return true;
		}
		else  {
			return false;
		}
	}
	
	
	//isPerfect is below
	public static boolean isPerfect(int y) {
		int x, z = 0;
		for(x = 1; x < y; x++) {
			if(isFactor(x,y) == true) {
				z = z + x;
				System.out.println("z = " + z + " and x = " + x);
			}
			
		}
		if(z == y) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	
	//isFactor is below
	public static boolean isFactor(int k, int n) {
		int remain;
		remain = n % k;
		
		if(remain == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	//xor is below
	public static boolean xor(boolean a, boolean b) {
		if(a == true && b == false) {
			return true;
		}
		if(b == true && a == false) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
		
	
		
	//calcSum is below
	public static int calcSum(int v1, int v2, int v3) {
		int total = v1 + v2 + v3;
		return total;
	}
	
	
	//median3 is below
	public static int median3(int v1, int v2, int v3) {
		int min = min3(v1, v2, v3);
		int max = max3(v1, v2, v3);
		int total = calcSum(v1,v2,v3);
		int total2 = min + max;
		int median = total - total2;
		return median;
		
	}
	
	
	//min3 is below
	public static int min3(int v1, int v2, int v3) {
		int min;
		if(v1 < v2) {
			min = v1;
		} else {
			min = v2;
		}		
		if(v3 < min) {
			min = v3;
		}
		return min;
	}

	//max3 is below
	public static int max3(int v1, int v2, int v3) {
		int max = 0;
		if(v1 > max) {
			max = v1;
		}
		if(v2 > max) {
			max = v2;
		}
		if(v3 > max) {
			max = v3;
		}
		return max;
	}
}
