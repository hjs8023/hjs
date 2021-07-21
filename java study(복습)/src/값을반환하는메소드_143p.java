
public class 값을반환하는메소드_143p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result;
		result = adder(4,5);  // adder가 반환하는 값을 result에 저장  adder 메소드 만들어줘여
			System.out.println("4 + 5 =" + result);    //  
			System.out.println("3.5 x 3.5 =" + square(3.5));   // Square 메소드 만들어줘야함
	}
	
	public static int adder(int num1 ,int num2) {
		int addResult = num1 + num2;
		return addResult; //addResult의 값을  반환
	
	}
	
	public static double square(double num) {
		return num * num;	//num *num의 결과를 반환
	}
		/*
		 * void라는 키워드가존재하는다 이는 이메소드는 값을 반환하지않는다.라는의미
		 * adder 메소드는 int형 값을 반환합니다
		 *	Square 메소드는 double형 값을 반환합니다.
		 * adder 메소드의 왼편에 존재하는 반환형(int)(반환하는 값의자료형)
		 * 다른하나 return(값의반환을 명령)
		 * return : 값으 반환해라 addResult에 저장된값을 반환해라
		 * result = adder(4,5); -->result = 9;  값이 반환된 이후의 상
		 */ 
}
