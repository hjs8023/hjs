
public class 문제풀이4다시1네번째문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 문제4 다음 계산 결과를 출력하는 프로그램을 작성하되, 덧셈 연산의 횟수를 최소화 하여 작성해보자'
// 3 + 6    3+6+9  3+6+9+12
		 int result = 3 + 6;						// 3+6 = result 
	        System.out.println("3 + 6 = " + result);
	        
	        result += 9;									//result를	 활용한 계산  첫번째result 에 9를 증가(더한다)
	        System.out.println("3 + 6 + 9 = " + result);
	        
	        result += 12;									// result를 활용한 계산  두번쟤 result에 12를 증가(더한다)
	        System.out.println("3 + 6 + 9 + 12 = " + result);
	    
	

	// 덧셈의 수를 최소화하기 위하여 이전 덧셈 결과를 활용하였다. 
		
	}

}
