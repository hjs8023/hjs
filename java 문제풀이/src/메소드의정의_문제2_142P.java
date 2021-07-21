
public class 메소드의정의_문제2_142P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 정수 둘을 인자로 전달 받아서 두수의 '차의 절대값을 계산하여 출력하는
		 * 메소드와 이 메소드를 호출하는 메인 메소드를 정의해보자 단 메소드 호출시 전달되는 값의 
		 * 순서에 산관없이 절대값이 계산되고 출력되어야한다.
		 * 
		 * 절대값 = 어떤수를 양수로 만들어주기 위한장치 -3이면 3으로
		 */
		simple(5,3);
	}
		
	public static void simple(int n1,int n2) {
		if(n1 > n2)				//  if else 문 사용
			System.out.println(n1 -n2);  // 트루면 if절을  
		else  //  false면 else절을 실행 
		System.out.println(n2-n1);
	}
	
/*
 * public static void main(String[] args) {
        abs(7, 3);
        abs(-5, -3);
        abs(4, -3);
    }
    
    public static void abs(int n1, int n2) {
        if(n1 > n2)
            System.out.println(n1 - n2);
        else
            System.out.println(n2 - n1);
    }
}
 */
}
