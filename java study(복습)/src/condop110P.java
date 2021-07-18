
public class condop110P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1= 50;
		int num2= 100;
		int big;
		int diff;
		
		big = (num1 > num2) ? num1 : num2; 	//  ? 기호 왼편 false이므로  : 기호 오른쪽있는 num2 반환
		System.out.println("큰 수:" + big); 	// ? 기호 왼편 true 이므로  :기호 왼쪽 있는 num1 반환
		
		diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		System.out.println("절대값 :" + diff);
		
		/* 기호 ?의 왼편이 true이면 기호 : 의 왼편에 있는 수가 반환된다.
		 * 기호 ? 의 왼편이 false이면 기호 : 의 오른편에 있는 수가 반환된다.
		 * 값이 와야 할 위치에 뺄셈이나 덧셈과 같은 연솬이 올 수있다
		 * diff = (num1 > num2) ? -50 : 50;
		 */
	}

}
