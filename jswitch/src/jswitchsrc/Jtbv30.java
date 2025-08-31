package jswitchsrc;

public class Jtbv30 {
	public static void main(String []args) {
		
//		below code is the example of the jagged array
		int nums[][] = new int[3][];
		
		//defining the size of the array at position as this is jagged array so we need to do this;
		nums[0] = new int[1];
		nums[1] = new int[2];
		nums[2] = new int[3];
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				nums[i][j] = (int) (Math.random() * 10);
			}
		}
		
		for(int n[] :nums) {
			for(int m: n) {
				System.out.print(m+" ");
			}
			System.out.println("");
		}
	}

}
