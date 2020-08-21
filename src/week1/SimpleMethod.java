package week1;

public class SimpleMethod {

	public static void main(String[] args) {
		// Create a method to calculate the sum of 3 ints
		// Create a method to calculate the average of 3 ints
		
		int result1 = calculateSum(100, 150, 250);
		int result2 = calculateSum(10,25,15);
		int result3 = calculateSum(50,75,175);
		int resultall = calculateSum(result1, result2, result3);
		
		System.out.println("Result 1 is " + result1);
		System.out.println("Result 2 is " + result2);
		System.out.println("Result 3 is " + result3);
		System.out.println("Result all is " + resultall);
		
		double average1 = calculateAvg(70, 80, 90);
		double average2 = calculateAvg(150, 198, 306);
		double average3 = calculateAvg(99, 67, 28);
		
		System.out.println("Average 1 is " + average1);
		System.out.println("Average 2 is " + average2);
		System.out.println("Average 3 is " + average3);
		
		double resultavg = calculateAvg(result1, result2, result3);
		System.out.println("The average of the CalcSum results is " + resultavg);
		
	
		
	}
	
	//Modifier: public static
	//Return Type: int (I am expecting this method to return an int)
	//Method Name: calculateSum
	//List of Arguments: int v1, v2, v3
	
	public static double calculateAvg(int x1, int x2, int x3) {
		double total = calculateSum(x1, x2, x3);
		double average = total / 3;
		return average;
	}
	
	public static int calculateSum(int v1, int v2, int v3) {
		int total = v1 + v2 + v3;
		return total;
	}
	

}
