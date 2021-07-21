
public class 문제풀이_메소드의정의_문제1_142P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	정수 둘은 인자로 전달받아서 두수의 사칙연산 결과를 출력하는 메소드와 이 메소드를 호출하는 메인 메소드를 정의해보자 단 나눗셈은 몫과 나머지를 각각출력해야한다.
		
		simpleOpr(7, 3);  // 메소드 이름 선언 및 정수 선언 7,3
	
	}

	 public static void simpleOpr(int n1, int n2) {  // 메소드 이름 작성 및 변수 int n1(7) , n2(3)선언
	 
	        System.out.println("덧셈 결과: " + (n1 + n2));
	        System.out.println("뺄셈 결과: " + (n1 - n2));
	        System.out.println("곱셈 결과: " + (n1 * n2));
	        System.out.println("나눗셈의 몫: " + (n1 / n2));
	        System.out.println("나눗셈의 나머지: " + (n1 % n2));
	 }
}
	/* 
	 *      simpleOpr(7, 3);
    }
    
    public static void simpleOpr(int n1, int n2) {
        System.out.println("덧셈 결과: " + (n1 + n2));
        System.out.println("뺄셈 결과: " + (n1 - n2));
        System.out.println("곱셈 결과: " + (n1 * n2));
        System.out.println("나눗셈의 몫: " + (n1 / n2));
        System.out.println("나눗셈의 나머지: " + (n1 % n2));
    }
}

	 */

