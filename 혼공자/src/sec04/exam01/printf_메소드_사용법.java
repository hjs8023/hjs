package sec04.exam01;

public class printf_메소드_사용법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 123;
		System.out.printf("상품의 가격:%d원\n",value);
		System.out.printf("상품의 가격:%6d원\n",value);   //왼쪽 빈자리 공백 ___123
		System.out.printf("상품의 가격:%-6d원\n",value);	// 오른쪽 빈자리 공백 123___
		System.out.printf("상품의 가격:%06d원\n",value);	// 왼쪽 빈자리 0채움 000123
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n",10,area);	// 소수점 7자리, 소수점 이하 2자리 왼쪽빈자리 공백 ____314.16
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n",1,name,job);	// 여섯자리정수 ,  열자리 문자열 오른쪽 빈자리 공배, 열자리문자열 왼쪽 빈자리공백
	}

}
