
public class 반복문의중척5다시오130P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 하나의 문장 안에 다른 문장을 삽입 할수 있음
		 * 하나의 반복문 안에 다른 반복문이 삽입된경우 반복문의 중첩이라함
		 * 가장 흔히 사용하는 for문의 중첩, 그리고 while문의 중첩을 대상으로 반복문의 중첩을 진행해보겠다
		 * 활용도가 높고 이해하기 좋은 것이 for문의 중첩이
		 */
		
			for(int i = 0; i < 3; i++) { // 바깥쪽 for문		// 가 0,1,2
				System.out.print("----------");
				for(int j = 0; j < 3; j++) {// 안쪽 for문  // 세 0,1,2
					System.out.print("["+ i + ","+j+"]");
					
				}
					System.out.print('\n');
		}
	}
}
