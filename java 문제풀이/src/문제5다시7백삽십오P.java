
public class 문제5다시7백삽십오P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  다음 식을 만족하는 모든 a와 b의 조합을 구하는프로그램을 작성하자 
		// AB+BA = 99
		
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++ ) {
				if((i + j)==99) {
					System.out.println(i + "+" + j + "=" + i+j);
					
				}
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
