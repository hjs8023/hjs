
public class 문제6_2__값을반환하는메소드의정의__145P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// 인자로 원의 반지름 정보를 전달하면, 원의넓이를계산해서 반환하는 메소드와
			// 원의 둘레를 계산해서 반환하는 메소드를 각각 정의하고, 이둘을 호출하는 main메소드를 정의하자
		System.out.println("원 둘레(2.4): " + calCircleRound(2.4));   // 출력문 작성 뒤 원둘레 변수이름 선언및 값 선언
        System.out.println("원 넓이(2.4): " + calCircleArea(2.4));	// 출력문 작성 뒤 원넓 변수이름 선언및 값 선언
    }
    
    public static double calCircleArea(double rad) {    // 원넓이 메소드 생성 후 변수 더블형 선언 및 이름 선언
        final double PI = 3.14;		// 더블형 선언에 값 지정 안했음으로 값지정후  값의 이름및 값지정 pi=3.14
        return rad * rad * PI;    //  3.14 * 2.4제곱   
    }
    
    public static double calCircleRound(double rad) {	// 원둘레 메소드 생성 후 변수 더블형 선언 및 이름 선언
        final double PI = 3.14;
        return rad * 2 * PI;   // 2 * 2.4 * 3.14   
		
	}

}
