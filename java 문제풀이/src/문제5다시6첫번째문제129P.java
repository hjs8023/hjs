
public class 문제5다시6첫번째문제129P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예제 continue.java에 존재하는 while문을 for문으로 변경해보자
		
		int count = 0;  // 그대로사
		
		for(int num = 1; num <= 100; num++) {   //while문을 for문으로 변경 
            if((num % 5) != 0 || (num % 7) != 0)   //  연산 그대로 사용   || 둘중하나라도 true이면 true
                continue;  // 그대로 사용
            count++; 		//그대로 사용
            System.out.println(num);	//그대로 사용
        }
        System.out.println("count: " + count);	//그대로 사용
	}

		/*
		 *    int count = 0;
        
        for(int num = 1; num <= 100; num++) {
            if((num % 5) != 0 || (num % 7) != 0)
                continue;
            count++;
            System.out.println(num);
        }
        System.out.println("count: " + count);
		 */
}
