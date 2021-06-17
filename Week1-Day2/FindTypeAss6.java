package week1.day2;

/* Pseudo Code:
a) Convert the String to character array
b) Traverse through each character (using loop)
c) Find if the given character is what type using (if)
		i)  Character.isLetter
		ii) Character.isDigit
		iii)Character.isSpaceChar
		iv) else -> consider as special character
*/

public class FindTypeAss6 {

	public static void main(String[] args) {

		String inputVal = "#$$ Welcome to 2nd Class of Automation $$# ";

		int letter = 0, space = 0, num = 0, specialChar = 0;

		char[] textArray = inputVal.toCharArray();

		for (int i = 0; i < textArray.length; i++) {

			boolean a1 = true;

			if (a1 == Character.isLetter(textArray[i])) {

				letter++;

			} else if (a1 == Character.isDigit(textArray[i])) {
				num++;
			} else if (a1 == Character.isSpaceChar(textArray[i])) {
				space++;
			}

			else
				specialChar++;
		}

		System.out.println("Count of letter(s) in the given word is: " + letter);
		System.out.println("Count of Digit(s) in the given word is: " + num);
		System.out.println("Count of Space(s) in the given word is: " + space);
		System.out.println("Count of Special Character(s) in the given word is: " + specialChar);
	}

}
