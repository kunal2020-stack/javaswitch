package jswitchsrc;
//there is one special space in jvm called class loader which load the class every time the instance of the class is created.

class Mobiless{
//	In java everytime the object created and we have initialisation in contructor so it do so everytime the object is created so if we 
//	want to to do something only one for that we can use static block
	
	String name;
	static String countryOfOrigin;
	static {
		
		countryOfOrigin = "India";
		System.out.println("Inside the static class");
	}
	public Mobiless() {
		name = "Apple";
		System.out.println("Inside the consturor.");
		
	}
}
public class Jtbv39 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
//		Mobiless m1= new Mobiless();
//		Mobiless m2= new Mobiless();
//		Mobiless m3= new Mobiless();
		
//		the output of the code will be "Inside the static block" X 1
//		"Inside the constructor" X 2;
		
		Class.forName("jswitch.Mobiless");//this will load the clasee using sytem class loader
		
//		If above code is commented then there will no execution of the class so to acheive this wihtout creating the object by using class 
//		class

	}

}
