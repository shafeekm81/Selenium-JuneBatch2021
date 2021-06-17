package week1.day2;

import java.util.Arrays;

/*
 * Pseudo Code
  
 *Declare a String 
	String text1 = "stops";
 *Declare another String
	String text2 = "potss"; 
 * a) Check length of the strings are same then (Use A Condition)
 * b) Convert both Strings in to characters
 * c) Sort Both the arrays
 * d) Check both the arrays has same value
 * 
 */

public class AnagramAss5 {

	public static void main(String[] args) {

		String text1 = "shafeek";
		String text2 = "keefash";

		if (text1.length() == text2.length()) {

			char[] textCase1 = text1.toCharArray();
			char[] textCase2 = text2.toCharArray();
			Arrays.sort(textCase1);
			Arrays.sort(textCase2);
//			System.out.println(text1);
//			System.out.println(text2);
//			System.out.println(textCase1);
//			System.out.println(textCase2);
			text1 = new String(textCase1);
			text2 = new String(textCase2);

			if (text1.equals(text2))
				System.out.println("Given text is Anagram");
			else
				System.out.println("Given text is not an Anagram");

		} else {
			System.out.println("Length Mismatch");
		}

	}

}
