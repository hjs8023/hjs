package sec02.sec04.exam04;

public class q를_입력라면_반복종료_ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int keyCode;		
		
		while(true) {
			keyCode = System.in.read();		// 시스템 리드 인 단점은 키코드를 하나씩 읽어서 2개 이상의 키가 조합된 한글을 읽을수없음
			System.out.println("keycode:"  + keyCode);
			if(keyCode ==113) {		// keycode가 113일 경우 while 반복문을 중지함  키코드 113 = q
			break;
			}
			}
		System.out.println("종료");
	}

}
