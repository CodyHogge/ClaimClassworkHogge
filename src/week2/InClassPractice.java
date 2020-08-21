package week2;

import java.util.Arrays;
import java.util.Scanner;

public class InClassPractice {

	public static void main(String[] args) {
		//Write a method to find the max value of an int array
		//findMax(createNumArray(0));
		

	}
	
	//The method below will create an array of ints
	public static int[] createNumArray(int x) {
		System.out.print("Please enter the length of your array: ");
		Scanner arraysc = new Scanner(System.in);
		int arraylength = arraysc.nextInt();
		int[] array = new int[arraylength];
		for(int i = 0; i < arraylength; i++) {
			System.out.print("Please enter a number[" + i + "]: ");
			Scanner numsc = new Scanner(System.in);
			array[i] = numsc.nextInt();
		}
		return array;
	}
	
	//The method below will find the max val of an int array
	public static int findMax(int[] array) {
		int max = 0;
		for(int i = 0; i < array.length; i++) {
		if(array[i] > max) {
			max = array[i];
				}
			}
		System.out.println("The max value of this array is: " + max);
		return max;
	}

}
