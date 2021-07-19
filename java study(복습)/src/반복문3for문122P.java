
public class 반복문3for문122P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  반복의 횟수가 정해져 있는 상황 에서는 for문을 이용해서 다음과같이 작성하는것이 더
		 * 간결하고 뜻도 잘통한다. 한문장이므로 중괄호는 생략가능하다.
		 * 
		 * for(int num =0; num < 5; num++){
		 * 	System.out.println("I Love java")
		 * }
		 * 정해진 횟수의 반복을 위해 사용하는 것이 for문이다.
		 * 1.반복의 회수를 세기위한 변수
		 * 2.반복의조건.
		 * 3.반복의 조건을 무너뜨리기위한연산
		 * 
		 * for문은 while 문과 달리 반복에필요한 모든것을 한 줄에 나열 할 수있다.
		 */
		for(int i = 0; i <5; i++)
			System.out.println("I love java" + i);
	}
	/*   1. int i = 0
	 * 	2. i < 3
	 * 3. System.out.println
	 * 4. i++
	 * 
	 * 루프의 흐름 
	 * 1. 1234
	 * 2.	234
	 * 3. 	234
	 * 4.  2번 i는 3이므로 탈출 !
	 * 
	 * 1.변수선언및 초기화
	 * 2. 반복 조거ㅓㄴ이 true인지 확인
	 * 3. 반복영역을 실행 (반복 조건이 true이면)
	 * 4.  변수의 값 증
	 */

}
