
public class while문119P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0 ;
		
		while(num < 5) {  // num < 5 을 만족하면 반복실행
			System.out.println(" I like java" + num);
			num++;
		}
	}

	/*	while문의 소괄호에는 반복의 조건을 명시한다.  true 또는  false가 와야하므로
	 * 이를 반환하는 연산이 오게된다.
	 * 1.먼저! 조건 검사
	 * 2. 그리고 결과가 true이면 중괄호 영역 실행
	 * 조건 검사가 먼저 진행되기 때문에 처음부터 false가 반환되면 while문의
	 * 중괄호는 한번도 실행되지 않을수 있다. 반면에 true만 반환하도록 구성된다면
	 * while문을 벗어나지 못하는 문제가 발생할수 있으니 주의 해야한다.
	 * while문의 중괄호도 반복 실행할 문장이 하나라면 생략 가능하다.
	 */
}
  