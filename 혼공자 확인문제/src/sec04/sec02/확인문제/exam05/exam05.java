package sec04.sec02.확인문제.exam05;

public class exam05 {
	/*
	 *	for문을 이용해서 다음과 같이 *을 출력하는 코드를 작성해보세요
	 * *
	 * **
	 * ***
	 * ****
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i<5; i++) {
			for(int j =1; j<=i; j++) {
				System.out.print("*");
				if(i==j) {
					System.out.println();
				}
			}
			
		}
	}
}
