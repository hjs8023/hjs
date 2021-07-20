
public class 구구단출력for문반복중첩문132P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++)
				System.out.println(i + "x" + j + "=" + (i*j));
		}
	}
	/*
	 * 코드는 몇줄 되지 않는다. 그럼에도 불구하고 구구단의 전체 출력이라는 일을 해내고 있다
	 * 반복분의 중첩이 갖는 장점이다.
	 */
}