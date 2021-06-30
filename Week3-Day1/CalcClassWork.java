package week3.day1;

public class CalcClassWork {
	
	public void addNum(int num1, int num2) {
		System.out.println(num1+num2);

	}

	public void addNum(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);

	}
	
	public void mulNum(int num1, int num2) {
		System.out.println(num1*num2);

	}
	
	public void mulNum(int num1, double num2) {
		System.out.println(num1*num2);

	}
	
	public void subNum(int num1, int num2) {
		System.out.println(num1-num2);

	}
	
	public void subNum(double num1, double num2) {
		System.out.println(num1-num2);

	}

	public void divNum(int num1, int num2) {
		System.out.println(num1/num2);

	}
	
	public void divNum(double num1, int num2) {
		System.out.println(num1/num2);

	}
	
	public static void main(String[] args) {
		
		
		CalcClassWork runCalc = new CalcClassWork();
		runCalc.addNum(1, 2);
		runCalc.addNum(1, 2, 3);
		runCalc.subNum(2, 1);
		runCalc.subNum(2.444, 1.333);
		runCalc.mulNum(1, 3.4444);
		runCalc.mulNum(2, 3);
		runCalc.divNum(2.333, 8);
		runCalc.divNum(6, 3);
	}
}
