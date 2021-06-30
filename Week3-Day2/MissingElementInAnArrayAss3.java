package week3.day2;

import java.util.Arrays;

public class MissingElementInAnArrayAss3 {

	public static void main(String[] args) {
		// Here is the input
		int[] arrayInput = { 1, 2, 3, 4, 7, 6, 8 };

		// Sort the array

		Arrays.sort(arrayInput);

		// loop through the array (start i from arr[0] till the length of the array)

		for (int i = 0; i <= arrayInput.length; i++) {

//				check if the iterator variable is not equal to the array values respectively
			if ((i + 1) != arrayInput[i]) {
//					print the number
				System.out.println("Missing Element is: "+(i + 1));
//				once printed break the iteration
				break;

			}

		}

	}

}
