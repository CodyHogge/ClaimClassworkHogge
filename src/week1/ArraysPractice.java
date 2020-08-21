package week1;

import java.util.Scanner;

public class ArraysPractice {

	public static void main(String[] args) {
		/*
		//2D array
		int[][] values = { {1, 2}, {3, 4}};
		//double For loop
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println("values [ " + i + " ][ " + j + " ] = " + values[i][j]);
			}
		}
		*/
		//Declare a 2D array with odd columns
		/*By writing this array like this we said row 0 has 3 values, row 1 has 4
		 * and row 2 has 2 values
		
		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
		
		
		//initialize a jagged array
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
			}
		}
		//printing the data of a jagged array
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		*/

		
		//Task: Take 10 int inputs from user and store in array
		//Task2: Find largest and smallest elements in array
		//Task3: Copy an array into another array
		//Task4: Calculate average of array elements
		int[] array1 = arrayScan(10);
		int array1max = arrayMax(array1);
		int array1min = arrayMin(array1);
		double array1avg = arrayAvg(array1);
		System.out.println("The max for array1 is: " + array1max);
		System.out.println("The min for array1 is: " + array1min);
		System.out.println("The avg for array1 is: " + array1avg);
		//arrayCopy(array1);
		
		
	}
	
	public static int[] arrayCopy(int [] array) {
		int[] array2 = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}
		for(int j = 0; j < array.length; j++) {
			System.out.println("Array2 [ " + j + " ] = " + array2[j]);
		}
		return array2;
	}
	
	public static int[] arrayScan(int arrlength) {
		arrlength = 10;
		int[] array1 = new int[arrlength];
		for(int i = 0; i < array1.length; i++) {
			System.out.print("Please enter an integer (#" + i + "): ");
			Scanner sc0 = new Scanner(System.in);
			array1[i] = sc0.nextInt();
			
		}
		for(int j = 0; j < array1.length; j++) {
			System.out.println("Array1[ " + j + " ] = " + array1[j]);
		}
		return array1;
	}
	
	public static int arrayMax(int [] array) {
		int max = array[0];
		for(int k = 0; k < array.length; k++){
			if(array[k] > max) {
				max = array[k];			
			}
		}
		return max;
	}
	
	public static int arrayMin(int [] array) {
		int min = array[0];
		for(int k = 0; k <array.length; k++) {
			if(array[k] < min) {
				min = array[k];
			}
		}
		return min;
	}
	
	public static double arrayAvg(int [] array) {
		double total =  0;
		double average;
		for(int i = 0; i < array.length; i++) {
			total = array[i] + total;
		}
		average = total / array.length;
		return average;
	}

}
