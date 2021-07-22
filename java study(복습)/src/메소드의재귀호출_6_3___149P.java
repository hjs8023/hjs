

public class 메소드의재귀호출_6_3___149P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  재귀를 많이 쓸일이 없다.
		 *  유용한경우 = 컴퓨터 공학 전기전자 공학 자료구조 알고리즘에는 필수
		 *  지극히 수학적이다.
		 *   5!(팩토리얼) = 5 x 4 x 3 x 2 x 1 --> 5! = 5 x 4!(4팩토리얼) --> n! = n x (n-1)
		 *   메소드 = 기능상자
		 *   
		 *   재귀의 함수식 정의
		 *  f(n) = n x f (n-1) --> n이 2이상일 경우 출력,,, n=1일 경우 1출력
		 *  수학함수 그대로 옮겨서 사용해도 사용가능 
		 *  
		 *  public static int factorial(int n){
		 *  
		 *   if ( n ==1)
		 *   return 1;
		 *   
		 *   else 
		 *   return n * factorial(n-1);
		 *   
		 *   
		 *  
		 */
	
		System.out.println("3 factorial:"+ factorial(3)); 	//3 부터 1까지 곱
		System.out.println("12 factorial:"+ factorial(12));   // 12부터 1까지 곱셈 
	}
	
	public static int factorial(int n) {
		if (n ==1)
			return 1;		// 재귀의 끝
		else
			return n * factorial(n-1);
	}
		/*	
		 * 재귀 매소드의 실행과정.jpg확인
		 */
}
