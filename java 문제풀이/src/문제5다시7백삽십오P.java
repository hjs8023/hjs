
public class 문제5다시7백삽십오P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		//  다음 식을 만족하는 모든 a와 b의 조합을 구하는프로그램을 작성하자
		// AB+BA = 99
		
		/*
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++ ) {
				if((i + j)==99) {
					System.out.println(i + "+" + j + "=" + i+j);
					/*
					 * 십의 자리 숫자 35를 예로 들면 3 * 10 + 5를 계산해야 35가 만들어지기 때문에 그런거 같습니다!

					 앞의 10의 자리를 충족 시키기위해 *10사용 문제의도는  뒷자리 합이 9가되는 i,j구하
					 */
		
	        for(int i = 0; i < 10; i++) {
	            for(int j = 0; j < 10; j++) {
	                if((i * 10 + j) + (j * 10 + i) == 99)
	                    System.out.println(i + ", " + j);
	            }
	        }
		}
		/*
		 * public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                if((i * 10 + j) + (j * 10 + i) == 99)
                    System.out.println(i + ", " + j);
		 */
}
