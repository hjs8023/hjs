
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
		
		  //  비트열을 왼쪽으로 항칸 밀고 빈 공간을 0으로 채울 때마다 그값은 두배로 증가
		  // >> 연산을 통해 비트열을 오른쪽으로 밀면 빈공간은 가장왼쪽에 위치한 비트와 동일한 값으로 채워진다. 부호비트가 0이면 0 1이면 1을 채운다
		  //  >> 연산을 통해서 비트 열을 한 칸씩 오른쪽으로 밀때 마다 2로 나눈 결과가 반환된
	}

}
