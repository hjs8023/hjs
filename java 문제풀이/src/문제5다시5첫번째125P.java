
public class 문제5다시5첫번째125P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 10까지의 곱의 결과를 출력하는 프로그램문을 for문을 이용해서 작성해보자
			int result = 1;
		
		for(int num = 1; num < 11; num++ )
			result *= num;   //  result * num = 
		System.out.println("1~10까지의 곱: " + result);
	}

			/*
			 * int result = 1;
        for(int i = 1; i <= 10; i++)
            result *= i;
        
        System.out.println("1~10까지의 곱: " + result);
			 */
}
