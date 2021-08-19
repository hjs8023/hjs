package sec04.sec02.exam08;

public class break문으로_while문종료 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {			// 무한루프
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if(num ==6) {
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}

}
