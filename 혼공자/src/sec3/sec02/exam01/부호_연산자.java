package sec3.sec02.exam01;

public class 부호_연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1="+ result1);
		System.out.println("result2="+ result2);
		
		byte b = 100;
		// byte result3 = -b;  컴파일에러 int값으로 변경해줘야함
		int result3 = -b;
		System.out.println("result3 ="+result3);
	}

}
