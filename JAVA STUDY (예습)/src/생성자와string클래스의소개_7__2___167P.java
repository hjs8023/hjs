// TODO Auto-generated method stub
		/*
		 *  " hello "  이것도 내부적으로 저장할때 인스턴스로 저장함
		 *  string 클래스 의 인스턴스를 생성함  그곳으로 메소드 정보 및 문자열 들어감
		 *  문자열을 메소드의 인자로 전달할수있다.
		 *  매개변수로 String형 참조변수를 선언하여 문자열을 인자로 전달받을수있다.
		 *  
		 */
public class 생성자와string클래스의소개_7__2___167P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 선언과 동시에 참존변수로 참조한다.
		
		String str1 = "Happy";
		String str2 = "Birthday";
		System.out.println(str1 + " " +str2 );
		
		//메소드에 문자열을 전달하는 다양한 방법을 보여준다.
		printString(str1);
		printString(" ");
		printString(str2);
		printString("\n");
		printString("End of program! \n");
	}
	
	//String 참조 변수를 매게변수로 선언하여 문자열을 전달 받을 수 있다.
	public static void printString(String str) {
		System.out.print(str);
	}

}
