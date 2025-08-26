package jswitch;

public class Jtbv30p2 {

	public static void main(String[] args) {
	
//		below code is an example of the multidimensional array;
		int nums[][][] = new int[3][3][3];
		
		for(int i =0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					nums[i][j][k] = (int) (Math.random()*10);
				}
			}
		}
		
		for(int n[][]:nums) {
			for (int m[]:n) {
				for (int l:m) {
					System.out.print(l+" ");
				}
				System.out.print(" ");
				
			}
			System.out.println("");
		}

	}

}
