
public class 문제5다시6두번째문제129P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자연수 1부터 시작해서 모든 홀수를 더해나간다.
		// 그리고 그합이 언제(몇을 더했을 때) 1000을 넘어서는지, 그리고 1000을 넘어선 값은 얼마가 되는지 계산하자
		
		int sum = 0;  // 변수 선언 및 초기화
        int num = 1; 	// 변수 선언 및 초기화
    
        while(true) {		// while 문 선언 
            if(num % 2 != 0)		//  num % 2 가 0이랑 다른가  나눴을때 나머지값이 0이아니면 홀수다.
                sum += num;		// sum + num =  ,,, 반복 더하기 ex: 3 + 5 + 7+ 9

            if(sum > 1000) {	//  if문 반복횟수지정 
                System.out.println(num + " 더할 때 1000을 넘는다.");
                System.out.println("초과된 값: " + sum);
                break;
            }
        }
	}
}
		/*
		 *  int sum = 0;
        int num = 1; 
    
        while(true) {
            if(num % 2 != 0)
                sum += num;

            if(sum > 1000) {
                System.out.println(num + " 더할 때 1000을 넘는다.");
                System.out.println("초과된 값: " + sum);
                break;
            }
            
            num++;
		 */

