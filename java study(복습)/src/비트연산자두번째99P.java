
public class 비트연산자두번째99P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte n1 = 5; // 00000101
		byte n2 = 3; // 00000011
		byte n3 = -1; // 11111111
		
		byte r1 = (byte)(n1 & n2);  // 00000001 (and연산)
		byte r2 = (byte)(n1 | n2);  // 00000111 (or연산)
		byte r3 = (byte)(n1 ^ n2);  // 00000110	(xor연산)
		byte r4 = (byte)(~n3);  	// 00000000 (not연산)
		
		System.out.println(r1);	// 000000001은 1
		System.out.println(r2);	// 00000111은 7
		System.out.println(r3);	// 00000110은 6
		System.out.println(r4); // 00000000은 0
	}

}
