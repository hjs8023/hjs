
public class dowhile문121P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  while문은 선검사 방식이고 do while문은 후검사 방식이다.
		
		int num = 0;
		
		do {
			System.out.println("I like java" + num);   // 반복영역
			num++;  // 반복 영역
		} while (num < 5);  // 반복 조건
	}

			/* while문으로 작성된 문장은 do~ while문으로도 작 성 가능하고
			 *  또 그반대로 가능한 경우가 대부분이다. 
			 *  조건에 따른 반복이 필요하다. 그런데 반드시 한번은 실행을 해야한다.
			 */
}
