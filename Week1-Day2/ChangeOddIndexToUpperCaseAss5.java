package week1.day2;

public class ChangeOddIndexToUpperCaseAss5 {

	public static void main(String[] args) {

		String inputVal = "shafeek";

		String outputVal = "";

		for (int i = 0; i < inputVal.length(); i++) {

			char charArray = inputVal.charAt(i);

			if (i % 2 != 0)
//				
				charArray = inputVal.toUpperCase().charAt(i);

			outputVal = outputVal + charArray;

		}
		System.out.println(outputVal);

		// 1,3,5,7

//		

	}

}
