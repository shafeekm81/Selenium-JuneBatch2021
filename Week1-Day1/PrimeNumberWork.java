package week1.day1;

public class PrimeNumberWork {

	public static void main(String[] args) {

		int inputValue = 20;
		boolean isPrime = false;

		for (int i = 2; i <= inputValue / 2; i++) {

			if (inputValue % i == 0) {

				isPrime = true;
				break;

			}

		}
		if (isPrime == true) {

			System.out.println("The given number: " + inputValue + " is not a PrimeNumber");
		} else
			System.out.println("The given number: " + inputValue + " is a PrimeNumber");
	}
}
