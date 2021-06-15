package week1.day1;

public class FactorialWork {

	public static void main(String[] args) {

		int inputVal = 10;

		int factResult = 1;

		for (int i = 1; i <= inputVal; i++) {

			factResult = factResult * i;

		}

		System.out.println(factResult);

	}

}
