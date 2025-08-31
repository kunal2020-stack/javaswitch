package jswitchsrc;

class Computer{
	
	public void playMusic() {
		System.out.println("Playing Music....");
	}
	
	public String getMeApen(int cost) {
		if (cost >=10)
			return "PEN";
		return "Nothing";
	}
}

public class Jtbv24 {
	public static void main(String []args) {
		
		Computer obj = new Computer();
		obj.playMusic();
		
		String str = obj.getMeApen(2);
		System.out.println(str);
	}
	

}
