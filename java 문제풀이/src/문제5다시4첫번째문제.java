
public class 문제5다시4첫번째문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문제 1부터 99까지의 합을 구하는 프로그램을 작성하되 while문을 사용하여 작성해보자
		 int num = 1;
		 int sum = 0;    
		 
		 while (num < 100) {  // 조건 충족 되면 중괄호 실행 
			 sum += num;   //sum = sum + num  --> sum +=num  (덧셈대입) //묻고 더블로  0 + 1 = 1 , 0 + 2 =2 
			 num++;   				//	sum(1)	= 0	+1
		 }							//	sum(3)	= 0	+2
		 System.out.println(sum);
	}
			/*
			 * int num = 1;
        int sum = 0;
    
        while(num<100) {
            sum += num;
            num++;
        }
        
        System.out.println(sum);
			 */
}
