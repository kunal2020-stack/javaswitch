package jswitchsrc;

class Mobiles{
	String brand;
	int price;
	String name;
	static String coutnryOfOrigin;
	
//	the below method is an example of the instance method;
	void show() {
		System.out.println(brand+": "+price+": "+name+": "+coutnryOfOrigin);
	}
	
//In static method we cannot directly use the non-static variable so basically a static variable can be used inside the non-static class
//	but the static method cannot except the non-static variable.
	
	//	the below method is an example of the static method;
	static void show1() {
		System.out.println("coutnryOfOrigin: "+coutnryOfOrigin);
	}
	
//	The only way to use the static variable inside the static one is using object reference.
	static void show2(Mobiles obj) {
		System.out.println(obj.brand+": "+obj.price+": "+obj.name+": "+coutnryOfOrigin);
	}
}

public class Jtbv38 {
	
/*	Why we always use static with main function ?
	-> The reason is the this the starting point of the code compiler begin its execution from here only and it is mentioned inside the class
	as in java everything is wrapped inside class so to call the main function we would have to create a instance of the class and the we will able
	to call compile the main function but code will begin from only after this we can create instance so this must me executed without creating
	the object of the class. so we are making it static so it can directly be called using class name. */

	public static void main(String[] args) {
		Mobiles.coutnryOfOrigin = "India";
		Mobiles.show1();
//		Mobiles.show();//this will always give error as non static method cannot called in way as static one
//		Why the above query will always result in error because the method is instance method so it will change with the instance 
//		so it will give error as it is not provided which instance to refer.
		
		Mobiles obj = new Mobiles();
		obj.brand = "Apple";
		obj.price = 75000;
		obj.name = "AIPhone";
		Mobiles.show2(obj);
		
/*	In the above set of query we are calling the non static method in a static way but it is not giving error the reason is that
		we are now providing the resolution that you have to refer obj while calling the static method so there will no be any reference 
		issue as reference is specified to obj. */
		

	}

}
