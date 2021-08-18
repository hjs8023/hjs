package sec04.sec02.exam02;

public class 숫자1부터100까지합을출력for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;		//  합계 변수
		
		for(int i =1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100 합:"+ sum);
	}

}
