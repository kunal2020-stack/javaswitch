package jswitch;

class Demo{
	Demo(){
		System.out.println("Object created.\n Inside the constructor.");
	}
	
	void show() {
		System.out.println("Inside the show method.");
	}
}
public class Jtbv46 {

	public static void main(String[] args) {
		
//		there are two step involve in object created what we have done till now
//		declaration and initialization same as normal variable
		Demo d;//declaration
		d= new Demo(); //initialization
		System.out.println("---- SEPARATOR TEXT ----");
		
//		but we can directly reference the class i.e. without reference object
		new Demo(); //anonymous object
//		even we can call the method of the class without need of the reference variable but this will create object always an anonymous object whenever it is called unlike the reference object which refer to same address when called again and again
		System.out.println("---- SEPARATOR TEXT ----");
		new Demo().show();
	}

}
