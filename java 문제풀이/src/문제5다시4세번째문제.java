
public class 문제5다시4세번째문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//1000이하 자연수 중에서 2의 배수이자 7의 배수인 수를 출력하고 그 수들의 합을 구해서 출력하는 
			// 프로그램을 while문을 이용해서 작성해보자		int num = ;
			int num = 1;
			int sum = 0;
			
			
			while(num <= 1000) {   // num이 1000보다 같거나 작을때까지 실행 
				if((num %2) == 0 && (num % 7) == 0) {  // if 문사용 논리연산자 &&사용  %:왼쪽 피연산자 오른쪽 피연산자 나누고 나머지값 반환  ==(같은가) 나눠지면 배수 아니면 배수아
					System.out.println(num);
					sum += num;   // sum = sum + num
				}
				num++;  // num 1씩증가
			}
			  System.out.println("합: " + sum);
	}
 /*
  * while(num <= 1000) {
            if((num % 2) == 0 && (num % 7) == 0) {
                System.out.println(num);
                sum += num;
            }
            num++;
        }

        System.out.println("합: " + sum);
  */
}
