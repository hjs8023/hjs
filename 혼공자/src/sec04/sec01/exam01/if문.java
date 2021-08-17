package sec04.sec01.exam01;

public class if문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은  A입니다.");
		}
		
		if(score<90)   // 중괄호{없어서 15라인까지만 영향있고 밑에 등급b는 그냥 들여쓰기되어서 출려
			System.out.println("점수가 90보다 작습니다"); 
			System.out.println("등급은 B입니다");   //if문과는 상관없는 실행문
		}
		
}
