
public class 매게변수가두개인메소드및매게변수없는메소드__141P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  매게 변수의 선언이 둘 이상이 될 수 있음을 보인다
		//값의 전달이 불필요한  경우에는 메소드의 메개 변수 선언을 생략 할수있다.
		//물론 메소드를 호출 할때에는 다음과 같이 전달하는 값이 없어야한다. (byeveryone();)
		
		double myHeight = 175.9;
		hiEveryone(12,12.5);  //인자 12와 12.5의 전달
		hiEveryone(13,myHeight); 	//인자 13과 변수 myHeight에 저장된값 전달
		byEveryone(); 	//전달하는 인자없음
	}
		
	public static void hiEveryone(int age, double height) {  // 두개의 변수
			System.out.println("제 나이는 " + age + "세입니다.");  // 12세입니다 실행 1순위 ,,, 13세입니다 실행3 순위
			System.out.println("저의 키는" +height + "cm 입니다."); // 12.5cm입니다 실행 2순위,,,  175.9cm입니다 실행 4순위
			
		}
				
		public static void byEveryone() {
			System.out.println("다음에 뵙겠습니다."); // 실행 5순위
		
		}
		
	}

