package week2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Lab3_2 {

	public static void main(String[] args) {
		//Write a method to count the number of occurrences in a char array
		//System.out.print("Please enter the number of letters in your array: ");
		//Scanner numsc = new Scanner(System.in);
		//int y = numsc.nextInt();
		/*
		System.out.print("Please enter a letter to scan for: ");
		Scanner lettersc = new Scanner(System.in);
		String letter = lettersc.next().substring(0, 1);
		char[] test = new char[y];
		countLetter(createCharArray(y), letter);
		*/
		
		//Write a method to remove all white spaces from a char array
		//removeBlanks(createCharArray(y));
		
		//Write a method to find duplicate characters in a char array
		//findDuplicates(createCharArray(y));
		
		//Write a method to display words in reverse order (1,2,3 -> 3,2,1)
		System.out.println("Please enter the sentence to be reversed below:");
		Scanner sentencesc = new Scanner(System.in);
		String sentence = sentencesc.nextLine();
		System.out.println(reverseOrder2(sentence));

	}
	
	public static int countLetter(char[] array, String a) {
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == a.charAt(0)) {
				count++;
			}
		}
		System.out.println("The number of " + a + "'s in your array: " + count);
		return count;
	}
	
	public static char[] createCharArray(int x) {
		char[] array = new char[x];
		Scanner inputsc = new Scanner(System.in);
		for(int i=0; i < x; i++) {
			System.out.print("Please enter a letter: ");
			array[i] = inputsc.nextLine().charAt(0);
					
		}
		return array;
	}
	
	public static char[] removeBlanks(char[] array) {
		String arrayword = "";
		char[] result = new char[arrayword.length()];
		for(int i= 0; i < array.length; i++) {
			arrayword = arrayword + array[i];
		}
		arrayword = arrayword.replaceAll(" ", "");
		result=createCharArrayFromString(arrayword);
		System.out.println(result);
		return result;
		
		
	}
	
	public static char[] createCharArrayFromString(String word) {
		char[] nArray = new char[word.length()];
		for(int i = 0; i < word.length(); i++) {
			nArray[i] = word.charAt(i);
		}
		return nArray;
	}
	
	public static char[] findDuplicates(char[] array) {
		char[] duplicates = new char[array.length];
		boolean repeat;
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j< array.length -1; j++) {
				if(array[i] == array[j]) {
					repeat = true;
					if(repeat == true) {
						duplicates[i] = array[i];
					}
				} else repeat = false;
			}
			
		}
		removeBlanks(duplicates);
		return duplicates;
	}
	
	public static String reverseOrder2(String input) {
		String[] strArray = input.split(" ");
		String result = "";
		for(int i=strArray.length -1; i>=0;i--){
			String temp = strArray[i];
			result = result + " " + temp;
		}
		return result.trim();
	}
	
	public static String reverseOrder(String input) {
		int words = 1;
		char[] chArray = new char[input.length()];
		chArray = createCharArrayFromString(input);
		for(int i = 0; i< chArray.length; i++) {
			if(chArray[i] == ' ') {
				words++;
			}			
		}
		String[] strArray = new String[words];
		String test = "";
		int wordbreak = 0;
		for(int j=0;j<words;j++) {
			for(int k = 0; chArray[k] != ' ';k++) {
			if(chArray[k] != ' ') {
				test= test+test.valueOf(chArray[k]);
			strArray[j] = test;
			wordbreak = k +1;
			}
			}
			
		
		}
		System.out.println(chArray.length);
		System.out.println(strArray[0]);
		System.out.println(strArray[1]);		
		System.out.println(wordbreak);
	return input;
	}

}
