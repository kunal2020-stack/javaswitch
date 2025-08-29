package jswitch;

class Mobile{
//	the below mentioned variable are called instance variable and it is for every instance of the class i.e. every object of the class.
	String brand;
	int price;
	String name;
	
//	the below mentioned variable are the static variable and these are also called class variable it is created once and remains same for all the instances of the class.
//	These can be called traditionally with the help of the object but it is always recommended to call it by using the class name directly.
	static String coutnryOfOrigin;
	
	void show() {
		System.out.println(brand+": "+price+": "+name+": "+coutnryOfOrigin);
	}
	
}

public class Jtbv37 {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.brand = "Apple";
		m1.price = 75000;
		m1.name = "SmartPhone";
		m1.coutnryOfOrigin = "India"; //here you can see the warning stating that use it in a static way i.e. directly using class name.
		m1.show();
		
		Mobile m2 = new Mobile();
		m2.brand = "Samsung";
		m2.price = 65000;
		m2.name = "CellPhone";
		Mobile.coutnryOfOrigin = "Africa";//this is correct way of calling the static variable
		
		m2.show();
		m1.show();//now as value of the static variable is changed once so it will reflect for entire class irrespective of the object.

	}

}
