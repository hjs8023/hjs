package sec04.sec01.exam06;

public class break문이없는case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = (int) (Math.random() *4) +8; // 8<= 11사이의 정수 뽑기
		System.out.println("[현재시각 :" + time + "시]");
		
		switch(time) {
		case 8:
			System.out.println("출근 합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			 System.out.println("업무를 봅니다.");
			 default:
			System.out.println("외근을 나갑니다.");
		}
	}

}
