package week1.day1;

public class FibonocciSeriesWork {

	public static void main(String[] args) {

		int firstNum = 0, secNum = 1, sum = 0, range = 8;

		System.out.println(firstNum);
		System.out.println(secNum);

		for (int i = 1; i < range-1; i++) {

			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);

		}

	}

}
