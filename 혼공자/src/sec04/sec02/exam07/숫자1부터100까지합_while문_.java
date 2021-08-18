package sec04.sec02.exam07;

public class 숫자1부터100까지합_while문_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;		// 합계를 저장할 변수
		
		
		int i = 1;			// 루프 카운터 변수  (i-1)도 포함
		
		while(i<=100) {
			sum +=i;
			i++;
		}
		System.out.println("1~" + (i-1)+ "합:"+ sum);
	}

}
