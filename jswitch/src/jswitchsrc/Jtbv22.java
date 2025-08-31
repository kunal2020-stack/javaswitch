package jswitchsrc;

class Calculator{
	
//	just below is normal example
	public int add (int n1,int n2) {
		int r = n1+n2;
		return r;
	}
	
//	just below is the example of the method overloading
	public int sum(int n1,int n2) {
		return n1+n2;
	}
	
	public int sum(int n1,int n2, int n3) {
		return n1+n2+n3;
	}
	
	public double sum(int n1,double n3) {
		return n1+n3;
	}
}

public class Jtbv22 {
	public static void main (String []args) {
		int num1 = 5;
		int num2 = 9;
		
		Calculator calc = new Calculator();
		int result = calc.add(num1, num2);
		System.out.println(result);
		System.out.println("-------- SEPARATOR TEXT ---------");
		
		Calculator s1= new Calculator();
		
		System.out.println(s1.sum(1, 2));
		System.out.println(s1.sum(1, 2, 3));
		System.out.println(s1.sum(1, 2.9));
	}

}
