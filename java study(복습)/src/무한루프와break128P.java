
public class 무한루프와break128P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 * 반복의 조건이 true로 명시되어 해당 반복문을 빠져나가지 못하도록 구성된 반복문을 무한루프 라한다.
			 *  while(true){
			 *  ....
			 *  }
			 *  do {
			 *  ...
			 *  } while(true)
			 *  for문도 반복의 조건을 명시하는 중간 부분에 true를 삽입하면 무한루프가 형성된다.
			 *  그러나 다음과 같이 이 부분을 비워도 그냥 무한루프가 형성된다
			 *  for( ; ;){
			 *  ....
			 *  }
			 *  
			 */
	
			int num = 1; //변수 선언및 초기화
			
			while(true) {
				if(((num % 6)==0) && ((num % 14 )==0)) 	// 6의 배수 14의 배수라면 빠져나가서 num++실
					break;
				num++;
			}
			System.out.println(num);
			
	}

}
