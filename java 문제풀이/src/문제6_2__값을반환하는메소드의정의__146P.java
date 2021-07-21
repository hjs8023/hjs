
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
		 */
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
	

