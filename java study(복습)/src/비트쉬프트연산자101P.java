
public class 비트쉬프트연산자101P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte num;
		
		num = 2;  	// 00000010
		System.out.print((byte)(num << 1) + " ");  // 00000100
		System.out.print((byte)(num << 2) + " ");  // 00001000
		System.out.print((byte)(num << 3) + " " + "\n"); 	// 00010000
		
		num = 8;  // 00001000
		System.out.print((byte)(num >> 1) + " "); 	// 00000100
		System.out.print((byte)(num >> 2) + " ");		// 00000010
		System.out.print((byte)(num >> 3) + " " + "\n");  // 00000001
		
		num = -8; // 11111000
		System.out.print((byte)(num >> 1) + " "); 	// 11111100
		System.out.print((byte)(num >> 2) + " ");		// 11111110
		System.out.print((byte)(num >> 3) + " " + "\n"); // 11111111
	}

}
