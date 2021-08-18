package sec04.sec02.exam09;

public class 바깥쪽_반복문종료_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter: for(char upper ='A'; upper<='Z'; upper++) {
			for(char lower = 'a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower =='g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램종료.");    // break Outter
	}

}
