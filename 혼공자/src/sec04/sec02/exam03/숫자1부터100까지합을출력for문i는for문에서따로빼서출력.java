package sec04.sec02.exam03;

public class 숫자1부터100까지합을출력for문i는for문에서따로빼서출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum = 0;		//  합계 변수
		int i = 0;	//	루프 카운터 변수
		for( i =1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~"+ (i-1) + "합:" + sum);
	}

}
