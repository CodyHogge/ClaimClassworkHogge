package week1;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
	//Find the area of a triangle (1/2)base * height
		System.out.print("Please enter the base of your triangle: ");
		Scanner scan1 = new Scanner(System.in);
		double base = scan1.nextInt();
		System.out.print("Please enter the height  of your triangle: ");
		Scanner scan2 = new Scanner(System.in);
		double height = scan2.nextInt();
		double area1 = areaTriangle(base, height);
		
		System.out.println("Enter your values below to find the area of a triangle.");
		System.out.println("The base you have entered is: " + base);
		System.out.println("The height you have entered is: " + height);
		System.out.println("The area of your triangle is: " + area1);

		
	//find the perimeter of a rectangle
		int perimeter;
		System.out.println("Please enter the length of Sides 1 & 3: ");
		Scanner scan3 = new Scanner(System.in);
		int s1 = scan3.nextInt();
		System.out.println("Please enter the length of Sides 2 & 4: ");
		Scanner scan4 = new Scanner(System.in);
		int s2 = scan4.nextInt();
		perimeter = (s1 * 2) + (s2 * 2);
		System.out.println("The lengths you have entered are " + s1 + " and " + s2);
		System.out.println("The perimeter of the rectangle is " + perimeter);
		
		
	}
public static double areaTriangle(double base, double height) {
	double half = 0.5;
	double area = ((half * base) * height);
	return area;
	
}
}
