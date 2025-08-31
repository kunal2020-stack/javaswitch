package jswitchsrc;

public class Jtbv8 {
	public static void main (String []args) {
		
//		below section is the example of the type conversion as we are not explicitly converting byte to integer but the java itself
		int bbbb = 124;
		int aaaa = bbbb;
		System.out.println(aaaa);
		
//		below section is the example fo the type casting but the value of a is more than the range of byte so it will perform
//			modulo /reminder operation to assign the value 257 %max range of byte value
		int aaa = 257;
		int bbb = (byte) aaa;
		System.out.println(bbb);
		
//		below section is the example of the type casting as we are explicitly converting int into byte
		int aa = 127;
		byte bb = (byte)aa;
		System.out.println(bb);
		

		
		//		below is the example of the type promotion
		byte a = 10;
		byte b = 30;
		
		int result = a*b;
		System.out.println(result);
	}

}
