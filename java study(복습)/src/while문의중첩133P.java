
public class while문의중첩133P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 2;
		int j;
		
		while(i < 10) {
			j = 1;
			while(j < 10) {
				System.out.println(i + "x" + j + " =" + (i*j));
				j++;
			}
				i++;
		}
	}
		/*
		 * for문을	중첩해서 구현했을 때보다 코드의 구성이 복잡하다.
		 * 때문에 반복문을 중첩할 때에는 for문을 우선으로 고려하기 바란다.
		 * 
		 */
}
