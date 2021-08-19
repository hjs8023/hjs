package sec04.sec02.확인문제.exam02;
/*
 *  for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는
 *  코드를 작성해보세요
 */
public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;				// 합계 변수 선언
		
		
		
		for( int  i = 1; i<=100; i++) {
			sum += i;		//sum = sum+i와 동일
			if(i%3 ==0) {
			
			}
		}
		System.out.println("1~100 3의 배수 합:" +sum);
	}

}
