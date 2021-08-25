package sec05.sec02.exam02;

public class 값_목록으로_배열생성_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;							// 인트형 scores배열 생성 
		scores = new int[] {83,90,87};			// 위에서 값을 안넣어줬기때문에 new 연산자 사용해서 값 목록 넣어줌
		int sum = 0;							// int형 합계변수 sum 선언.
		for(int i =0; i<3; i++) {				// for 문으로 83[0] 90[1] 87[2]  까지 더함 
			sum += scores[i];					// scores + i(세번더하기) 해서 합계변수 sum 반환.
		}
		System.out.println("총합:" + sum);
		
		
		int sum1 = add(new int[] {83,90,87});			//  add --> sum1로 
		System.out.println("총합2:" + sum1);				
		System.out.println();
	}
	
	public static int add(int[] scores) {	// 총합을 계산해서 리턴하는 메소드 추가. 위문장에서 끝났기때문에 따로메소드추가. int sum1문장에 메소드기능 추가.
		int sum = 0;
		for(int i =0; i<3; i++) {
			sum += scores[i];
			
		}
		return sum;
	}

}
