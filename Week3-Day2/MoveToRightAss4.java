package week3.day2;

import java.util.LinkedList;
import java.util.List;

//int[] num = {4,0,3,0,1,5,2,0}
//move all the 0 to the right 
//output:  4,3,1,5,2,0,0,0

public class MoveToRightAss4 {

	public static void main(String[] args) {

		int[] num = { 4, 0, 3, 0, 1, 5, 2, 0 };
		List<Integer> ZeroValues = new LinkedList<Integer>();
		List<Integer> nonZeroValues = new LinkedList<Integer>();
		for (int i = 0; i < num.length; i++) {

			if (num[i] == 0) {
				ZeroValues.add(num[i]);
			} else
				nonZeroValues.add(num[i]);

		}
//		System.out.println(ZeroValues);
//		System.out.println(nonZeroValues);
		nonZeroValues.addAll(ZeroValues);
		System.out.println(nonZeroValues);

	}

}
