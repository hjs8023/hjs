package sec02.sec03.exam05;

public class 연산식에서_자동_타입_변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;  --> 컴파일 에러
		int intValue1 = byteValue1  + byteValue2;
		System.out.println(intValue1);
		
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charvalue3 = charValue1 + charValue2; --> 컴파일 에러
		int intValue2 = charValue1 + charValue2;
		System.out.println(intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		// int intValue6 = 10 / 4.0; -->컴파일 에러
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1 ;
		int y = 2;
		double result = (double) x/y;
		System.out.println(result);
	}

}
