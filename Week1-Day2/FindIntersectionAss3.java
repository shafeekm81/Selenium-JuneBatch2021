package week1.day2;

public class FindIntersectionAss3 {

	public static void main(String[] args) {

		int interVal1[] = { 3, 2, 11, 5, 6, 7 };
		int interVal2[] = { 1, 2, 8, 4, 5, 7 };
		for (int i = 0; i < interVal1.length; i++) {

			for (int j = 0; j < interVal2.length; j++) {

				if (interVal1[i] == interVal2[j]) {

					System.out.println(interVal1[i]);
				}

			}

		}

	}

}
