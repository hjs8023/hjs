
public class 논리연산자LogicalOp87p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 11;
		int num2 = 22;
		boolean result;
		
		// 변수 num1에 저장된 값이 1과 100사이의 수인가?
		result = (1 < num1) && (num1 < 100);
		System.out.println("1 초과 100미만인가?" + result);  //논리and 연산 이용  둘다 트루이면 트
		
		// 변수 num2에 저장된 값이 2 또는 3의 배수인가?
		result = ((num2 % 2) == 0) 	|| ((num2 % 3) == 0);
		System.out.println("2또는 3의 배수인가?" + result);  // 논리 or 연산 이용 둘중 하나라도 트루이면 결과는 트
		
		// 변수 num1이 0인가?
		result = !(num1 !=0);
		System.out.println("0인가?" + result);   // 논리 not 연산 이용  a가 트루이면 f 트루아니면 t
	}

}
