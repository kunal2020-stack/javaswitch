package jswitch;

public class Jtbv35 {

	public static void main(String[] args) {
		
//		both of the below string creation and assigning value does same as both create and object
		
		String FirstName = "Kunal";
		String LastName = "Kumar";
		
		System.out.println(FirstName+" "+LastName);
		
//		Some more detailed insight about the string
		String s1= "kunal";
		s1 = s1 + " kumar";
		
		String s2="India";
		String s3="India";
		System.out.println(s2==s3);//referencing the same object
		
/*		at both of the above line we are just appending some more string to the existing string but that does not how exactly work
		rather it created another reference in the string constant pool which is apart of the heap memory.
		While in the another example of s2 and s3 it does not acquire memory again rather it used the existing one as both are same so only
		one time value is stored while the non referenced value are eligible for the garbage collection.
		How exactly String constant pool work is that it matches the string value if exists it refer to the old one else it create new 
		one there.
//		String are immutable by default but we can also use mutable string using string buffer and string builder. */

	}

}
