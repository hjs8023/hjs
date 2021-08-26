package sec05.sec02.exam05;
/*
 *이 프로젝트를 그냥실행하면 길이0인 String배열이 매개값으로 전달되기때문에
 *if 조건식이 트루가되어서 if문 블록실행함
 * 매개값을 주고 실행하고 싶으면 
 * 
 * run - runconfigurations - main에서 프로젝트와 메인클래스 확인 - arguments 입력란에 각 10 띄어쓰기 20 입력후 apply -- run
 *  이렇게 되면 args[0] = 10 args[1] = 20 을 얻음 
 *  문자열은 산술연산 불가하기때문에 Integer.parseInt 메소드 이용해서 정수로변환
 */
public class main_메소드의_매개변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	if(args.length != 2) {
		System.out.println("값의 수가 부족합니다.");
		System.exit(0);  			// 프로그램 강제 종료.
	}
		String strNum1 = args[0];		// 첫번째 데이터 얻기
		String strNum2 = args[1];		// 두번째 데이터 얻기
		
		int num1 = Integer.parseInt(strNum1);		// 문자열을 정수로 변환
		int num2 = Integer.parseInt(strNum2);		// 문자열을 정수로 변환
		
		int result = num1 + num2;
		System.out.println(num1 + "+"  +num2 + "=" + result);
	}

}
