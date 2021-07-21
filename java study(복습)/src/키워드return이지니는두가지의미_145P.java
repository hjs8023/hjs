
public class 키워드return이지니는두가지의미_145P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divide(4,2);
		divide(6,2);
		divide(9,0);
	}
	
	public static void divide(int num1, int num2) {
		if(num2 ==0) {    // num2가 0과 같다면 
			System.out.println("0으로 나눌수 없습니다."); // 1. 출력.
			return; //값의 반환없이 메소드만 종료  2.종료
		}
			System.out.println("나눗셈 결과:"+(num1  /num2));
	}

}
