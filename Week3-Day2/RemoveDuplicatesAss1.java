package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

//Declare a String as PayPal India
//Convert it into a character array
//Declare a Set as charSet for Character
//Declare a Set as dupCharSet for duplicate Character
//Iterate character array and add it into charSet
//if the character is already in the charSet then, add it to the dupCharSet
//Check the dupCharSet elements and remove those in the charSet
//Iterate using charSet
//Check the iterator variable isn't equals to an empty space
//print each character for charSet

// String str = "PayPal India";
// 
// Expected output: ylIndi
// 1. Convert to character array ch[]
// 2. Have 2 empty sets

// --> charSet - Store the unique chrs
// --> dupCharSet - store all the duplicate characters

// 3. Add all ch[] to charSet
// P
// a
// y
// P -- will not be added to the set
// o/p: Payl Indi
//      ylIndi

// 4. when the dup chrs are not added, put it inside the dupCharSet
// o/p : Pa
// 5. charSet.removeAll(dupCharSet)
// o/p : yl Indi
// 6. Remove the space

public class RemoveDuplicatesAss1 {

	public static void main(String[] args) {

		String givenInput = "PayPal India";

		char[] charInput = givenInput.toCharArray();

		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		for (Character c : charInput) {

			if (!charSet.add(c))
				dupCharSet.add(c);
		}
		System.out.println("Given string: " + givenInput);

		charSet.removeAll(dupCharSet);

		System.out.println("Duplicate Words: " + dupCharSet);
		System.out.println("After Duplicate Words removed: " + charSet);

		Set<Character> fnalVal = new LinkedHashSet<Character>();

		for (Character spacChar : charSet) {
			if (spacChar == ' ') {
				continue;
			}

			if (charSet.add(spacChar) == false)
				fnalVal.add(spacChar);

		}
		System.out.println("After space is removed: " + fnalVal);

	}

}
