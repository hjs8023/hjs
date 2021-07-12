
public class 실수선언44p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2; // 두개의 변수 동시 선언
		double result;
		num1 = 1.0000001;
		num2 = 2.0000001;
		result = num1 + num2; // result =결과를 뜻함
		System.out.println(result);
		
		/* 표현하고자 하는 값의 범위에 따라 적절한 자료형을 선택 할수 있도록 하기위함이다.
		 * 기본적으로 컴퓨터의 실수 표현에는 오차가 존재한다.
		 * 변수에 저장되는 값은 이에 가까운 값일 뿐 정확한 숫자는아니다
		 * 자바는 대소문자를 구분하다 num1 Num1 은 다르다 
		 * 변수의 이름은 숫자로 시작할수 없다 $_이외의 다른특수문자는 변수이름 사용 불
		 * 키워드는 변수의 이름으로 사용 할수 없다.
		 */
	}

}
