package week1.day2;

public class PalindromeCheckAss4 {

	public static void main(String[] args) {

		String inputText = "Malayalam";
		String revText = "";

		char[] charArray = inputText.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {

//			System.out.println(charArray[i]);
			revText = revText + inputText.charAt(i);

		}

		if (inputText.equalsIgnoreCase(revText)) {

			System.out.println("Given text " + inputText + " is palindrome");
		} else
			System.out.println("Given text " + inputText + " is not palindrome");

	}

}
