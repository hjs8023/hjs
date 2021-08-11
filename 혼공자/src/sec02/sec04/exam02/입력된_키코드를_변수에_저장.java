package sec02.sec04.exam02;

public class 입력된_키코드를_변수에_저장 {

	public static void main(String[] args) throws Exception {  // throw Exception --> 예외처리 코드
		// TODO Auto-generated method stub
		
		int keyCode; 
		
		keyCode = System.in.read();   	// 콘솔뷰에서 a를 누르고 엔터누르면 97 나오고 다시엔터 누르면 엔터에대한 키코드 13,10 반환
		System.out.println("keyCode:"  + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode:"  + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode:"  + keyCode);
		

	}

}
