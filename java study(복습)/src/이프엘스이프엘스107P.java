
public class 이프엘스이프엘스107P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 120;
		
		if(num < 0) // 먼저 검사
			System.out.println("0 미만");
		else if (num < 100)   // 위 조건이 만족되지 않으면 여기서 다시검사
			System.out.println("0이상 100미만");
		else  //  아무것도 만족되지 않으면 else에 속한 문장실행
			System.out.println("100이상");  // 위조건 다부합하지않음으로 이문장 실행
		
		//  조건 검사는 위에서 아래로 진행이된다.
		// 영역별로 실행할 문장이 둘이상이 경우 중괄호로 해당영역 묶어줘도 되지만 위문장은 조건에따라 실행할 하나의 문장이기 때문에 중괄호 생략
		
	}

}
