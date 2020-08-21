package week1;

import java.util.Scanner;

public class Lab2withSwitch {

	public static void main(String[] args) {
		// Completing the Lab 2 assignment however, using a switch to attempt 
		// streamlining the methods and console output
		System.out.print("Please enter the shape you wish to calculate: ");
		Scanner shapesc = new Scanner(System.in);
		String shape = shapesc.next().toLowerCase();
		int shapeinp;
		
		switch(shape) {
		case "circle":
			shapeinp = 1;
			double[] resultc = ariCircle(shapeinp);
			System.out.println("The radius of your circle is: " + resultc[0]);
			System.out.println("The circumference of your circle is: " + resultc[1]);
			System.out.println("The area of your circle is: " + resultc[2]);
			break;
		case "triangle":
			shapeinp = 2;
			double[] resultt = ariTriangle(shapeinp);
			System.out.println("The base of your triangle is: " + resultt[0]);
			System.out.println("The height of your triangle is: " + resultt[1]);
			System.out.println("The area of your triangle is: " + resultt[2]);
			break;
		default:
		System.out.println("Sorry, this program only supports Circles and Triangles currently");
		break;
		}			
			

	}
	
	
	//ariTriangle below
	public static double[] ariTriangle(int x) {
		System.out.print("Please enter the base-width of your triangle: ");
		Scanner basesc = new Scanner(System.in);
		double base = basesc.nextDouble();
		System.out.print("Please enter the height of your triangle: ");
		Scanner heightsc = new Scanner(System.in);
		double height = heightsc.nextDouble();
		double area = ((0.5 * base) * height);
		double[] result = new double[3];
		result[0] = base;
		result[1] = height;
		result[2] = area;
		return result;
		}
	
	
	//ariCircle below
	public static double[] ariCircle(int x){
		System.out.print("Please enter the radius of your circle: ");
		Scanner cirsc = new Scanner(System.in);
		double radius = cirsc.nextDouble();
		double[] result = new double[3];
		result[0] = radius;
		result[1] = ((2 * 3.14) * radius);
		result[2] = (3.14 * (radius * radius));
		return result;
		
	}

}
