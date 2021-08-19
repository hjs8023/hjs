package sec04.sec02.확인문제.exam06;

public class exam06 {

	/*
	 *	for문을 이용해서 다음과 같이 *을 출력하는 코드를 작성해보세요
	 * ****
	 * ***
	 * **
	 * *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int j =1; j<5; j++) {				// j 1부터 4까지 증감 j=1 선언되면 i = 4,3,2,1까지 수행,,
		for(int i =4; i>0; i--) {				//j=2선언되면 i = 4,3,2,1실행  J<I 보다크면 if문 작으면 else문 실행 
				if(j<i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
		System.out.println();
			
		}
	}
}


