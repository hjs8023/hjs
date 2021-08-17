package sec04.sec01.exam04;

public class 주사위번호뽑기 {
/*
 * Math.random()메소드는 0.0과 1.0사이에 속하는 double타입의 난수 하나를 리턴
 * 0.0은범위포함 1.0은 범위 안포함
 * 1~10사이 정수 중 하나의 정수얻으려면 각변에 10을곱해서 0.0 ,,10.0만들고
 * 각변을 int타입으로 강제타입변환
 * 이상태에서 각 변에 1을더하면 비로소 1~10사이의 정수 얻게된다
 * ex: int num = (int) (Math.random() * n) + start;
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int) (Math.random() *6 )+1;  // 주사위 번호 하나 뽑기
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}else if (num==2) {
			System.out.println("2번이 나왔습니다.");
		}else if (num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if (num==4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}
	}

}
