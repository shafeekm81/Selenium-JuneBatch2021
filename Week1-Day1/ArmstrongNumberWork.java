package week1.day1;

public class ArmstrongNumberWork {

	public static void main(String[] args) {

		int inputVal = 153, calcVal = 0, remVal, origVal;
		origVal = inputVal;

		while (inputVal > 0) {

			remVal = inputVal % 10;

			calcVal = calcVal + (remVal * remVal * remVal);

			inputVal /= 10;

		}

		if (calcVal == origVal)
			System.out.println("Given number " + origVal + " is an Armstrong number");
		else
			System.out.println("Given number " + origVal + " is NOT an Armstrong number");

	}

}
