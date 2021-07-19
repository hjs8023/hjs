
public class 브레이크앤드컨티뉴문125P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  break와 continue는 실행 흐름의 조절을 목적으로 반복문 내에 삽입
		 *  break문은 반복분을 빠져나가는 용됴로도 사용된다. 
		 *  if문과 함게 사용되어 특정 조건이 만족될때, 이를 감싸는 반복문을 빠져나가도록 구성
		 */	
	
			int num = 1;
			boolean search = false;
			
			// 처음 만나는 5의 배수이자 7의 배수인 수를 찾는  반복문
			while(num < 100) {
				if(((num % 5) ==0) && ((num % 7)==0)) {		// 5의 배수와 7의 배수 찾는 문장
					search = true;
					break;  	//while문을 탈출
				}
				num++;   //  num < 100  --->
			}
			
			if (search)
				System.out.println("찾는 정수:" + num);
			else
				System.out.println("5의 배수이자 7의 배수인 수를 찾지 못했습니다.");
	
	}
	  		/*
	  		 * break 문이 실행되면 가장 근접한 거리에서 자신을 감싸고 잇는 반복문을 찾아서 해당 
	  		 * 반복문을 빠져나간다. 그리고 이어서 그다음 문장을 실행하게된다.
	  		 */
}
