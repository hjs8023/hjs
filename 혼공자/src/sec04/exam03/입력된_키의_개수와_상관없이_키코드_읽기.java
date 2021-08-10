package sec04.exam03;

public class 입력된_키의_개수와_상관없이_키코드_읽기 {

	public static void main(String[] args)	throws Exception { 
		// TODO Auto-generated method stub
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keycode:"  + keyCode);
		}
	}

}
