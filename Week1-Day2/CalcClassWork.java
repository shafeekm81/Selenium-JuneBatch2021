package week1.day2;

public class CalcClassWork {
	
	
	public void addTwonum(int a, int b) {
		System.out.println(a+b);
	}
	public int addTwonum1(int a, int b) {
		int sum = a+b;
		return sum;
	}
	public void subTwonum(double a, double b) {
		System.out.println(a-b);
	}
	public int subTwonum1(int a, int b) {
		int sub = a-b;
		return sub;
	}
	public void mulTwonum(double a, double b) {
		System.out.println(a*b);
	}
	public double mulTwonum1(double a, double b) {
		double mul = a*b;
		return mul;
	}
	public void divTwonum(int a, int b) {
		System.out.println(a/b);
	}
	public int divTwonum1(int a, int b) {
		int div = a/b;
		return div;
	}
	public static void main(String[] args) {
	
		CalcClassWork calc = new CalcClassWork();
		calc.addTwonum(10, 20);
		calc.subTwonum(10.5, 20.8);
		calc.mulTwonum(10, 20.5);
		calc.divTwonum(20, 10);
		System.out.println(calc.addTwonum1(10, 30));
		int res1 = calc.subTwonum1(20, 10);
		System.out.println(res1);
		System.out.println(calc.mulTwonum1(20, 100));
		System.out.println(calc.divTwonum1(20, 10));

	}

	

}
