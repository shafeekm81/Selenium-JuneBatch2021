package week1.day1;

public class Mobile {

	public String mobileModel = "SamsungS10";
	public int mobileWeight = 250;
	public boolean isFullCharged = true;
	public double mobileCost = 9999.99;

	public void makeCall() {

//		System.out.println("Make a Call");
		System.out.println("Mobile Model is " + mobileModel);
		System.out.println("Mobile Weight is " +mobileWeight + " grams");
	}

	public void sendMsg() {

//		System.out.println("Send the message");
		System.out.println("Mobile is Fully Charged " +isFullCharged);
		System.out.println("Mobile Cost is " +mobileCost);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile phoneFeature = new Mobile();
		phoneFeature.makeCall();
		phoneFeature.sendMsg();

	}

}
