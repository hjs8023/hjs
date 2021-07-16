
public class 문제풀이4다시1다섯번째문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 5 변수n1,n2,n3가 다음과 같을때 n1>n2>n3 이면 true, 아니면 false를 출력하는 프로그램을 만들어보
		// num1 = ((25 +5)+ (36 / 4) - 72)*5;,,, num2 = ((25 *5) + (36 -4) + 71)/4;	,,,  num3 = (128 / 4) * 2;   n1= -165 n2=57 n3=64
		int num1 = ((25 +5)+ (36 / 4) - 72)*5;
		int num2 = ((25 *5) + (36 -4) + 71)/4;	
		int num3 = (128 / 4) * 2;
		
		boolean result;
		result = (num1 > num2) && (num2 > num3);
		System.out.println(result);
		
	}		
}
