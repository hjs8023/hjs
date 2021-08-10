package sec04.exam04;

public class q를_입력라면_반복종료_ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keycode:"  + keyCode);
			if(keyCode ==113) {
			break;
			}
			}
		System.out.println("종료");
	}

}
