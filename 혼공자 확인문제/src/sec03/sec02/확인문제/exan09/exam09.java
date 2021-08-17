package sec03.sec02.확인문제.exan09;
/*
 * 키보드로  두 실수를 다음과 같이 입력받습니다.(Scanner이용) 입력된  첫번째 수에 두번째
 * 수를 나눈 결과를 "결과 : 값"으로  출력하되. 두번째 수에 0또는 0.0이 입력되었을 경우 "결과:무한대"가 출력되도록
 * 코드를 작성해보세요(scanner의 next()사용).
 */
import java.util.Scanner;
public class exam09 {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		
		
			System.out.println("첫 번째 수: ");
			double num1 = Double.parseDouble(scanner.nextLine());   //  문자열을 기본타입으로 변환하는것. 키보드에서7.3입력시 문자열에서 콘솔에서 7.3나타나면 기본현 d7.3나오게끔 하는 변수 Double.parseDouble
			
			
			System.out.println("두 번째 수: ");
			double num2 = Double.parseDouble(scanner.nextLine());
			
			System.out.println("---------------");
			if(num2 != 0.0) {
				System.out.println("결과 :" + (num1/num2));
				
		} else {
			System.out.println("결과: 무한대");
		}	
	}
	
}
