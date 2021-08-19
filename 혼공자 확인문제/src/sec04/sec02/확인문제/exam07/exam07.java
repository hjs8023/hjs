package sec04.sec02.확인문제.exam07;

import java.util.Scanner;

/*
  *  while문과 Scanner를 이용해서 키보드로 입력된 데이터로 예금 출금 조회 종료 기능을 제공하는 코드를 작성해보세요.
  *  프로그램을 실행하면 다음과같은 실행결과가 나와야 합니다. (Scanner의 nextLine()사용)
  *  
  */
public class exam07 {

	
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1.예금: 2.출금: 3.잔고: 4.종료");
			System.out.println("------------------------");
			System.out.println("선택> ");
			
			int menuNum = Integer.parseInt(scanner.nextLine());		// int형 변수 menuNum 선언후 --> 문자열 형을 기본형으로 변경해주는 integer.parseint 선언 그리고 consol에서 읽을수있도록 scanner.nextLine()선언
			
			switch (menuNum) {					// switch문 사용해서 원하는 case 골라서 System.in 하고 case4애서는 종료해야하므로 강제로 false 선언후 case4 빠져나오고 프로그램종료
			case 1:
				System.out.print("예금액>");			//	S.o.p (예금액)
				balance += Integer.parseInt(scanner.nextLine());	// 문자열 형 (int)기본값 으로 변경해주는 변수선언 콘솔과 스캐너에서 읽을수있도록 nextLine 선언
				break;
			
			case 2:
				System.out.print("출금액>");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.print("잔고>");
				System.out.println(balance);		
				break;
			case 4:
				run = false;
				break;
				
			}
			System.out.println();				// -->?
		}
		System.out.println("프로그램종료.");
	}
}
