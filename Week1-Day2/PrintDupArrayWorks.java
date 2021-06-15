package week1.day2;

public class PrintDupArrayWorks {

	public static void main(String[] args) {

		int[] inputVal = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

//		System.out.println(inputVal[0]);

		for (int i = 0; i < inputVal.length; i++) {

//			System.out.println(inputVal[i]);

			int countDup = 0;

			for (int j = i + 1; j < inputVal.length; j++) {

//				System.out.println(inputVal[j]);

				if (inputVal[i] == inputVal[j]) {

					countDup = countDup + 1;
//					 System.out.println(inputVal[j]);
				}

			}

			if (countDup > 0) {
				System.out.println(inputVal[i]);
			}

		}

	}

}
