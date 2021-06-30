package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

//Print the duplicates using collection
//int[] data= {1,3,8,3,11,5,6,4,7,6,7};
//output: 3,6,7

public class PrintDuplicateAss5 {

	public static void main(String[] args) {

		int[] data = { 1, 3, 8, 3, 11, 5, 6, 4, 7, 6, 7 };

		Set<Integer> originalVal = new LinkedHashSet<Integer>();
		Set<Integer> dupNumbers = new LinkedHashSet<Integer>();

		for (Integer findDups : data)

		{

			if (!originalVal.add(findDups))
				dupNumbers.add(findDups);

		}

		System.out.println("Duplicate numbers are: " + dupNumbers);

	}

}
