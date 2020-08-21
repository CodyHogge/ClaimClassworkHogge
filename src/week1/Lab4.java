package week1;

public class Lab4 {

	public static void main(String[] args) {
		// Write methods for the comments
		//Number 1:
		//	Given 2 positive ints, return their sum IF the sum= # of digits in int a
		//sumLimit(2,3) -> 5  sumLimit(8,3) ->8
		/*sumLimit(2,3);
		sumLimit(8,3);
		sumLimit(8,1);
		*/
		
		//Number 2:
		//	squirrels play between 60 - 90, unless summer then 60-100
		//squirrelPlay(int x, boolean)
		/*squirrelPlay(95, false);
		squirrelPlay(95, true);
		*/
		
		//Number 3
		//	Lottery ticket with 3 ints, if 3 match = 20, if 2 match = 10
		/*lottoTicket(1,3,2);
		lottoTicket(2,1,1);
		lottoTicket(2,2,2);
		*/
		
		//Number 4
		//	Count the number of "xx" in the given string. Overlapping is allowed.
		//	countXX(abcxx) -> 1, countXX("xxx") -> 2
		/*countXX("abcxx");
		countXX("xxx");
		countXX("xxxx");
		*/
		
		//Number 5
		//	Given a string and positive int, return a longer string
		//	that copies string * int
		/*stringTimes("Hi", 2);
		stringTimes("Hi", 3);
		stringTimes("Hi", 1);
		*/
	}
	
	//This method completes number 5
	public static String stringTimes(String inpstring, int x) {
		String result = inpstring.repeat(x);
		System.out.println(result);
		return result;
	}
	
	//This method completes number 4
	public static int countXX(String inpstring) {
		int xx = 0;
		char[] letArray = new char[inpstring.length()];
		for(int i = 0; i < inpstring.length(); i++) {
			letArray[i] = inpstring.charAt(i);
		}
		for(int j = 0; j < letArray.length-1; j++) {
			if(letArray[j] == 'x' && letArray[j+1] == 'x') {
				xx++;
			}
		}
		System.out.println("The number of 'xx' is: " + xx);
		return xx;
	}
	
	//This method completes number 3
	public static int lottoTicket(int a, int b, int c) {
		int match3 = 20;
		int match2 = 10;
		int match0 = 0;
		int match = 0;
		if(a == b) {
			match++;
		}
		if(a == c) {
			match++;
		}
		if(b == c ) {
			match++;
		}
		if(a == b && b == c) {
			match = 2;
		}
		switch(match) {
		case 1:
			System.out.println("Congrats, you have 2 matching numbers! You win $" + match2);
			break;
		case 2:
			System.out.println("Congrats, you have 3 matching numbers! You win $" + match3);
			break;
		default:
			System.out.println("Sorry, you have no matching numbers. You win $" + match0);
			break;
		}
		return match;
	}
	
	//This method completes number 2
	public static boolean squirrelPlay(int x, boolean y) {
		if(y == true) {
			if( x >= 60 && x <= 100) {
				System.out.println("The squirrels play.");
				return true;
			} else {
				System.out.println("The squirrels do not play.");
				return false;
			}
		} else {
			if(x >= 60 && x <= 90) {
				System.out.println("The squirrels play.");
				return true;
			} else {
				System.out.println("The squirrels do not play.");
				return false;
			}
		}
	}
	
	//This method completes number 1
	public static int sumLimit(int a, int b) {
		int sum = a + b;
		int alength = String.valueOf(a).length();
		int sumlength = String.valueOf(sum).length();
		if(sumlength == alength) {
			System.out.println("The sum is: " + sum);
			return sum;
		} else {
			System.out.println("The number of digits in the sum exceeds number of digits in Int a, return a: " + a);
			return a;
		}
	}

}
