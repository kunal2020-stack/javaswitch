package jswitchsrc;

public class Calc extends BasicCalculator {

	public static void main(String[] args) {
		Calc c1 = new Calc();
		int add = c1.add(1, 2);
		int sub = c1.sub(2, 1);
	// 	int mul = c1.mul(2, 2);
	// 	int div = c1.div(1, 2);
		
		System.out.println("Addtion: "+add);
		System.out.println("Subtraction: "+sub); //there
	}

}
