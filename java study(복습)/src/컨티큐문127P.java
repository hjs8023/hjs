
public class 컨티큐문127P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 컨티뉴문은 반복문의 탈출과 거리가 멀다  컨티뉴문은 실행하던 반복문의 나머지
		 * 부분을 생략하고 프로그래밍의 흐름을 조건 검사 부분으로 이동시킨다.
		 * 
		 * 브레이크문은 while문 탈출후 다음 문장으로 컨티뉴문은  while문(조건검사로이동)
		 * 
		 * 반복문의 나머지 부분을 실행하지 않고 반복문의 맨위로 이동을하여 조건검사부터 
		 * 실행을 이어나간다.(단 do~while문의 경우 조건 검사가 위치한 맨 아래로 이동한다.)
		 */

			int num = 0;   // 변수선언 및 초기화 
			int count = 0;  // 변수선언 및 초기화 
			
			while((num++) < 100) {  //while문 실행 및 반복 횟수 지정 
				if(((num % 5)!=0) || ((num % 7)!=0)) // 5의 배수 7의 배수 찾는 과정 %: num 오른쪽  숫자로 나눴을때 0으로떨어지면 ok
					continue;  // 5와 7의 배수 아니라면 나머지 건너뛰고 위로 이동
				count++; //5와 7의 배수인 경우만 실행   // 35,70  총 두개 카운트 
				System.out.println(num); // 5와 7의 배수인 경우만 실행  35, 70 각각 반환
			}
			System.out.println("count"+count); //count : 2 를 반환
	}
	

}
