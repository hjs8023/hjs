
public class 변수의스코프6_2__146P {

	public static void main(String[] args) {  // 전체 영역 1
		// TODO Auto-generated method stub
		/*
		 *  지역변수라고 함 
		 *  중괄호 벗어나면 완전히빠져나가면 메모리에서 할당됐다가 소멸됨
		 *  속한 영역(중괄호)을 벗어나면 지역변수 소멸
		 *  매게 변수도 지역변수에 포함 
		 *  
		 */
		
		boolean ste = true;
		int num1 =11;
		
		if(ste ) {   		// 영역 2
			// int num1 = 22;     // 주석 해제하면 컴파일 오류 발생  ,,, 같은 영역내에서 동일 이름의 변수 선언불가
				num1++;
				System.out.println(num1);
		}
		int num2 = 33;		// 영역 3
			num2++;
			System.out.println(num2);
	}
	// System.out.println(num2);	//	// 주석 해제하면 컴파일 오류 발생
	

}
