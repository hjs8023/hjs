
public class 문제5다시4두번째문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 100까지 출력하고 이어서 거꾸로 100에서 1까지 출력하는 프로그램을 작성해보자
		// 가급적 while문과 do~while문을 한번씩 사용해서 구현하자.
		int num = 0;
		
		while(num < 101) {
			System.out.println(num);
			num++;
		}
		
		int num2 = 1;
		
		do {
			System.out.println(--num2);
		}while(num2 > 1);
	}
  /* int num = 1;
         
        while(num <= 100)
            System.out.println(num++);
        
        do {
            System.out.println(--num);
        } while(num>1);
        /*
         * 
         */
}
