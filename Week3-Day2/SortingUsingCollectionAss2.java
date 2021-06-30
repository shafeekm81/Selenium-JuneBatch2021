package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)
//get the length of the array	
//sort the array
//Iterate it in the reverse order
//print the array
//Required Output: Wipro, HCL , CTS, Aspire Systems

public class SortingUsingCollectionAss2 {

	public static void main(String[] args) {

//		String[] inputVal = { "HCL", "Wipro", "Aspire Systems", "CTS" };
//		int inputLength = inputVal.length;
//		Arrays.sort(inputVal);
//
//		for (int i = inputLength - 1; i >= 0; i--) {
//
//			System.out.println(inputVal[i]);
//
//		}

		// Another Way to sort the given String

		String[] inputVal = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		int inputLength = inputVal.length;
		List<String> addToList = new ArrayList<String>();

		for (int i = 0; i < inputLength; i++) {

			addToList.add(inputVal[i]);

		}

		Collections.sort(addToList);

		for (int i = inputLength - 1; i >= 0; i--) {

			System.out.print(addToList.get(i)+", ");

		}

	}

}
