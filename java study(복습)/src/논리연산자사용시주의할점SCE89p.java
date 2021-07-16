
public class 논리연산자사용시주의할점SCE89p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);  // n1에 10증가한게 0보다 작은가, n2에 10을증가한게 0보다 큰가 논리연산자&& 둘다트루이면t 아니면 f
		System.out.println("result = " + result);  //result   false반환  왼result 논리연산자 오른쪽result false  결과 false
		System.out.println("num1 =" + num1);	// 왼쪽num1=0 + 오른쪽num1 = 0+=10  결과 10
		System.out.println("num2=" + num2 + '\n'); // 왼쪽num1=0 + 오른쪽num1 = 0+=10  결과 10   '\n'은 개
		
		// && 의 왼편에 있는 연산이 먼저 진행된다. 따라서 num1 의 값은 증가한다. 그리고 <연산의 결과는 false이니 오른편에 무엇이 오든 &&의 연산결과는 false이다 따라서
		// 오른편 연산을 진행하지 않고 &&의 연산결과로 false를 반환하고   num2의 값은 증가하지않는다.
		
		
		
		
		
		result = ((num1 +=10) > 0) || ((num2 +=10) > 0); // n1에 10증가한게 0보다 큰가  n2에 10 증가한게 0보큰가 논리연산자|| 둘중하나라도 맞으면 트루루루
		System.out.println("result =" + result); // result true   반환  왼result 논리연산자 오른쪽result true  결과 true
		System.out.println("num1=" + num1);  // 왼쪽num1=0 + 오른쪽num1 = 0+=10  결과 10
		System.out.println("num2 =" + num2);  // 왼쪽num2=0 + 오른쪽num2 = 0+=10  결과 10
		
		
		//  || 의 왼편 true이니 오른편에 무엇이 오든 ||의 연산 결과는true이다 따라서 오른편 연산은 진행하지않고 ||의 연산 결과로 true가 반환된다.
		// 결국 이경우에도 num2의 값은 증가하지않는다.
		
		
		num1 += 10;
		num2 += 10;
		result = (num1 <0) && (num2 >0);
		System.out.println(result);
		// 이렇게 코드를 나누어 작성하는것이 좋다.  SCE와 관련엾는 상황이라도 말이다.
	
	}

}
