package sec02.sec04.exam03;

public class 입력된_키의_개수와_상관없이_키코드_읽기 {

	public static void main(String[] args)	throws Exception { 
		// TODO Auto-generated method stub
		int keyCode;			// 입력된 키의 개수와 상관없이 키코드를 모두읽는다.
		
		while(true) {			// while 반복문사용  9~11 라인 무한  반복 실행  
			keyCode = System.in.read();
			System.out.println("keycode:"  + keyCode);
		}
	}

}
