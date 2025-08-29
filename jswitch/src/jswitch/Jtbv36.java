package jswitch;

public class Jtbv36 {

	public static void main(String[] args) {
		
/*		StringBuffer is a class in java with the help of which we can create a mutable string in java.
		It provides multiple inbuilt function to process or perform operation on java.
		By default the string buffer have capacity of 16 so no value it will have 16 and then if value aat the time of object creation
		then the length of the value+16 		is the capacity of the string buffer; (Length and capacity are two different things.) 
*/
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); //this will result 16
		System.out.println(sb.length());
		System.out.println(sb);
		
		sb.append("Kunal");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append("123456789101112131415161718192921");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());

	}

}
