
public class 재귀매소드의정의_6_3___154P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인자로 정수n을 전달 받아서 2의 n승을 계산하여 반환하는 매소드를 재귀의 형태로 정의하고
		// 이를 호출하는 main메소드를 정의해보자
	    System.out.println("2의 5승 : " + powerOfTwo(5));  // 2의n승 출력 선언 및 표시 설정및 변수 ,변수값설
        System.out.println("2의 7승 : " + powerOfTwo(7));
    }
    
    public static int powerOfTwo(int n) {   // 변수메소드 선언및  정수 선언  
        if(n == 0)				// if문 사용  n이 0과같다면  1 반환 
            return 1;
        
        return 2 * powerOfTwo(n - 1);  // 2의 5승  2의 7승 반환  
    }
    	/*
    	 *n =5 
    	 *if(n == 0) 5가 0이 될때까지 재귀 함수 반복 
    	 
    	 	if == 트루이기때문에 1반환
    	 	2 * 2 * 2 * 2 * 2 * 1 
    	 	factor(5) = 2*(factor(4)) = 2*(2*(factor(3))) = ... = 2*2*2*2*2*1 = 2^5
    	 	factor5 다섯번 실행이므로 2 다섯번 곱하면 32 
    	 
    	 	return 2 * (n-1);이 아니라
return 2 * powerOfTwo(n-1);

powerOfTwo(5);
-> return 2 * powerOfTwo(4);
-> return 2 * 2 * powerOfTwo(3);
-> return 2 * 2 * 2 * powerOfTwo(2);
-> return 2 * 2 * 2 * 2 * powerOfTwo(1);
-> return 2 * 2 * 2 * 2 * 2 * powerOfTwo(0);
-> return 2 * 2 * 2 * 2 * 2 * 1;
-> 32
2 * powerOfTwo(n - 1)

f(x) =
{ 2 * f(x-1) (x > 0)
{ 1 (x = 0)일 때,

f(0) = 1
f(1) = 2 * f(1-1) = 2 * f(0) = 2 * 1 = 2
f(2) = 2 * f(2-1) = 2 * f(1) = 2 * 2 = 4
f(3) = 2 * f(3-1) = 2 * f(2) = 2 * 4 = 8
f(4) = 2 * f(4-1) = 2 * f(3) = 2 * 8 = 16
f(5) = 2 * f(5-1) = 2 * f(4) = 2 * 16 = 32
    	 */
}

	

