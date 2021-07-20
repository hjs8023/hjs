
public class 중첩된반복문을한번에빠져나오는방법레이블을설정하는break문133P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  구구단에서 곱의 결과가 72인 결과를 딱하나만 보여라
		
		for( int  i= 1; i < 10; i++) {		// 바깥쪽  for문
			for(int j = 1; j < 10; j++) {	// 안쪽 for문    안쪽 for문 탈출
				if((i*j)== 72) {
					System.out.println(i + "x" + j + "="+ i*j);
					break;
				}
			}
		}
	}
			/*
			 * 위 예제에서는 곱의 결과가 72일때  break문을 실행한다.
			 * 탈출하는 것은 안쪽  for문이다.
			 * 바깥쪽 for문은 계속 실행이된다.
			 *  실행 결과에서 보이듯이 8과9의 곱에서 끝나지 않고 9와 8의 곱까지 출력되었다.
			 *  그렇다면 바깥쪽 for문까지  탈출하려면 어떻게해야할까? 다음예제에서 보이듯이 
			 *  레이블을 이용해서 빠져나갈 위치를 명시해 주면 된다.
			 *  
			 */
}
