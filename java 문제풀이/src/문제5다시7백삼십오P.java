
public class 문제5다시7백삼십오P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단의 짝수 단인 2, 4, 6, 8 단만 출력하는 프로그램을 작성하되 2단은 2*2까지 4단은 4*4 ,6*6,8*8 까지 출력하도록하자
		
	
				for(int i = 2; i < 10; i+=2) {
					
					for(int j = 1; j<10; j++) {
						System.out.println(i + "x"+ j + "=" + i *j );
						if(j>=i)  // j가 i보다 같거나 크면 다음꺼 실행 2*1,2*2,4*1,4*2,4*3,4*4
							break;
					}
						
					
						
				
					
			
				}
	}
		/*
		 *  for(int i = 2; i < 10; i += 2) {  // 2부터 9까지 i = 2씩 더한다. 가로줄
		 *  
            for(int j = 1; j < 10; j++) { // 세로줄 1부터9까지 j는 1씩증가한다
                System.out.println(i + " x " + j + " = " + (i * j));
                
                if(j >= i)    j가 i보다 같거나 큰가 
                    break;  // 다만족하면 	안쪽 for문 탈출 
		 */
}
