package week1;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		/*This section of code includes 7 problems I completed for an assignment.
		 * Instead of creating a new class for each question, I used the comment
		 * feature to omit previous questions work. If you would like to test the 
		 * code, just remove the comment modifier from around the code block you
		 * would like to see work. Each question is broken by a comment block of *'s
		 */
		
		//*************************************************************
		// Write a method to prompt user for the radius of a circle
		// then calculate the area and circumference
		/*System.out.print("Please enter the radius of your circle: ");
		Scanner rad = new Scanner(System.in);
		double radius = rad.nextDouble();
		double[] result = ariCircle(radius);
		System.out.println("The circfumerence of your circle is: " + result[0]);
		System.out.println("The area of your circle is: " + result[1]);
		
		//*************************************************************
		// Write a method to prompt the user for the base-width & height
		// of a triangle, then calculate the area of the triangle
		System.out.print("Please enter the base-width of your triangle: ");
		Scanner basesc = new Scanner(System.in);
		double base = basesc.nextDouble();
		System.out.print("Please enter the height of your triangle: ");
		Scanner heightsc = new Scanner(System.in);
		double height = heightsc.nextDouble();
		System.out.println("The area of your triangle is : " + ariTriangle(base, height));
		
		//*************************************************************
		// Write a method to prompt the user for a number, then display
		// if the number is even or odd
		System.out.print("Please enter a value to determine if it is odd or even: ");
		Scanner numsc = new Scanner(System.in);
		int num = numsc.nextInt();
		if(isOdd(num) == true) {
			System.out.println("The number " + num + " is an odd value.");
		} else {
			System.out.println("The number " + num + " is an even value.");
		}
		
		//*************************************************************
		// Write a method to prompt the user for an int, then display as a double
		//addDecimal(0); **This is the answer to lab #4
		
		//*************************************************************
		// Write a method to round the value of a provided number
		int whole = roundNum(15.8);
		System.out.print("The value rounded to the next whole number is: " + whole);
		
		//*************************************************************
		// Write a method to prompt user for 4 digit year, and determine
		// if the input is a leap year
		if(isLeap(0) == true) {
			System.out.println("The year you have entered is a leap year.");
		} else {
			System.out.println("The year you have entered is NOT a leap year.");
		}
		
		int lettervalue = letterVal(0);
		System.out.print("The numerical place of your letter is: " + lettervalue);
		*/

	}
	//letterVal
	public static int letterVal(int y) {
		System.out.println("Please enter a letter to find its place in the alphabet: ");
		Scanner lettersc = new Scanner(System.in);
		String letter = lettersc.next().toLowerCase();
		int letterval = 0;
		switch(letter) {
		case "a":
			letterval = 1;
			break;
		case "b":
			letterval = 2;
			break;
		case "c":
			letterval = 3;
			break;
		case "d":
			letterval = 4;
			break;
		case "e":
			letterval = 5;
			break;
		case "f":
			letterval = 6;
			break;
		case "g":
			letterval = 7;
			break;
		case "h":
			letterval = 8;
			break;
		case "i":
			letterval = 9;
			break;
		case "j":
			letterval = 10;
			break;
		case "k":
			letterval = 11;
			break;
		case "l":
			letterval = 12;
			break;
		case "m":
			letterval = 13;
			break;
		case "n":
			letterval = 14;
			break;
		case "o":
			letterval = 15;
			break;
		case "p":
			letterval = 16;
			break;
		case "q":
			letterval = 17;
			break;
		case "r":
			letterval = 18;
			break;
		case "s":
			letterval = 19;
			break;
		case "t":
			letterval = 20;
			break;
		case "u":
			letterval = 21;
			break;
		case "v":
			letterval = 22;
			break;
		case "w":
			letterval = 23;
			break;
		case "x":
			letterval = 24;
			break;
		case "y":
			letterval = 25;
			break;
		case "z":
			letterval = 26;
			break;
		default:
			System.out.println("That is not a recongized letter of the alphabet, please try again.");
			break;			
		}
		return letterval;
		
	}
	
	//isLeap below
	//Leap years are evenly divisible by 4. 
	//Years divisible by 4 AND 100, but NOT 400 are not leap years.
	//Years divisible by 4, 100, AND 400 are leap years.
	public static boolean isLeap(int y) {
		System.out.print("Please enter a 4 digit year: ");
		Scanner leapsc = new Scanner(System.in);
		int s1, s2, s3;
		int year = leapsc.nextInt();
		int length = String.valueOf(year).length();
		System.out.println(length);
		s1 = year % 4;
		s2 = year % 100;
		s3 = year % 400;	
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		if(length == 4) {
			if(s1 == 0 && s2 != 0) {
				return true;
			}
			if(s1 == 0 && s2 == 0 && s3 == 0) {
				return true;
			}
			else {
				return false; 
			}
		} else {
			System.out.println("The year you entered does not have 4 digits.");
			System.out.println("Please try again with a 4 digit year.");
			return false;
		}
		
		
	}
	
	//roundNum below
		public static int roundNum(double y) {
			int num;
			int x = (int) y;
			double z = y - x;
			if(z >= 0.5) {
				num = x + 1;
			} else {
				num = x;
			}
			return num;
		}
	
	//addDecimal
	public static double addDecimal(int y) {
		System.out.print("Please enter an integer value: ");
		Scanner numsc = new Scanner(System.in);
		int x = numsc.nextInt();
		double num = (double) x;
		System.out.println("The value you entered in decimal form is: " + num);
		return num;
	}
	
	//isOdd (determine odd or even)
	public static boolean isOdd(int x) {
		int remain = x % 2;
		if(remain != 0) {
			return true;
		}
		else {
			return false;
		}
	}

	//ariTriangle
	public static double ariTriangle(double base, double height) {
		double area = ((0.5 * base) * height);
		return area;
	}
	
	
	//ariCircle below
	public static double[] ariCircle(double radius) {
		double diameter = radius * 2;
		double[] result = new double[2];
		result[0] = ((2 * 3.14) * radius);
		result[1] = (3.14 * (radius * radius));
		return result;
	}
	

}
