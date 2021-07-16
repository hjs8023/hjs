
public class 증가및감소연산자postfix95P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		System.out.print((num++) + " "); //  일단 출력후에 다음문장에 값이 증가  5
		System.out.print((num++)+ " ");	//  일단 출력후에 다음문장에 값이증가 6
		System.out.print(num + "\n");   // 7
		
		System.out.print((num--) + " ");		// 일단 n 출력후에 값이감소 7
		System.out.print((num--) + " ");		//   이전문장- 1 출력후 다음문장에 -1감소 6
		System.out.print(num);	// 5
	

	}

}
