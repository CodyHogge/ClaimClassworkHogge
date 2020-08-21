package week2;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// Write a method to remove a given character from a string
		//System.out.println(remLetter(0)); //remove a certain letter
		
		// Write a method to remove duplicate letters
		//System.out.println(remDoubleLetter(0));
		
		// Write a method to calc vowels & consonants
		//System.out.print(countVowel(0));
		
		// Write a method to display non repeated chars first, then any repeated chars after
		// morning -> morignn
		//System.out.print(repChars(0));

	}
	//Main is above, methods are below
	public static int[] countVowel(int x) {
		System.out.print("Please enter a word: " );
		Scanner wordsc = new Scanner(System.in);
		String word = wordsc.next().toLowerCase();
		int vowels = 0;
		char[] letArray = new char[word.length()]; //Creates a char array to hold the number of char's in the word
		for(int i = 0; i < word.length(); i++) { //places each letter into array
			letArray[i] = word.charAt(i);
		}
		for(int j = 0; j < word.length(); j++) {
			if(letArray[j] == 'a' || letArray[j] == 'e' || letArray[j] == 'i' || letArray[j] == 'o' || letArray[j] == 'u' ){
				vowels++;
			}
		}
		int[] results = new int[2];
		int consonants = word.length() - vowels;
		results[0] = vowels;
		results[1] = word.length() - vowels;
		System.out.println("The number of vowels: " + vowels + ".");
		System.out.println("The number of consonants: " + consonants + ".");
		return results;
	}
	
	public static String remLetter(int x) {
		String wordresult = "";
		System.out.print("Please enter a word: " );
		Scanner wordsc = new Scanner(System.in);
		String word = wordsc.next();
		System.out.print("And the letter you would like removed from that word: ");
		Scanner letsc = new Scanner(System.in);
		char forbidletter = letsc.next().charAt(0);
		
		
		char[] letArray = new char[word.length()]; //Creates a char array to hold the number of char's in the word
		for(int i = 0; i < word.length(); i++) { //places each letter into array
			letArray[i] = word.charAt(i);
		}
		for(int j = 0; j < word.length(); j ++) { //checks each letter for the forbidden char
			if(letArray[j] != forbidletter) {     //and places them into the result string
			wordresult = (String) wordresult + letArray[j];
			}
		}
		return wordresult.strip(); //.strip() removes any spaces before & after the String
	}
	
	public static String remDoubleLetter(int x) {
		String wordresult = "";
		System.out.print("Please enter a word: " );
		Scanner wordsc = new Scanner(System.in);
		String word = wordsc.next();
				
		
		char[] letArray = new char[word.length()]; //Creates a char array to hold the number of char's in the word
		for(int i = 0; i < word.length(); i++) {   //places each letter into array
			letArray[i] = word.charAt(i);
		}
		for(int j = 0; j < word.length(); j ++) { 
			if(j < word.length() - 1) {  //This looks at all chars EXCEPT the last due to invalid index
				                         //i.e. "goofy" ind[4] = y, can't compare to ind[5 "(4+1)"] 
										 //because it doesn't exist
				
				if(j == 0 && letArray[j] != letArray[j+1]) { //this looks at the 1st char and compares to 2nd
															 //needed separate IF because index[0-1] doesn't exist 
					wordresult = (String) wordresult + letArray[j];
				}
			}
			if(j < word.length() - 1) { //this IF looks at letter ahead, and letter behind "goofy"
										// g!=o, o==o, o!=f, f!=y -> gofy
				if(j > 0 && letArray[j] != letArray[j +1] && letArray[j] != letArray[j -1]) {
					wordresult = (String) wordresult + letArray[j];
				}
			}
			if(j == word.length() - 1) {
				if(letArray[j] != letArray[j-1]) {
					wordresult = (String) wordresult + letArray[j];
				}
			}
			}
		
		return wordresult.strip(); //.strip() removes any spaces before & after the String
	}

	public static String repChars(int x) {
		String wordresult = "";
		int rval = 1;
		char rchar = 0;
		String rchar2 = "";
		
		System.out.print("Please enter a word: " );
		Scanner wordsc = new Scanner(System.in);
		String word = wordsc.next().toLowerCase();
		char[] letArray = new char[word.length()]; //Creates a char array to hold the number of char's in the word
		for(int i = 0; i < word.length(); i++) { //places each letter into array
			letArray[i] = word.charAt(i);
		}
		for(int j = 0; j < word.length(); j++) {			//Tests each letter to see
			for(int k = j + 1; k < word.length(); k++) {	//if it repeats in the word
				if(letArray[j] == letArray[k]) {			//if a letter repeats it is stored
					rchar = letArray[j];				//in "rchar" then converted to a string
					rchar2 = String.valueOf(rchar);
					rval++; //rval is the number of times a letter repeats, i.e. morning 'n' repeats once.
				}			//rval + 1 is the number of times the letter shows up in the string
			}
		}
		String rchar3 = rchar2; //rchar 3 holds the repeated char value
		rchar2 = rchar2.repeat(rval); //gives rchar2 a value of rchar * #of times is shows up
		wordresult = word.replace(rchar3, ""); //deletes repeated char and replaces with "no space"
		wordresult = wordresult + rchar2; //concat's the word - repeated chars then adds repeated 
		return wordresult.strip();			//chars at the end
		
	}
	
	//Method to create a char Array
	public static char[] createCharArray(String word) {
		
		char[] letArray = new char[word.length()]; //Creates a char array to hold the number of char's in the word
		for(int i = 0; i < word.length(); i++) { //places each letter into array
			letArray[i] = word.charAt(i);
	}
		return letArray;
	}
}
