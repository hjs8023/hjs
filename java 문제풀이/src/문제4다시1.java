
public class 문제4다시1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 문제 1  int형 변수 num1,num2,num3에 각각 10,20,30이 저장된 상태에서 다음문장을 실행 하면 변수에는 각각 얼마나 저장되겠는가
		// num1 = num2 = num3;
			int num1 = 10;
			int num2 = 20;
			int num3 = 30;
				num1 = (num2 = num3);  //이연산자는 오른쪽에서 왼쪽으로 연산하는 결합방향을 지녔
				
					System.out.println(num1);
					System.out.println(num2);	
					System.out.println(num3);
		
	}

}
