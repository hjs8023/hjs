
public class 문제6_2__값을반환하는메소드의정의__146P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 전달된 값이 소수(Prime number)인지 아닌지를 판단하여 소수인경우
		 * true를,소수가 아닌경우 false를 반환하는 메소드를 정의하고, 이메소드의
		 * 호출결과를 기반으로 1이상 100이하의 소수를 전부 출력하는 main메소드를 정의하자
		 * 
		 * 
		 * 이해 안되었음!!!!!!!
		 * 
		 * -기본적으로 소수는 1과 자기자신으로만 나눠지는 수 이기 때문에, 자기자신 이전에 모든 수의 나머지값이 0이 되면 소수가 아니다.

1.일단 메인 메소드에 1을 출력

2.불린 형태의 메소드를 정의

3.불린변수를 하나 선언해서 일단 트루값으로 둠

4. 2부터 자기자신(처음투입한 변수)까지 실행

5. 2부터 커지는 수가 자기자신 바로 앞까지 오기전에 나머지가 0이 나오면 바로 탈락(펄스)

6.메인 메소드에 트루가 나온 경우에만 출력



출처: https://jeconomics.tistory.com/entry/윤성우-자바-62-문제풀이?category=631808 [IDEA STOCK]

출처: https://jeconomics.tistory.com/entry/윤성우-자바-62-문제풀이?category=631808 [IDEA STOCK]

출처: https://jeconomics.tistory.com/entry/윤성우-자바-62-문제풀이?category=631808 [IDEA STOCK]

출처: https://jeconomics.tistory.com/entry/윤성우-자바-62-문제풀이?category=631808 [IDEA STOCK]



class Prime2 {
 	public static void main(String[] args) {
 		for(int i = 1; i < 101; i++) {
        	    if(isPrime(i))
            		System.out.println(i + " ");
        }
        //isPrime의 값이 참이면 문장을 출력한다.
    }
    
    public static boolean isPrime(int n) {
    	if(n == 1)
        	return false; //1은 소수가 아니다.
            
        for(int i = 2; i < n; i++) {
        	if(n % i == 0)
            	    return false;
        }
        /*
        1로 나누면 나머지는 항상 0이므로 2부터 시작하고
        나눠야 할 수가 1인 경우 소수가 아니라고 설정
        return false로 반복문 조건에 성립하면 값을 반환하며 메소드 종료
        하위 문장들에 의해 값이 변하지 않는다.*/


		 
		for(int i = 1; i <= 100; i++) {   //1이상 100이하의 전부 출력
	           if(isPrimeNumber(i))		// if문으로  프라임넘버선언및 i
	               	System.out.println(i);
	        }
	    }
	    
	    public static boolean isPrimeNumber(int num) {
	        if(num == 1)
	            return false;
	        
	        for(int i = 2; i < num; i++) {
	            if(num % i == 0)
	                return false;
	        }
	        
	        return true;
	    }
	}
	

