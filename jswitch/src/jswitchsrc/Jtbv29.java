package jswitchsrc;

public class Jtbv29 {
	public static void main (String []args) {
		
		int nums[][] = new int[3][4];
		
//		assigning random value to the array using inbuilt function
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				nums[i][j] = (int) (Math.random() *10); //function returns value between 0.0 and 1.0(not included)
			}
		}
		
		
		
		
//		printing values using normal for loop
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		System.out.println("-----SEPARATOR TEXT-----");
		
//		printing the value using for-each loop  -> for each loop cannot be used to assign value t the array as access to index is not provider it can just iterate through the elements only.
		for(int n[]:nums) {
			for(int m:n) {
				System.out.print(m+" ");
			}
			System.out.println("");
		}
	}

}
